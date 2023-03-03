import java.util.ArrayList;

// Contains with most water problem

public class Question_1 {

    // Approach 1 - Brute force
    // public static int storedWater(ArrayList<Integer> height){
    //     int maxWater = 0;
    //     // brute force - O(n^2)
    //     for(int i=0; i<height.size(); i++){
    //         for(int j=i+1; j<height.size(); j++){
    //             int ht = Math.min(height.get(i) , height.get(j)); 
    //             int wt = j-i;
    //             int currWater = ht * wt;
    //             maxWater = Math.max(maxWater, currWater);
    //         }
    //     }
    //     return maxWater;
    // }


    // Approach 2 - 2 pointer approach
    public static int storedWater(ArrayList<Integer> height){
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while(lp < rp){
            // calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int wt = rp-lp;
            int currWater = ht * wt;
            maxWater = Math.max(maxWater, currWater);

            // update ptr
            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        // height = 1 8 6 2 5 4 8 3 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storedWater(height));

    }
}
