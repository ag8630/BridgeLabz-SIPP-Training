import java.util.*;
public class SymmetricDifference {
    public static void main(String[] args){
        Set<Integer> s1=new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2=new HashSet<>(Arrays.asList(3,4,5));
        Set<Integer> diff=new HashSet<>(s1);
        diff.addAll(s2);
        Set<Integer> common=new HashSet<>(s1);
        common.retainAll(s2);
        diff.removeAll(common);
        System.out.println(diff);
    }
}