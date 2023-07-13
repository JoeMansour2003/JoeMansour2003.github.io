import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

public class Savequestion2Test {
    @Test
    public void Savequestion2Test() throws Exception {
       boolean value = Savequestion2.doStuff("What is the weather like today?","");
        Assert.assertEquals(true,value);
    }
}