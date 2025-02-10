import java.util.*;

public class Driver {
    public static void main(String args[]){
        List<String> subject = new ArrayList<>();
        subject.add("Maths");
        subject.add("Science");
        subject.add("SST");
        subject.add("English");
        subject.add("Hindi");
        ImmutableClass i = new ImmutableClass("Shruti",subject);
        System.out.println(i.getName());
        System.out.println(i.getSubjectList());
        List<String> sub= i.getSubjectList();
        sub.add("History");
        System.out.println(i.getSubjectList());    }
}