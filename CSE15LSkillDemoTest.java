import static org.junit.Assert.*;
import org.junit.*;
public class CSE15LSkillDemoTest {
    @Test
    public void skillDemoTest() {
        String exp = "Hello World!"; //fail
        String act = CSE15LSkillDemo.combString("Hello", "World");
        assertEquals(act, exp);
    }
}