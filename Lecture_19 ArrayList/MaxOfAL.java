import java.util.ArrayList;

public class MaxOfAL {
    public static void main(String[] args) {
        // Find max in ArrayList

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            // first way
            // if(max < list.get(i)){
            //     max = list.get(i);
            // }

            // Second way
            max = Math.max(max,list.get(i));
        }
        
        System.out.println(list);   // print list
        System.out.println("Max is : " + max);
    }
}
