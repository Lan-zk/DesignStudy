package top.collin.observemode.classic.observer;

import lombok.AllArgsConstructor;
import top.collin.observemode.classic.subject.Subject;

/**
 * 具体观察者实现
 * @author lzk
 */
@AllArgsConstructor
public class ConcreteObserve implements Observer {

    /**
     * 该观察者名称
     */
    private String name;

    /**
     * 所属主题
     */
    private Subject subject;

    /**
     * 更新
     */
    @Override
    public void update() {
        System.out.println(name + "收到消息");
    }

}
