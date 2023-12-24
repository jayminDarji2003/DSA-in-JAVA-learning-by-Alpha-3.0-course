/*
    query on segment tree. 
*/

public class Query_ST {
    static int tree[];

    // initialization tree
    public static void init(int n) {
        tree = new int[n * 4];
    }

    public static int buildST(int arr[], int i, int start, int end) {
        // base case
        if (start == end) {
            tree[i] = arr[start];
            return arr[start];
        }

        int mid = (start + end) / 2;

        buildST(arr, 2 * i + 1, start, mid); // left subtree - 2*i+1
        buildST(arr, 2 * i + 2, mid + 1, end); // right subtree - 2*i+2
        tree[i] = tree[2 * i + 1] + tree[2 * i + 2];
        return tree[i];
    }


    public static int getSumUtil(int i,int si, int sj, int qi, int qj){
        if(qj <= si || qi >= sj){  // non overlapping case
            return 0;
        }  
        else if(si >= qi && sj <= qj){  // complete overlapping case
            return tree[i];
        }
        else{ // partial overlapping
            int mid = (si + sj) / 2;
            int left = getSumUtil(2*i+1, si, mid, qi, qj);
            int right = getSumUtil(2*i+2, mid+1, sj, qi, qj);
            return left + right;
        }
    }

    public static int getSum(int arr[], int qi, int qj){
        int n = arr.length;
        return getSumUtil(0, 0, n-1, qi, qj);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;
        init(n);
        buildST(arr, 0, 0, n - 1);

        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
        System.out.println();

        System.out.println("Ans = "+getSum(arr,2,5));
    }
}

