import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int g1 = scanner.nextInt();
        int g2 = scanner.nextInt();
        int g3 = scanner.nextInt();

        g1 += 1;
        g2 += 1;
        g3 += 1;
        System.out.println(g1/2+g2/2+g3/2);
    }
}