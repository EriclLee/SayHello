package helloworld;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zwli on 27/10/2016.
 */
public class MainAppTest {
    @Test
    public void main() throws Exception {
        MainApp.main(null);
        Assert.assertEquals("done", 1, 1);
    }

}