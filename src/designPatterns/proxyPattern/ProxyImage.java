package designPatterns.proxyPattern;

/**
 * @ClassName ProxyImage
 * @Descrcription 普通图片代理类（作用：减少 RealImage 对象加载的内存占用）
 * @Author zzc
 * @Date 2019/7/6 16:26
 * @Version 1.0
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
