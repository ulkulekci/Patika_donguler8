import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayisi Giriniz:");
        int n= input.nextInt();
        int j,a=1,k,m=0,i;
        for ( i = 1; i <= n ; i++){
            for(k=0;k<n-m;k++){
                System.out.print(" ");
            }
            for(j=0;j<a;j++) {
                System.out.print("*");

            }
a=a+2;
            m++;
            System.out.print("\n");

        }
        m=2;
        a=a-2;
        for(i=0;i<n;i++)
        {
            a=a-2;
            for(k=0;k<m;k++){
                System.out.print(" ");
            }
            for(j=0;j<a;j++) {
                System.out.print("*");
            }
            m++;
            System.out.print("\n");
        }
    }
}
