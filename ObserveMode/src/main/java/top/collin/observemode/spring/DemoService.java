package top.collin.observemode.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * 业务 - 发布事件
 * @author lzk
 */
@Service
public class DemoService {

    /**
     * 可以使用 @Autowired 注入
     * 也可以在实现 ApplicationEventPublisherAware 接口，然后初始化再使用
     */
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    /**
     * 发布事件
     * @param name
     */
    public void publish(String name) {
        applicationEventPublisher.publishEvent(new DemoEvent(name));
    }

}
