import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int K = in.nextInt();
            
            
            
            int max = 0;

            for (int j = 1; j < n; j++) {
                for (int k = j + 1; k <= n; k++) {
                    int h = j & k;
                    if (h < K && max < h) {
                        max = h;
                    }
                }
            }

            System.out.println(max);
        }
    }
}
