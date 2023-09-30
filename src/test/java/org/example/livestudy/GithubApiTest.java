package org.example.livestudy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GithubApiTest {

    GithubApi githubApi = new GithubApi();

    @Test
    void connectGithub() {
        String token = "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";
        try {
            githubApi.connectGithub(token);
        } catch (Exception e) {
            fail();
        }
    }
}