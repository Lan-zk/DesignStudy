package top.collin.strategymode;

import org.junit.jupiter.api.Test;

public class StrategyTest {

    @Test
    public void test() {

        // 在上下文类中初始化策略A - 然后执行策略
        Context context = new Context(new ConcreteStrategyA());
        context.executeStrategy();

        // 在上下文类中初始化策略B - 然后执行策略
        context = new Context(new ConcreteStrategyB());
        context.executeStrategy();

    }

}
