package ucu.edu.ua.demo;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonValue;


public enum FlowerColor {
    RED("red"), BLUE("blue"), GREEN("green");

    private String label;

    FlowerColor(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "hello";
    }
}
