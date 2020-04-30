import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n!=1) {
            if (n%2!=0) {
                System.out.print(n + " ");
                n = n*3 +1;
            } else {
                System.out.print(n + " ");
                n /= 2;
            }
        }
        System.out.println(n);
    }
}
