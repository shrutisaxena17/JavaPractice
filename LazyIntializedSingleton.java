public class LazyIntializedSingleton {
    private static LazyIntializedSingleton instance;
    private LazyIntializedSingleton(){

    }
    public static LazyIntializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyIntializedSingleton();
        }
        return instance;
    }
}
