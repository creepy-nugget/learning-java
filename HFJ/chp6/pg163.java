import java.util.ArrayList;

class pg163{
    public static void printList(ArrayList list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add(0,"zero");
        a.add(1,"one");
        a.add(2,"two");
        a.add(3,"three");
        pg163.printList(a);

        if (a.contains("three")) {
            a.add("four");
        }
        a.remove(2);
        printList(a);

        if (a.indexOf("four") != 4) {
            a.add(4, "4.2");
        }
        printList(a);

        if (a.contains("two")) {
               a.add("2.2");
        }
        printList(a);
    }
}