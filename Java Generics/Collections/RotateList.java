import java.util.*;
public class RotateList {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int k=2;
        List<Integer> rotated=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            rotated.add(list.get((i+k)%list.size()));
        }
        System.out.println(rotated);
    }
}