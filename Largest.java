import java.util.Scanner;
public class Largest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int digit=num%10;
        int largest=digit;
        while (num!=0) {
            digit=num%10;
            if(digit>largest){
                largest=digit;
            }
            num=num/10;
        }
        System.out.println(largest);
        sc.close();
    }
}
