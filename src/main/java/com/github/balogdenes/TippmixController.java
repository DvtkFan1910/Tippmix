package com.github.balogdenes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/tippmix")
public class TippmixController {

    @Autowired
    private EventFromTippmixDownloader eventFromTippmixDownloader;

    @RequestMapping("/events")
    public List<Event> events() throws IOException {
        return eventFromTippmixDownloader.getEventData();
    }
}
