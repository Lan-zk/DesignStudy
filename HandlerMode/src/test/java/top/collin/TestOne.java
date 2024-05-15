package top.collin;

import org.junit.jupiter.api.Test;
import top.collin.base.Client;
import top.collin.base.Request;

public class TestOne {

    @Test
    public void test() {
        Request request = new Request("1","张三");
        Client.buildChain().handle(request);
    }

}
