package top.collin.observemode.spring;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * 事件源 - 继承 ApplicationEvent
 * @author lzk
 */
@Getter
public class DemoEvent extends ApplicationEvent {

    /**
     * 名称
     */
    private String name;

    /**
     * 必须重写的构造方法 - 可以自定义入参和构造逻辑
     * @param name
     */
    public DemoEvent(String name) {
        super(new Object());
        this.name = name;
    }

}