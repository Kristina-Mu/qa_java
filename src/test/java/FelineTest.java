import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи"; // Ожидаемое значение
        assertEquals(expectedFamily, feline.getFamily()); // Проверка на равенство
    }

    @Test
    public void testGetKittensWithValidCount() {
        Feline feline = new Feline();
        assertEquals(3, feline.getKittens(3)); // Корректное значение
    }

    @Test
    public void testGetKittensWithDefaultCount() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens()); // Метод без параметров должен возвращать 1
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetKittensWithZero() {
        Feline feline = new Feline();
        feline.getKittens(0); // Должно выбросить IllegalArgumentException
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetKittensWithNegativeCount() {
        Feline feline = new Feline();
        feline.getKittens(-1); // Должно выбросить IllegalArgumentException
    }
}
