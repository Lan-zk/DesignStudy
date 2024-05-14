package top.collin.observemode;

import org.junit.jupiter.api.Test;
import top.collin.observemode.spring.DemoService;

public class SpringTest {

    @Test
    public void test(){

        DemoService demoService = new DemoService();
        demoService.publish("test");

    }

}
