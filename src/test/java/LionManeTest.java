import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionManeTest {
    @Parameterized.Parameter
    public String sex;

    @Parameterized.Parameter(1)
    public boolean hasMane;

    @Parameterized.Parameters(name = "{index}: тест для пола {0} - имеет гриву: {1}")

    public static Object[][] data() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void testLionDoesHaveMane() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion(sex, feline);
        assertEquals(hasMane, lion.doesHaveMane());
    }
}