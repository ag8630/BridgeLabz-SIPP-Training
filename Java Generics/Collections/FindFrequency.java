import java.util.*;
public class FindFrequency {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple","banana","apple","orange");
        Map<String,Integer> map=new HashMap<>();
        for(String s:items){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        System.out.println(map);
    }
}