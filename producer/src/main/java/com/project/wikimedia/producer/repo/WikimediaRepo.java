package com.project.wikimedia.producer.repo;

import com.project.wikimedia.producer.dto.WikimediaDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaRepo extends JpaRepository<WikimediaDTO, Integer> {
}
