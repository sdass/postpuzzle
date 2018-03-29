package com.subra.postpuzzle.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sdass on 3/29/2018.
 */

@RestController
public class ExptController {

    private static Logger log = LoggerFactory.getLogger(ExptController.class);
    @GetMapping("/hello")
    public String getHello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
        String greet = String.format("{ message: [get] Hello %s! }", name);
        log.info("greet=" + greet);
        return greet;
    }

    @PostMapping("/hello")
    public String postHi(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
        String greet = String.format("{ message: [post] Hi %s! }", name);
        log.info("greet=" + greet);
        return greet;
    }
}
