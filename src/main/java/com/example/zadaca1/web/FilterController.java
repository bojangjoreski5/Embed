package com.example.zadaca1.web;

import com.example.zadaca1.model.Reviews;
import com.example.zadaca1.service.FilterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Controller
public class FilterController {

    private final FilterService filterService;

    public FilterController(FilterService filterService) {
        this.filterService = filterService;
    }

    @GetMapping
    public String getIndexPage(){
        return "index.html";
    }
    @GetMapping("/index")
    public String unFilteredRevs(Model model) throws IOException {
        List<Reviews> reviews = this.filterService.findAll();
        model.addAttribute("reviews", reviews);
        return "index.html";
    }

    @PostMapping("/filter")
    public String filter(Model model){
        Optional<Reviews> filtered = this.filterService.filter();
        model.addAttribute("filtered", filtered);
        return "index.html";
    }

}
