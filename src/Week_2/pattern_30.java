package Week_2;

import java.util.*;
public class pattern_30 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        solve(n);

        sc.close();
    }

    public static void solve(int n){
        int space = 1, star = n, val = 5;
        int row = 1;

        while (row <= n){
            int col = 1;
            while (col <= star){
                System.out.print(val + " ");
                col++;
                val--;
            }
            row++;
            val = 5;
            System.out.println();
        }
    }
}
