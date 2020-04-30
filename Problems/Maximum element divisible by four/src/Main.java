import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x=0,r=0;

        for (int i=0;i<n;i++){
           x = scanner.nextInt();
           if (x%4==0 && x>r){
               r = x;
           }
        }
        System.out.println(r);
    }
}
