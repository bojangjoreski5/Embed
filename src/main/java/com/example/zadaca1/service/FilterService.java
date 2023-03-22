package com.example.zadaca1.service;

import com.example.zadaca1.model.Reviews;
import com.example.zadaca1.repository.FilterRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class FilterService implements FilterServic{
    private final FilterRepository filterRepository;

    public FilterService(FilterRepository filterRepository) {
        this.filterRepository = filterRepository;
    }

    @Override
    public List<Reviews> findAll() throws IOException {
        return this.filterRepository.findAll();
    }

    @Override
    public Optional<Reviews> filter() {
        return Optional.empty();
    }

}
