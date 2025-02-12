import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StringExamples {
    public void reverseAString() {
        String s = "My name is Shruti";
        char stringarr[] = s.toCharArray();

        for (int i = 0; i < stringarr.length / 2; i++) {
            char c = stringarr[i];
            stringarr[i] = stringarr[(stringarr.length - 1) - i];
            stringarr[(stringarr.length - 1) - i] = c;
        }
        System.out.println(new String(stringarr));
        StringBuilder sb = new StringBuilder("My name is Shruti");
        System.out.println(sb.reverse());
    }

    public void removeExtraWhiteSpacesBtwWords() {
        String s = "My name   is    Shruti  Saxena            .         ";
        System.out.println(s.replaceAll("\\s+", " "));

    }

    public void reverseWordsInAString() {
       String sb = "My name is Shruti Saxena";
       String reverse = Stream.of(sb.split(" ")).map(word->new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
       System.out.println(reverse);
    }

    public void duplicateWordsInAStringList(){
        List<String> stringList = new ArrayList<>();
        stringList.addAll(Arrays.asList("Orange","Apple","Guava","Apple","Banana","Orange"));
        Set<String> distinct = new HashSet<>();
        stringList.stream().filter(word->!distinct.add(word)).collect(Collectors.toList()).forEach(System.out::println);
        }
  
    public void duplicateCharInAString(){
        String s="aabcdaaefgg";
        Map<String,Integer> mapCount = new HashMap<>();
       s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
       .entrySet().stream().filter(entry->entry.getValue()>1).collect(Collectors.toList()).forEach(System.out::println);
    }
}

public class StringPractice {
    public static void main(String[] args) {
        StringExamples s = new StringExamples();
        s.reverseAString();
        s.removeExtraWhiteSpacesBtwWords();
        s.reverseWordsInAString();
        s.duplicateWordsInAStringList();
        s.duplicateCharInAString();
    }
}
