import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        int n1 = n%10;
        int n2 = n/100;
        int n3 = n%100 - n1;
        System.out.println(n1*100+n3+n2);
    }
}