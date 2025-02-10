import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class ImmutableClass {
    private final String name;
    private final List<String> subject;

    //Paramaterized constructor
    public ImmutableClass(String name, List<String> subject){
        this.name=name;
        List<String> tempSub = new ArrayList<>();
        for(String sub : subject){
            tempSub.add(sub);
        }
        this.subject=tempSub;
    }

    public String getName(){
        return name;
    }

    public List<String> getSubjectList(){
        List<String> tempList= new ArrayList<>();
        for(String sub: subject){
            tempList.add(sub);
        }
        return tempList;
    }
}
