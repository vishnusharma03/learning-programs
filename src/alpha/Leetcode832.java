package alpha;

import java.util.Arrays;

public class Leetcode832 {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        System.out.println(Arrays.toString(flipAndInvertImage(image)));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        //flipping the elements of array.
        for (int i = 0; i < image.length; i++) {
            for (int col = 0; col < image[i].length / 2; col++) {
                int last = image[i].length - col - 1;
                int temp = image[i][col];
                image[i][col] = image[i][last];
                image[i][last] = temp;
            }
        }
        //Inverting the image.

        for (int i = 0; i < image.length; i++) {
            for (int col = 0; col < image[i].length; col++) {
                if (image[i][col] == 1){
                    image[i][col] = 0;
                }
                else{
                    image[i][col] = 1;
                }
            }
        }
        return image;
    }
}
