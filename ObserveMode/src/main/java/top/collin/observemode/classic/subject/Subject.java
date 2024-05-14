package top.collin.observemode.classic.subject;


import top.collin.observemode.classic.observer.Observer;

/**
 * 主题/被观察者 - 接口
 * @author lzk
 */
public interface Subject {

    /**
     * 注册观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();

}
