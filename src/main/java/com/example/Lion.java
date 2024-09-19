package com.example;

import java.util.List;

//Класс Лев
public class Lion {
    //Есть грива (да/нет)
    boolean hasMane;
    //  Класс Lion не должен зависеть от класса Feline. Использован принцип инъекции зависимостей.
    final Feline feline;

    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;
        if ("Самец".equals(sex)) {          //Если самец
            hasMane = true;                 //значит есть грива
        } else if ("Самка".equals(sex)) {   //Если самка
            hasMane = false;                //гривы нет
        } else {                            //иначе - недопустимые значения на входе
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    //Котята
    public int getKittens() {
        return feline.getKittens();
    }

    //Грива
    public boolean doesHaveMane() {
        return hasMane;
    }

    //Как добывает еду
    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}