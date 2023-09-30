package org.example.livestudy;

import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;

public class GithubApi {

    public void connectGithub(String token) throws IOException {
        GitHub github = new GitHubBuilder()
                .withOAuthToken("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").build();
        github.checkApiUrlValidity();
    }
}
