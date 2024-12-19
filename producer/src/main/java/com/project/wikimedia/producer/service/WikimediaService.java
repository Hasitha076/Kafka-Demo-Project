package com.project.wikimedia.producer.service;

import com.project.wikimedia.producer.model.Wikimedia;

import java.util.List;

public interface WikimediaService {

    public List<Wikimedia> getWikimediaData();
    public void saveWikimediaData(Wikimedia wikimedia);
    public Wikimedia getWikimediaDataById(int id);
}
