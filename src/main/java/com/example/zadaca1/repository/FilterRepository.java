package com.example.zadaca1.repository;

import com.example.zadaca1.model.Reviews;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Repository
public class FilterRepository {

    public List<Reviews> findAll() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File reviewJsonFile = new File("src/main/resources/reviews.json");
        List<Reviews> reviews = objectMapper.readValue(reviewJsonFile, new TypeReference<List<Reviews>>() {
        });
        return reviews;
    }
    public Optional<Reviews> filter(){
        return Optional.empty();
    }
}
