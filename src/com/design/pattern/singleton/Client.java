package design.pattern.singleton;

import java.io.*;

public class Client {

    // 通过序列化破坏单例模式
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EagerSingleton instance = EagerSingleton.getInstance();

        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("instanceFile"));

        oos.writeObject(instance);

        File file = new File("instanceFile");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        EagerSingleton newInstance = (EagerSingleton) ois.readObject();
        System.out.println("序列化前：" + instance);
        System.out.println("序列化后：" + newInstance);
        System.out.println(newInstance == instance);

    }
}
