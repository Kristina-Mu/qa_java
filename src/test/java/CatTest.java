import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {

    @Test
    public void testGetSound() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> expected = feline.eatMeat(); // Используем реальное поведение
        assertEquals(expected, cat.getFood());
    }
}
