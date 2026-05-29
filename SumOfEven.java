import java.util.Scanner;
public class SumOfEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            sum+=i;
        }
        System.out.println("Sum of N Numbbers="+sum);
        sc.close();
    }
}
