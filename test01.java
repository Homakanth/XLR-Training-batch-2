import java.util.Scanner;
class test01{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=scanner.nextInt();
            for(int i=1;i<=n;i++){
                if(i==5 | i==7){
                    continue;
                }
            System.out.println(i);
            }
    }
}