package Week_2;

import java.util.*;
public class pattern_14 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        solve(n);

        sc.close();
    }

    public static void solve(int n){
        int space = n-1, star = 1;
        int row = 1;

        while (row <= 2*n){
            int col = 1;
            while (col <= space){
                System.out.print("  ");
                col++;
            }
            col = 1;
            while (col <= star){
                System.out.print("* ");
                col++;
            }

            if(row < n) {
                star++;
                space--;
            }
            else {
                star--;
                space++;
            }
            row++;
            System.out.println();
        }
    }
}
