import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int num = inp.nextInt();
        f(num);
    }
    public static int f(int a){
        int temp = a;
        for(temp=a; temp>=0;temp-=5){
            System.out.println(temp);
        }
        for(int z=temp;z<=a;z+=5){
            System.out.println(z);
        }
        return 0;
    }
}