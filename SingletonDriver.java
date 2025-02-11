public class SingletonDriver {
    public static void main(String[] args) {
        EagerIntializedSingleton instance = EagerIntializedSingleton.getInstance();
        EagerIntializedSingleton instance1 = EagerIntializedSingleton.getInstance();
        System.out.println(instance);
        System.out.println(instance1);
        StaticBlockSingleton singleton = StaticBlockSingleton.getInstance();
        StaticBlockSingleton singleton1 = StaticBlockSingleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton1);
        LazyIntializedSingleton lazyIntializedSingleton = LazyIntializedSingleton.getInstance();
        LazyIntializedSingleton lazyIntializedSingleton1 = LazyIntializedSingleton.getInstance();
        System.out.println(lazyIntializedSingleton);
        System.out.println(lazyIntializedSingleton1);
        Runnable task = () -> {
            ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " - " + threadSafeSingleton);
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();
    }
}
