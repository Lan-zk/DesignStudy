package top.collin.strategymode;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 上下文类
 * @author lzk
 */
@Data
@AllArgsConstructor
public class Context {

    /**
     * 具体策略实现
     */
    private Strategy strategy;

    /**
     * 执行策略
     */
    public void executeStrategy() {
        strategy.execute();
    }

}
