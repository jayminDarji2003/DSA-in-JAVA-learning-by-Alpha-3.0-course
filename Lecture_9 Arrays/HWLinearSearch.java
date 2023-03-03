
// Linear search :- making nenu array and search on that

public class HWLinearSearch {
    public static void main(String[] args) {
        String menu[] = {"Dosa" , "Chole bhature" , "samosa" , "cock"};
        String key = "cock";

        int index = linearSearch(menu, key);

        if (index == -1) {
            System.out.println("NOT FOUND!!!");
        } else {
            System.out.println("key is found at : " + index);
        }
    }

    public static int linearSearch(String numbers[], String key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

}
