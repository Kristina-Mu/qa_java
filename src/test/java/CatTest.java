import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {

    @Test
    public void testGetSound() {
        Feline feline = Mockito.mock(Feline.class);
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Cat cat = new Cat(feline);

        List<String> expectedFood = Arrays.asList("Мясо");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood); // Настраиваем мок для метода

        assertEquals(expectedFood, cat.getFood());
    }
}
