package top.collin.base;

/**
 * 抽象处理类
 * @author lzk
 */
public abstract class Handle {

    /**
     * 下一个处理类
     */
    private Handle nextHandle;

    /**
     * 设置下一个处理类
     * @param nextHandle
     */
    public void setNextHandle(Handle nextHandle) {
        this.nextHandle = nextHandle;
    }

    /**
     * 处理方法
     */
    public void handle(Request request) {
        if (this.nextHandle != null) {
            this.nextHandle.handle(request);
        }
    }

}
