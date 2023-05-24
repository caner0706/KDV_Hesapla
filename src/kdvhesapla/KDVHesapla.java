package kdvhesapla;

import java.util.Scanner;

public class KDVHesapla {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen Miktarı Girin : ");
        double miktar = scanner.nextDouble();
        
        if(miktar <= 1000){
            double kdv = (miktar * 18 / 100);
            miktar += kdv;
            System.out.println("KDV'li Turar : " + miktar);
            System.out.println("KDV Turarı : " + kdv);
        }
        else{
            double kdv = (miktar * 8 / 100);
            miktar += kdv;
            System.out.println("KDV'li Tutar : " + miktar);
            System.out.println("KDV Tutar : " + kdv);
        }
    }
    
}
