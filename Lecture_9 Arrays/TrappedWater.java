// To calculate trapped water
// -> This is Question of DSA SHEET Q.22 

// step to solve this question

// calculte left max boundry - array
// calculte right max boundry - array
//loop
// waterLevel = min(left max boundry , right max boundry)
// trapped water = waterLevel - height[i]

public class TrappedWater {
    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedRainWater(height));
    }

    public static int trappedRainWater(int height[]) {
        int n = height.length;

        // to calculte left max boundry - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        
        // to calculte right max boundry - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        // loop
        int trappedWater = 0;
        for(int i=0; i<n; i++){
            // waterLevel = min(left max boundry , right max boundry)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i]; 
        }

        return trappedWater;
    }

}
