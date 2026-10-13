import java.util.Scanner;
public class studycase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargapercup = 18000;
        int totalharga, diskon, 
            totalbayar;
        int kembalian, kurang;

        System.out.print("jumlahcup :");
        int jumlahcup = sc.nextInt();
        
        System.out.print("uangbayar :");
        int uangbayar = sc.nextInt();

        totalharga = jumlahcup * hargapercup;
        diskon = 0;
        if (totalharga >= 100000) {
            diskon = totalharga * 10/100;
        }
        totalbayar = totalharga - diskon;
        System.out.println("diskon" + diskon);
        System.out.println("totalharga : " + totalharga);
        System.out.println("Totalbayar :" + totalbayar); 
        
        if (uangbayar>= totalbayar) {
            kembalian = uangbayar - totalbayar;
            System.out.println("duek mu balek bos : " + kembalian);            
        }else{
            kurang = totalbayar - uangbayar;
            System.out.println("uangmu gk cukup bloug : " + kurang);
        }
    sc.close();
    }
}
