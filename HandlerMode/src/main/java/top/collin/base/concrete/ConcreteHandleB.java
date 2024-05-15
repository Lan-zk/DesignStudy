package top.collin.base.concrete;

import top.collin.base.Handle;
import top.collin.base.Request;

/**
 * 具体处理对象B
 * @author lzk
 */
public class ConcreteHandleB extends Handle {

    /**
     * 处理方法
     */
    @Override
    public void handle(Request request) {
        System.out.println("ConcreteHandleB处理请求 - 成功: " + request.getName());
        // 调用下一个处理对象
        super.handle(request);
    }
}
