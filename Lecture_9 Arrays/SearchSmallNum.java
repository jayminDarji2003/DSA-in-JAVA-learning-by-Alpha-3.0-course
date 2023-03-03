public class SearchSmallNum {
    public static void main(String[] args) {
        int numbers[] = {12,13,14,15,16,9,7,5};
        System.out.println("Smallest number is : "  + getSmall(numbers));
    }

    public static int getSmall(int numbers[]){
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }

}
