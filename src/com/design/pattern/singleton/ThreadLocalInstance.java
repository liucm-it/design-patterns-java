package design.pattern.singleton;

/**
 * 线程单例模式：针对同一线程创建唯一实例
 * 不同线程创建不同实例
 */
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> INSTANCE
        = new ThreadLocal<ThreadLocalInstance>() {
            @Override
            protected ThreadLocalInstance initialValue() {
                return new ThreadLocalInstance();
            }
        };

    private ThreadLocalInstance () {}

    public static ThreadLocalInstance getInstance() {
        return INSTANCE.get();
    }
}

class Test implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Test());
        Thread thread2 = new Thread(new Test());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName() + "实例:" + instance);
        System.out.println(Thread.currentThread().getName() + "实例:" + ThreadLocalInstance.getInstance());
        System.out.println(Thread.currentThread().getName() + "实例:" + ThreadLocalInstance.getInstance());
    }

    public void run() {
        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName() + "实例："+ instance);
    }
}
