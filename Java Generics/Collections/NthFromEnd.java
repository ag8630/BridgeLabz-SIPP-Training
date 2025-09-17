import java.util.*;
public class NthFromEnd {
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        int n=2;
        String result=findNthFromEnd(list,n);
        System.out.println(result);
    }
    static <T> T findNthFromEnd(LinkedList<T> list,int n){
        Iterator<T> it1=list.iterator(), it2=list.iterator();
        for(int i=0;i<n;i++) it2.next();
        while(it2.hasNext()) { it1.next(); it2.next(); }
        return it1.next();
    }
}