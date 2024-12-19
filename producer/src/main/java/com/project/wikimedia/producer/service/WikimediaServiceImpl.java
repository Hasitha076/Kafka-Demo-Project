package com.project.wikimedia.producer.service;

import com.project.wikimedia.producer.dto.WikimediaDTO;
import com.project.wikimedia.producer.model.Wikimedia;
import com.project.wikimedia.producer.repo.WikimediaRepo;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WikimediaServiceImpl implements WikimediaService {

    private final WikimediaRepo wikimediaRepo;
    private final ModelMapper modelMapper;

    @Override
    public List<Wikimedia> getWikimediaData() {
        return modelMapper.map(wikimediaRepo.findAll(), new TypeToken<List<Wikimedia>>() {
        }.getType());
    }

    @Override
    public void saveWikimediaData(Wikimedia wikimedia) {
        wikimediaRepo.save(modelMapper.map(wikimedia, WikimediaDTO.class));
    }

    @Override
    public Wikimedia getWikimediaDataById(int id) {
        return modelMapper.map(wikimediaRepo.findById(id), Wikimedia.class);
    }
}
