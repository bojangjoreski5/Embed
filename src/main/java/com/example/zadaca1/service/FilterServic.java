package com.example.zadaca1.service;


import com.example.zadaca1.model.Reviews;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface FilterServic {
    List<Reviews> findAll() throws IOException;
    Optional<Reviews> filter();
}
