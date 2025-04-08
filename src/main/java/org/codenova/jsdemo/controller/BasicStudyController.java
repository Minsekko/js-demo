package org.codenova.jsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/day01")
public class BasicStudyController {

    @GetMapping("/intro")
    public String introHandle() {

        return "day01/intro";
    }

    @GetMapping("/example01")
    public String example01Handle() {

        return "day01/example01";
    }

    @GetMapping("/example02")
    public String example02Handle() {

        return "day01/example02";
    }

    @GetMapping("/example03")
    public String example03Handle() {

        return "day01/example03";
    }

    @GetMapping("/example04")
    public String example04Handle() {

        return "day01/example04";
    }

    @GetMapping("/example05")
    public String example05Handle() {

        return "day01/example05";
    }

    @GetMapping("/example06")
    public String example06Handle() {

        return "day01/example06";
    }
}
