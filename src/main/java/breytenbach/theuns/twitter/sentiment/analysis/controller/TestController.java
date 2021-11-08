package breytenbach.theuns.twitter.sentiment.analysis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PostMapping("/start")
    String start() {
        return "analysis complete";
    }

    @GetMapping("/results")
    String results() {
        return "no results found";
    }
}
