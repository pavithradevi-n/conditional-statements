import java.util.Scanner;
class BitwiseOddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println((n & 1) == 0 ? "Even" : "Odd");
    }
}
