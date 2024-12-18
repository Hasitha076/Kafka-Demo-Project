package com.project.wikimedia.producer.controller;

import com.project.wikimedia.producer.producer.WikimediaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/wikimedia")
@RequiredArgsConstructor
public class WikimediaController {

    private final WikimediaProducer wikimediaProducer;

    @PostMapping
    public void startPublishing(@RequestBody String message) {
        wikimediaProducer.sendMessage(message);
    }
}
