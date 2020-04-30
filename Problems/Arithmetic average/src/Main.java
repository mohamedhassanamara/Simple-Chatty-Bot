import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int k=0, s=0;

        for (int i=a;i<=b;i++){
            if (i%3==0){
                k++;
                s+=i;
            }
        }
        System.out.println((double) s/(double) k);
    }
}
