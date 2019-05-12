package design.pattern.structural.proxy.dynamicproxy.jdk;

import java.util.Arrays;
import java.util.Random;

public class Client {

    public static void main(String[] args) {
        Object[] elements = new Object[1000];
        for(int i = 0; i < elements.length; i++) {
            int value = i + 1;
            Object proxy = new TraceHandler(value).bind();
            elements[i] = proxy;
        }

        // construct a random integer
        int key = new Random().nextInt(elements.length) + 1;

        // search for the key
        int result = Arrays.binarySearch(elements, key);

        // print match if found
        if (result >= 0)
            System.out.println(elements[result]);
    }
}
