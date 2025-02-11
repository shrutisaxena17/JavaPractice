public class EagerIntializedSingleton{
    private static final EagerIntializedSingleton instance = new EagerIntializedSingleton();
    //private constructor to avoid other classes using this constructor
    private EagerIntializedSingleton(){

    }
    public static EagerIntializedSingleton getInstance(){
        return instance;
    }
}