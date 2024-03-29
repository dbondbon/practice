package designPatterns.builderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Meal
 * @Descrcription 套餐
 * @Author zzc
 * @Date 2019/7/7 8:29
 * @Version 1.0
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost = cost + item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item:" + item.name());
            System.out.print(",Packing:" + item.packing().pack());
            System.out.println(",Price:" + item.price());
        }
    }
}
