package top.collin.observemode.spring;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 实现监听
 * @author lzk
 */
@Component
public class DemoListener {

    /**
     * 监听事件
     * - 使用@EventListener注解可以快速监听来自DemoEvent的事件
     * - 使用@Order注解可以指定监听顺序
     * @param event
     */
    @Order(1)
    @EventListener(DemoEvent.class)
    public void eventListener(DemoEvent event) {
        System.out.println("监听到事件：" + event.getName());
    }

    @Order(2)
    @EventListener(DemoEvent.class)
    public void eventListener2(DemoEvent event) {
        System.out.println("监听到事件2：" + event.getName());
    }

}
