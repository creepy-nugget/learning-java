import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Hashmap1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array n:");
        int n =sc.nextInt();

        HashMap< Integer, Integer> mp = new HashMap<>();


        int[] arr = new int[n];
        System.out.print("Enter the elements of arr:");
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
            int key = arr[i];
            mp.put(key,mp.getOrDefault(key,0)+1);
        }

        System.out.print("Enter the no. of queries q:");
        int q = sc.nextInt();

        System.out.print("Enter the queries:");
        while(q-- >0){
            int num = sc.nextInt();
            System.out.println(mp.getOrDefault(num, 0));
        }

        //'Map.Entry<Integer, Integer>' represents a single row (pair) in your map
        //For Interview and Competitive programming this method is best as the
        //mp.entrySet() returns a collection containing both the key and the value bound together,it
        //grabs the value directly from node w/o searching again for second time.

        // When you call .getKey() and .getValue(), Java pulls them instantly out of that entry block
        // without having to search the map memory all over again.

        //Fail-Fast Structural Modification: If you try to modify the map (like mp.remove(key)) inside this loop,
        // the iterator will instantly throw a ConcurrentModificationException.
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " appears " + entry.getValue() + " times"+"    # Map.Entry<k,v> method");
        }

        // Fast, readable, and uses Lambdas.
        //This uses Java 8 Functional Interfaces. forEach accepts a BiConsumer<K, V>.
        // The Map implementation internally runs its own loop over the data and invokes the lambda expression on each pair.

        //You cannot modify local variables declared outside this loop if they change.
        // Variables accessed inside a lambda must be effectively final.
        //You cannot use break or continue keywords inside a lambda block.
        // A return inside the lambda wrapper just skips to the next element (acting like a continue),
        // but you cannot prematurely kill the whole loop!
        mp.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Frequency: " + value+"   # Lamba forEach(k,v) method");
        });

        // Loops through every unique key in the map, not ideal for any case as its slow.
        //Calling mp.get(key) inside a loop forces Java to recalculate the hashcode and search the
        // internal bucket array on every single iteration.
        // entrySet()) is much faster because it grabs the value directly from the node without a second search.
        for (Integer key : mp.keySet()) {
            int value = mp.get(key); // Double lookup warning!
            System.out.println("Key: " + key + " -> Value: " + value +"   # 5Loop method ");
        }
    }
}
