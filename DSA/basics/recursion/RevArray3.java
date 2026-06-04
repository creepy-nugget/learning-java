import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class RevArray3{
    public void rev(List<Integer> arr){
        Collections.reverse(arr);
        }

    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        RevArray3 obj = new RevArray3();
        obj.rev(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}