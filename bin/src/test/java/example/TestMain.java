package example;

import org.testng.Assert;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(example.Listener.class)
public class TestMain {
    @Test
    public void getGreeting() {
        String test = example.Main.greeting();
        String expected = "Hello World";
        Assert.assertEquals(expected, test);
    }
}
