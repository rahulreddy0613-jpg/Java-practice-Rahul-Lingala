import java.util.Scanner;
public class Fibonaccisum {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("number of values");
        int n = sc.nextInt();
        int a=0,b=1,sum=0;
        System.out.println("Fibonacciseries");
        for(int i =1;i <=n;i++){
            System.out.print(a+"");
            sum+=a;
            int next=a+b;
            a=b;
            b=next;
        }
        System.out.println("sum of Fibonacci series ="+sum);
        sc.close();
    }
}
