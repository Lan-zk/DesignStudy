package top.collin.strategymode;

/**
 * 具体实现的策略类 A
 * @author lzk
 */
public class ConcreteStrategyA implements Strategy{

    /**
     * 定义策略执行方法
     */
    @Override
    public void execute() {
        System.out.println("执行策略A");
    }
}
