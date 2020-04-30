import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        boolean check = true;
        while (y != 0) {

            int z = scanner.nextInt();
            if (z == 0){
                break;
            }
            if (!(x <= y && y <= z) && !(x >= y && y >= z)) {

                check = false;
            }
            x=y;
            y=z;


        }
        System.out.println(check);
    }
}