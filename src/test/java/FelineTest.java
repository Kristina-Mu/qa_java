import com.example.Feline;
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
        return Arrays.asList(new Object[][] {
                {0},       // Должно выбросить IllegalArgumentException
                {-1}       // Должно выбросить IllegalArgumentException
        });
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();

            assertThrows(IllegalArgumentException.class, () -> {
                feline.getKittens(inputCount);
            });
    }

//    @Test
//    public void testGetKittensWithValidCount() {
//        Feline feline = new Feline();
//        assertEquals(3, feline.getKittens(3)); // Корректное значение
//    }
//
//    @Test
//    public void testGetFamily() {
//        Feline feline = new Feline();
//        String expectedFamily = "Кошачьи"; // Ожидаемое значение
//        assertEquals(expectedFamily, feline.getFamily()); // Проверка на равенство
//    }
//
//    @Test
//    public void testGetKittensWithDefaultCount() {
//        Feline feline = new Feline();
//        assertEquals(1, feline.getKittens()); // Метод без параметров должен возвращать 1
//    }
}
