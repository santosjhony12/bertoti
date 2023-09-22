import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteAtv22_9 {
    @Test
    public void num1(){
        assertEquals(Atv22_9.function1(-29999), Atv22_9.function2(-29999));
    }
    @Test
    public void num2(){
        assertEquals(Atv22_9.function1(29999), Atv22_9.function2(29999));
    }
    @Test
    public void num3(){
        assertEquals(Atv22_9.function1(30000), Atv22_9.function2(30000));
    }
    @Test
    public void num4(){
        assertEquals(Atv22_9.function1(-30000), Atv22_9.function2(-30000));
    }
}
