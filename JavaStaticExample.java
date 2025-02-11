public class JavaStaticExample {
    public static void main(String[] args) {
        DataObject object1 = new DataObject();
        object1.staticVar=10;
        object1.nonStaticVar=10;
        DataObject object2 = new DataObject();
        System.out.println(object2.staticVar);
        System.out.println(object2.nonStaticVar);
        //Direct Access using Class name
        DataObject.staticVar=20;
        System.out.println(object1.staticVar);
        System.out.println(object2.staticVar);
        System.out.println(DataObject.getStaticVar());
    }
}
class DataObject{
public static int staticVar;
public int nonStaticVar;
public static int getStaticVar(){
    return staticVar;
}
static{
    staticVar=30;
}
static{
    System.out.println(staticVar);
}
static class staticInnerClass{
    public static void accessOuterClass(){
        System.out.println(DataObject.staticVar);   //static variable of outer class
        System.out.println(DataObject.getStaticVar());  //static method of outer class
    }
}
}
