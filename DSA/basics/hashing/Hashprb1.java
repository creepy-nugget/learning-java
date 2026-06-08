import java.util.HashMap;
import java.util.Map;

class Hashprb1{
    public void freq(int[] arr){
        HashMap<Integer , Integer> mp = new HashMap<>();
        for (int key : arr) {
            mp.put(key, mp.getOrDefault(key, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    public static void main(String[] args){
        int[] arr = {2,2,3,4,4,2};
        Hashprb1 sol = new Hashprb1();
        sol.freq(arr);
    }
}