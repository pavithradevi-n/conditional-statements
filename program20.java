import java.util.Scanner;
class AsciiCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        System.out.println((ch%2==0)?"Even":"Odd");
    }
}
