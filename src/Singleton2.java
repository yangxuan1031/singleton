/**
 * Created by YAO on 2019-06-04.
 * 单例模式——枚举型（使用枚举除了线程安全和防止反射强行调用构造器之外，还提供了自动序列化机制，防止反序列化的时候创建新的对象）
 */
public enum Singleton2 {
instance;
private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
