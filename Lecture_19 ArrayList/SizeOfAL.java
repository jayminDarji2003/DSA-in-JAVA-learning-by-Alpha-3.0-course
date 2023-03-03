import java.util.ArrayList;

public class SizeOfAL {
    public static void main(String[] args) {
        // size of an ArrayList

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Size of AL is : " + list.size());

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

    }
}