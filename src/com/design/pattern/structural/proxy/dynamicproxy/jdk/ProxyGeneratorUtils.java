package design.pattern.structural.proxy.dynamicproxy.jdk;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

public class ProxyGeneratorUtils {
    
    // 产生代理类字节码文件
    public static void writeProxyClassToHardDisk(String path) {
        // 第一种方式
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", true);

        // 第二种方式
        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy0", Integer.class.getInterfaces());

        try (FileOutputStream out = new FileOutputStream(path)){
            out.write(classFile);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
