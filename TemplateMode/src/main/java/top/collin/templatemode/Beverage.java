package top.collin.templatemode;

/**
 * 制作饮料模板
 * @author lzk
 */
public abstract class Beverage {

    /**
     * 模板方法：制作饮料的整个流程
     */
    public final void prepareRecipe() {
        // 1. 烧水
        boilWater();

        // 2. 冲泡
        brew();

        // 3. 倒入杯中
        pourInCup();

        // 4. 是否添加调料
        if (customerWantsCondiments()) {
            // 5. 添加调料
            addCondiments();
        }
    }

    /**
     * 冲泡 - 具体步骤由子类实现
     */
    protected abstract void brew();

    /**
     * 添加调料 - 具体步骤由子类实现
     */
    protected abstract void addCondiments();

    /**
     * 是否添加调料 - 钩子方法，默认实现，子类可选择覆盖
     * @return
     */
    protected boolean customerWantsCondiments() {
        return true;
    }

    /**
     * 不变的步骤 - 烧水
     */
    private void boilWater() {
        System.out.println("烧水");
    }

    /**
     * 不变的步骤 - 倒入杯中
     */
    private void pourInCup() {
        System.out.println("倒入杯中");
    }

}
