package org.jonathonstephens.languageprojectblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/forum")
    public String forum() {
        return "forum";
    }

    @GetMapping("/profile")
    public String profile() {
        return "profile";
    }

}
