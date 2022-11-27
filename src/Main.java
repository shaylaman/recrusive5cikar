import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int num =inp.nextInt();
        int n=num;
        int turn=1;
        if(num>0){
            printerPos(num,n,turn);
        }
        else{
            printerNeg(num,n,turn);
        }



    }
    static void printerPos(int x,int y,int turn){
        if(turn>2){
            System.exit(0);
        }
        if(x>0){
            System.out.print(x+" ");
            printerPos(x-5,y,turn);
        }
        else{
            printerNeg(x,y,turn+1);
        }
    }
    static void printerNeg(int x,int y,int turn){
        if(turn>2){
            System.exit(0);
        }
        if(x<=y){
            System.out.print(x+" ");
            printerNeg(x+5,y,turn);
        }
        else{
            printerPos(x,y,turn+1);
        }
    }


}