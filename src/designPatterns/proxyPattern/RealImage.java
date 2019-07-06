package designPatterns.proxyPattern;

/**
 * @ClassName RealImage
 * @Descrcription Image接口的实现类
 * @Author zzc
 * @Date 2019/7/6 16:22
 * @Version 1.0
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("显示图片：" + fileName);
    }

    public void loadFromDisk(String fileName) {
        System.out.println("加载文件：" + fileName);
    }
}
