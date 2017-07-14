import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] values = new int[length];
        
        for(int i = 0; i < length; i++) {
            values[i] = input.nextInt();
            }
        
        for(int i = length-1; i >=0; i--){
            System.out.print(values[i] + " ");
        }
    }
}
