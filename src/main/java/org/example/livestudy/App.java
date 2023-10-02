package org.example.livestudy;

import org.kohsuke.github.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class App {

    public static void main(String[] args) throws IOException {
        App app = new App();
        app.printBoard();
    }

    private void printBoard() throws IOException {
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");

        List<Participant> participants = new ArrayList<>();

        for (int index = 1; index <= 15; index++) {
            GHIssue issue = repository.getIssue(index);
            List<GHIssueComment> comments = issue.getComments();

            for (GHIssueComment comment : comments) {
                Participant participant = findParticipant(participants, comment.getUserName());
                participant.markHomeworkIsDone(index);
            }
        }

        participants.sort(Comparator.comparing(p -> p.userName));
        participants.forEach(p -> {
            System.out.printf("| %s %s | %.2f%% |\n", p.userName, checkMark(p), p.getRate(18));
        });
    }

    private Participant findParticipant(List<Participant> participants, String userName) {
        if (isNewUser(participants, userName)) {
            Participant participant = new Participant(userName);
            participants.add(participant);
            return participant;
        } else {
            Optional<Participant> first = participants.stream().filter(p -> p.userName.equals(userName)).findFirst();
            return first.orElseThrow();
        }
    }

    private String checkMark(Participant p) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < 19; i++) {
            if (p.homeworkResults.containsKey(i) && p.homeworkResults.get(i)) {
                result.append("|:white_check_mark:");
            } else {
                result.append("|");
            }
        }
        return result.toString();
    }

    private boolean isNewUser(List<Participant> participants, String userName) {
        return participants.stream().noneMatch(p -> p.userName.equals(userName));
    }

}
