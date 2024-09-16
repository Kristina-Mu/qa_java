import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class AnimalTest {
    private final String inputAnimalKind;
    private final List<String> expectedFood;
    private final boolean shouldThrowException;

    public AnimalTest(String inputAnimalKind, List<String> expectedFood, boolean shouldThrowException) {
        this.inputAnimalKind = inputAnimalKind;
        this.expectedFood = expectedFood;
        this.shouldThrowException = shouldThrowException;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения"), false},
                {"Хищник", List.of("Животные", "Птицы", "Рыба"), false},
                {"Неизвестный", null, true}
        });
    }

    @Test
    public void testGetFood() throws Exception {
        Animal animal = new Animal();

        if (shouldThrowException) {
            Exception exception = assertThrows(Exception.class, () -> {
                animal.getFood(inputAnimalKind);
            });
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
        } else {
            assertEquals(expectedFood, animal.getFood(inputAnimalKind));
        }
    }
//создать доп класс
}