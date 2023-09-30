package org.example.livestudy;

import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        App app = new App();
        app.printBoard();
    }

    void printBoard() throws IOException {
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
    }
}
