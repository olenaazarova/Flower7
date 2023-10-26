package ucu.edu.ua.demo;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Flower {

    private double sepalLength;
    private FlowerColor color;
    private double price;

}
