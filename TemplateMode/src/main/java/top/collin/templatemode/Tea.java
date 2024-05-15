package top.collin.templatemode;

public class Tea extends Beverage {

    /**
     * 泡茶
     */
    @Override
    protected void brew() {
        System.out.println("泡茶");
    }

    /**
     * 添加调料
     */
    @Override
    protected void addCondiments() {
        System.out.println("加入柠檬");
    }

    /**
     * 茶不用添加调料
     * @return
     */
    @Override
    protected boolean customerWantsCondiments() {
        return false;
    }

}
