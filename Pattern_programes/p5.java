import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i= 1; i<=n; i++)
        {
            for(int j= 1; j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1; j<=(2 * i -1); j++)
            {
                if(i %2 == 0)
                {
                    System.out.print("0 ");
                }
                else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
