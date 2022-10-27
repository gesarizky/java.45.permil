
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gesa Rizky Nugraha
 */
public class permil {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(" *************************************************************");
        System.out.println(" *Masukkan Nilai a (dari pecahan  a/b) ");
        System.out.println(" *************************************************************");

        double a = sc.nextInt();
        int inta = (int)a;

        System.out.println(" ************************************************************* ");
        System.out.println(" *Masukkan Nilai b (dari pecahan " + inta + "/b)");
        System.out.println(" ************************************************************* ");

        double b = sc.nextInt();
        int intb = (int)b;

        double hasildesimal = a / b;
        double hasilpermil = hasildesimal * 1000;

        System.out.println(" *********************************************************** ");
        System.out.println(" *Maka Bentuk Sederhana  dari pecahan " + inta + "/" + intb);
        System.out.println(" *Maka Hasil Permil = " + hasilpermil);
        System.out.println(" *Maka Hasil Desimal = " + hasildesimal);
        System.out.println(" ********************************************************** ");
    }

}
