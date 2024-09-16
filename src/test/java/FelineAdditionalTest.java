package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class FelineAdditionalTest {

    @Test
    public void testGetFoodForPredator() {
        Feline feline = new Feline();
        List<String> food = feline.getFood("Хищник");

        // Убеждаемся, что метод возвращает ожидаемые значения
        assertNotNull("Метод getFood не должен возвращать null", food);
        assertEquals(3, food.size()); // Ожидаем три элемента
        assertTrue("Список должен содержать 'мясо'", food.contains("мясо"));
    }

    @Test
    public void testGetFoodForOtherType() {
        Feline feline = new Feline();
        List<String> food = feline.getFood("Травоядное");

        // Убеждаемся, что метод вернул пустой список
        assertNotNull("Метод getFood не должен возвращать null", food);
        assertTrue("Список должен быть пустым", food.isEmpty());
    }

    @Test
    public void testGetKittensWithValidCount() {
        Feline feline = new Feline();
        assertEquals(3, feline.getKittens(3)); // Проверка на 3 котенка
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        assertEquals(expectedFamily, feline.getFamily());
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens()); // Проверка на 1 котенка по умолчанию
    }

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();

        System.out.println("Содержимое списка еды: " + food);

        assertNotNull("Метод eatMeat не должен возвращать null", food);
        assertFalse("Список еды должен быть не пустым", food.isEmpty());
        assertTrue("Список должен содержать 'мясо'", food.contains("мясо"));
    }
}
