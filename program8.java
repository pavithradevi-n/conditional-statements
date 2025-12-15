import java.util.Scanner;
class LastDigitDiv3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int last=n % 10;
        System.out.println(last % 3 == 0 ? "Yes" : "No");
    }
}
