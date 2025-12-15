import java.util.Scanner;
class Div3Or7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n%3==0 || n%7==0);
    }
}

