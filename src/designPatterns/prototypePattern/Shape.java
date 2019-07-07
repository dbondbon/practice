package designPatterns.prototypePattern;

/**
 * @ClassName Shape
 * @Descrcription 原型角色（定义用于复制现有实例来生成新实例的方法）
 * @Author zzc
 * @Date 2019/7/7 8:47
 * @Version 1.0
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
