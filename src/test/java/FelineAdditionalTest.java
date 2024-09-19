package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;

public class FelineAdditionalTest {
    @Test
    public void testGetFoodForPredator() throws Exception { // добавлено
        Feline feline = new Feline();
        List<String> food = feline.getFood("Хищник");

        // Убеждаемся, что метод возвращает ожидаемые значения
        assertNotNull("Метод getFood не должен возвращать null", food);
        assertEquals(3, food.size()); // Ожидаем три элемента

        // Проверяем, что список еды соответствует ожидаемым значениям
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, food);
    }
    // Обновленный testGetFoodForOtherType
    @Test
    public void testGetFoodForOtherType() {
        Feline feline = new Feline();

        // Ожидаем исключение для нераспознанного вида животного
        Exception exception = assertThrows(Exception.class, () -> {
            feline.getFood("Неизвестный");
        });

        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
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
    public void testEatMeat() throws Exception { // добавлено
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();

        System.out.println("Содержимое списка еды: " + food);
        assertNotNull("Метод eatMeat не должен возвращать null", food);
        assertFalse("Список еды должен быть не пустым", food.isEmpty());

        // Проверяем, что список содержит "мясо", учитывая, что в eatMeat возвращается
        // getFood("Хищник"), который сейчас возвращает другие значения.
        assertTrue("Список должен содержать хотя бы 'Животные'", food.contains("Животные"));

        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, food);
    }

}