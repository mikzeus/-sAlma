import java.util.Scanner;

public class usAlma {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int n,k,total=1;

        System.out.println("taban sayıyı giriniz:");
        n= inp.nextByte();
        System.out.println("üs saysıyı giriniz:");
        k=inp.nextInt();

       // while(i<=k){
        // total*=n;
        // i++;

        for (int i=1;i<=k; i++){
            total*=n;
        }
        System.out.println("sonuç:"+ total);
    }
}
