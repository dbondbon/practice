package designPatterns.builderPattern;

/**
 * @ClassName MealBuilder
 * @Descrcription 套餐建造类
 * @Author zzc
 * @Date 2019/7/7 8:34
 * @Version 1.0
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
