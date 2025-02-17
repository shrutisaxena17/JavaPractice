import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
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

    public void checkStringPalindrome(){
        String str="abba";
        String reversedString = new StringBuilder(str).reverse().toString();
        
        if (str.equals(reversedString)) {
            System.out.println("The word is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    public void largestOddNumberInAString(){
    String s="42607";
    char arr[]=s.toCharArray();
    for(int i=arr.length-1;i>=0;i--){
        if(arr[i]%2!=0)
        {
            System.out.println("Longest Odd Number is: "+s.substring(0, i+1));
            break;
        }
    }
    }

    public String largestCommonPrefix(){
    String[] str={"Flower","Flow","Flowing"};
    Arrays.sort(str);
    String first=str[0];
    String last=str[str.length-1];
    int i=0;
    while(i<first.length()&& first.charAt(i)==last.charAt(i)){
        i++;
    }
    return first.substring(0, i);
    }

    public void isomorphicStrings(){
        String str1="bar";
        String str2="foo";
        Map<Character,Character> mapToStr1 = new HashMap<>();
        Map<Character, Character> mapToStr2 = new HashMap<>();
        if(str1.length()!=str2.length()){
            System.out.println("false");
        }
        for(int i=0;i<str1.length();i++){
        char ch1 = str1.charAt(i);
        char ch2 = str2.charAt(i);
        if (mapToStr1.containsKey(ch1) && mapToStr1.get(ch1) != ch2) {
            System.out.println("false strings are not isomorphic!");
            return; 
        }
        if (mapToStr2.containsKey(ch2) && mapToStr2.get(ch2) != ch1) {
            System.out.println("false strings are not isomorphic!");
            return;
        }
        mapToStr1.put(ch1, ch2);
        mapToStr2.put(ch2, ch1);
        }
        System.out.println("Strings are isomorphic!");
    }

    public void RotateStrings(){
    String s="abcde";
    String goal="cdeab";
    String add=s.concat(goal);
    if(add.contains(goal)){
        System.out.println("Goal String is the rotated version of the originial strings");
    }
    else{
        System.out.println("Goal String is the not rotated version of the originial strings");
    }
    }

    public void StringAnagram(){
        String s="abc";
        String s1="cab";
        char[] c1=s.toCharArray();
        char[] c2=s1.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1, c2)){
            System.out.println("They are anagram of each other");
        }
        else{
            System.out.println(false);
        }
    }

    public String sortStringByFrequency(String s){
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        List<Character> charList = new ArrayList<>(freqMap.keySet());
        charList.sort((a, b) -> freqMap.get(b) - freqMap.get(a));
        StringBuilder result = new StringBuilder();
        for (char c : charList) {
            result.append(String.valueOf(c).repeat(freqMap.get(c)));
        }
        return result.toString();
    }

    public void findFirstNonRepeatedCharacter(){
        String str="aabbcccdddefffggg";
        Map<String,Long> mapFreq=Stream.of(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        mapFreq.entrySet().stream().filter(entry->entry.getValue()==1).forEach(System.out::println);
    }

    public void countVowelsAndConsonants(){
        String str="ShrutiSaxena";
        long count = Stream.of(str.split("")).filter(s->"aeiou".contains(s.toLowerCase())).count();
        System.out.println("Number of vowels: "+count+" Number of Consonants: "+((str.length())-count));
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
        s.checkStringPalindrome();
        s.largestOddNumberInAString();
        String longestPrefix = s.largestCommonPrefix();
        System.out.println(longestPrefix);
        s.isomorphicStrings();
        s.RotateStrings();
        s.StringAnagram();
        String result = s.sortStringByFrequency("eert");
        System.out.println(result);
        s.findFirstNonRepeatedCharacter();
        s.countVowelsAndConsonants();
    }
}
