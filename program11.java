import java.util.Scanner;
class FirstDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first=n/100;
        System.out.println(first % 2 == 0 ? "Even" : "Odd");
    }
}

