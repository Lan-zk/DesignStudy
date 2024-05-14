package top.collin.strategymode;

/**
 * 具体实现的策略类 B
 * @author lzk
 */
public class ConcreteStrategyB implements Strategy{

    /**
     * 定义策略执行方法
     */
    @Override
    public void execute() {
        System.out.println("执行策略B");
    }
}
