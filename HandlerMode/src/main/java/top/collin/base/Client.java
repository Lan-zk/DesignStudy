package top.collin.base;

import top.collin.base.concrete.ConcreteHandleA;
import top.collin.base.concrete.ConcreteHandleB;
import top.collin.base.concrete.ConcreteHandleC;

/**
 * 客户端 - 构建链路
 * @author lzk
 */
public class Client {

    /**
     * 构建一条 A - B - C 链路
     * @return
     */
    public static Handle buildChain() {
        ConcreteHandleA concreteHandleA = new ConcreteHandleA();
        ConcreteHandleB concreteHandleB = new ConcreteHandleB();
        ConcreteHandleC concreteHandleC = new ConcreteHandleC();
        concreteHandleA.setNextHandle(concreteHandleB);
        concreteHandleB.setNextHandle(concreteHandleC);
        return concreteHandleA;
    }

}
