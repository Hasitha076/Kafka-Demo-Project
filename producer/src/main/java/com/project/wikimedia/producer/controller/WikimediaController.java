package com.project.wikimedia.producer.controller;

import com.project.wikimedia.producer.model.Wikimedia;
import com.project.wikimedia.producer.producer.WikimediaProducer;
import com.project.wikimedia.producer.service.WikimediaServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/wikimedia")
@RequiredArgsConstructor
public class WikimediaController {

    private final WikimediaProducer wikimediaProducer;
    private final WikimediaServiceImpl wikimediaService;

//    @PostMapping
//    public void startPublishing(@RequestBody String message) {
//        wikimediaProducer.sendMessage(message);
//    }

    @GetMapping("/getData")
    public List<Wikimedia> getWikimediaData() {
        return wikimediaService.getWikimediaData();
    }

    @PostMapping("/saveData")
    public void saveWikimediaData(@RequestBody Wikimedia wikimedia) {
        wikimediaService.saveWikimediaData(wikimedia);
    }

    @GetMapping("/getDataById/{id}")
    public void getWikimediaDataById(@PathVariable int id) {
        Wikimedia data = wikimediaService.getWikimediaDataById(id);
        wikimediaProducer.sendMessage(data);
    }
}
