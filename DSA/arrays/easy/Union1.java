import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

class Union1{
    public List<Integer> FindUnion(int[] arr1,int[] arr2){
        TreeMap<Integer,Integer> mp = new TreeMap<>();
        for (int k : arr1) {
            mp.put(k, mp.getOrDefault(k, 0) + 1);
        }
        for (int j : arr2) {
            mp.put(j, mp.getOrDefault(arr2[0], 0) + 1);
        }
        return new ArrayList<>(mp.keySet());
    }

    public static void main(String[] args){
        int[] a1={1,2,3,4,4,5};
        int[] a2={2,4,5,6,7,8};
        Union1 obj = new Union1();
        List<Integer> Union= obj.FindUnion(a1,a2);
        for(int num:Union){
            System.out.print(num+" ");
        }
    }
}