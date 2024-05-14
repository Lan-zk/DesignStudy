package top.collin.observemode;

import org.junit.jupiter.api.Test;
import top.collin.observemode.classic.observer.ConcreteObserve;
import top.collin.observemode.classic.subject.ConcreteSubject;

public class ClassicTest {

    @Test
    public void test() {

        // 1. 创建主题
        ConcreteSubject subject = new ConcreteSubject();

        // 2. 创建观察者 - 并初始化观察者名称和所属主题
        ConcreteObserve observeOne = new ConcreteObserve("观察者1", subject);
        ConcreteObserve observeTwo = new ConcreteObserve("观察者2", subject);

        // 3. 向主题中注册观察者
        subject.registerObserver(observeOne);
        subject.registerObserver(observeTwo);

        // 4. 通知观察者
        subject.notifyObservers();

    }

}
