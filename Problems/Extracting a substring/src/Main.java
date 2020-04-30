import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int r1 = scanner.nextInt();
        int r2 = scanner.nextInt();

        System.out.println(str.substring(r1,r2+1));
    }
}
