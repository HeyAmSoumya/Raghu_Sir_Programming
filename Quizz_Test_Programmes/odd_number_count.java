import java.util.Scanner;

public class odd_number_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int count =0;
        for(int i = 1; i<=n; i++)
        {
            if(i%2 == 0)
            {

            }
            else {
                count++;
            }

        }
        System.out.println(count);

    }
}
