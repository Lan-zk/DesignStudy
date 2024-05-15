package top.collin.templatemode;

public class Coffee extends Beverage{

    /**
     * 咖啡 冲泡
     */
    @Override
    protected void brew() {
        System.out.println("冲泡咖啡");
    }

    /**
     * 咖啡 - 添加糖和牛奶
     */
    @Override
    protected void addCondiments() {
        System.out.println("在咖啡中加入糖和牛奶");
    }
}
