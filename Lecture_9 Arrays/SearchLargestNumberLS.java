    // find largest elemtnt on a array

public class SearchLargestNumberLS {
    public static void main(String[] args) {
        int numbers[] = {12,18,4,3,7,8};
        System.out.println("Largest number is : " + getLargest(numbers));
    }

    public static int getLargest(int numbers[]){

        int largest = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }

}
