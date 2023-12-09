/*
    Flood fill algorithm:-
        leetcode question.
        here are using graph implicitly.
*/

public class Flood_fill_algo {

    public static void helper(int[][] image, int sr, int sc, int color, boolean[][] vis, int orgCol) {
        // base cases
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol) {
            return;
        }

        image[sr][sc] = color;

        // left
        helper(image, sr, sc - 1, color, vis, orgCol);

        // right
        helper(image, sr, sc + 1, color, vis, orgCol);

        // up
        helper(image, sr - 1, sc, color, vis, orgCol);

        // down
        helper(image, sr + 1, sc, color, vis, orgCol);

    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);

        return image;
    }

    // print image
    public static void printImage(int[][] image){
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] image = {
                { 1, 1, 1 },
                { 1, 1, 0 },
                { 1, 0, 1 }
        };

        int sr = 1;
        int sc = 1;
        int color = 2;
        
        System.out.println("--------------- Original image ------------- ");
        printImage(image);
        
        int ans[][] = floodFill(image, sr, sc, color);


        System.out.println("--------------- new image ------------- ");
        printImage(ans);
    }
}
