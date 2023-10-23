package com.discordBot.backend.example;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/example")
public class ExampleController {

    @NonNull
    private final ExampleService exampleService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    void create(@RequestBody Example example) {
        exampleService.createExample(example);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    Example getWithId(@PathVariable int id) {
        return exampleService.getExample(id);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    List<Example> getAll() {
        return exampleService.getAll();
    }

}
