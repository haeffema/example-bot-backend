package com.discordBot.backend.example;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
public class ExampleDatabase {
    private int id = 0;

    private final Map<Integer, Example> database = new HashMap<Integer, Example>();

    public void addExample(Example example) {
        database.put(id++, example);
    }

    public Example getExample(int id) {
        return database.get(id);
    }

    public List<Example> getAll() {
        return database.values()
                       .stream()
                       .toList();
    }

}
