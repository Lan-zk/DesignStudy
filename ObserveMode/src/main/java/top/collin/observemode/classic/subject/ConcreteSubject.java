package top.collin.observemode.classic.subject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import top.collin.observemode.classic.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题实现
 * @author lzk
 */
@Getter
@Setter
public class ConcreteSubject implements Subject{

    /**
     * 维护一个该主题的观察者列表
     */
    private final List<Observer> observerList = new ArrayList<>();

    /**
     * 注册观察者
     *
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 移除观察者
     *
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * 通知观察者
     */
    @Override
    public void notifyObservers() {
        observerList.forEach(Observer::update);
    }

}
