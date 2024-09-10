import com.example.Predator;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PredatorTest {
    @Test
    public void testEatMeat() throws Exception {
        // Создание мок-объекта Predator
        Predator predator = Mockito.mock(Predator.class);

        // Настройка поведения мок-объекта
        List<String> expectedFood = List.of("Говядина", "Баранина");
        Mockito.when(predator.eatMeat()).thenReturn(expectedFood);

        // Проверка, что возвращаемое значение соответствует ожидаемому
        assertEquals(expectedFood, predator.eatMeat());
    }
}
