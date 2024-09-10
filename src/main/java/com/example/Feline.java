package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens() {
        return getKittens(1); // по умолчанию 1 котенок
    }

    public int getKittens(int kittensCount) {
        if (kittensCount < 1) {
            throw new IllegalArgumentException("Количество котят должно быть больше 0");
        }
        return kittensCount;
    }
}
