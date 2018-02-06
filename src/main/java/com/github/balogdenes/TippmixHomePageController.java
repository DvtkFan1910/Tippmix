package com.github.balogdenes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TippmixHomePageController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}

