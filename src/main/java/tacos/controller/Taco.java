package tacos.controller;

import lombok.Data;

import java.util.List;

@Data
public class Taco {

    private final String name;
    private List<String> ingredients;
}
