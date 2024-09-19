package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineTest {
    private final int inputCount;

    public FelineTest(int inputCount) {
        this.inputCount = inputCount;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1},       // Корректное количество котят
                {2},       // Корректное количество котят
                {3}        // Корректное количество котят
        });
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();

        // Проверяем, что количество котят совпадает
        assertEquals(inputCount, feline.getKittens(inputCount));
    }
}