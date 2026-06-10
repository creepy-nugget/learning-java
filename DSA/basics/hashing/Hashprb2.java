import java.util.HashMap;
import java.util.Map;

class Hashprb2{
    void maxnminfreq(int[] arr){
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }

        int maxfreq=0,maxele=0;
        int minfreq=arr.length,minele=0;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            int element = entry.getKey();
            int freq = entry.getValue();

            if(freq>maxfreq){
                maxfreq=freq;
                maxele=element;
            }
            if(freq<minfreq){
                minfreq = freq;
                minele = element;
            }
        }
        System.out.println(maxele+" "+minele);
    }

    public static void main(String[] args){
        int[] arr1 = {10,5,10,15,10,5};
        int [] arr2 = {2,2,3,4,4,2};
        Hashprb2 obj = new Hashprb2();
        obj.maxnminfreq(arr1);
        obj.maxnminfreq(arr2);
    }
}