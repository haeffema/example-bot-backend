package com.discordBot.backend.example;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExampleService {

    private final ExampleDatabase exampleDatabase = new ExampleDatabase();

    public void createExample(Example example) {
        exampleDatabase.addExample(example);
    }

    public Example getExample(int id) {
        return exampleDatabase.getExample(id);
    }

    public List<Example> getAll() {
        return exampleDatabase.getAll();
    }

}
