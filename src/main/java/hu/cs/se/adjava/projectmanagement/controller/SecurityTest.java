package hu.cs.se.adjava.projectmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityTest {

    @GetMapping("/test")
    public String testIt() {
        return "Testing done";
    }
}
