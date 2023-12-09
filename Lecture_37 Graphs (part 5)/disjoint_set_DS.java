/*
    Disjoint set Data Structure :-)
        It is also called as :-
            1. Union Find data structure
            2. Merge data structure

        It has only two methods :-
            1. find()
            2. union()
*/

public class disjoint_set_DS {

    static int n = 7;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    // here we are initialized the par arrays with some values.
    public static void init() {
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    // find function
    public static int find(int x) {
        if (x == par[x]) {
            return x;
        }

        // return par[x] = find(par[x]); // optimized
        return find(par[x]);
    }

    // union function
    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }
    }

    public static void main(String[] args) {
        init();
        System.out.println(find(3));
        union(1, 3);
        System.out.println(find(3));
        union(2, 4);
        union(3, 6);
        union(1, 4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1, 5);
    }
}
