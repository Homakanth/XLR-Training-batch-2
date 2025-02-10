import java.util.Scanner;
class demo019{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scanner.nextInt();
        int a=0,b=1,temp;
        System.out.println("Fibonacci series: ");
        for(int i=1;i<num;i++){
            System.out.print(a + " ");
                temp = a + b;
                a = b;
                b = temp;
        }
    }
}