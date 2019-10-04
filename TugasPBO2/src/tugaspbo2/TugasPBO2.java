/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo2;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class TugasPBO2 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
     try{
            System.out.print("Input 1   : ");
            String bil1 = input.next();
            System.out.print("Input 2   : ");
            String bil2 = input.next();

            BilKom A = new BilKom();
            A.setKompleks1(bil1);
            A.setKompleks2(bil2);
            A.perkalianBilanganKompleks();
    }
     catch(Exception e){
         System.out.println("Keterangan : ");
         System.out.println("1. Jika Menulis x, Maka Tulis x+0i");
         System.out.println("2. Jika Menulis yi, Maka Tulis 0+yi");
         System.out.println("3. Jika Menulis yi+x, Maka Tulis x+yi");
     }
   }
}

    class BilKom{

    private String BilKom1;
    private String BilKom2;

    public BilKom() {
        this.BilKom1 = "0+0i";
        this.BilKom2 = "0+0i";
    }

    public BilKom(String Kompleks1, String Kompleks2) {
        this.BilKom1 = Kompleks1;
        this.BilKom2 = Kompleks2;
    }

    public String getKompleks1() {
        return BilKom1;
    }

    public void setKompleks1(String kompleks1) {
        this.BilKom1 = kompleks1;
    }

    public String getKompleks2() {
        return BilKom2;
    }

    public void setKompleks2(String kompleks2) {
        this.BilKom2 = kompleks2;
    }

    
    public void perkalianBilanganKompleks() {
        char[] temp_a = getKompleks1().toCharArray();
        char[] Temp1A = new char[temp_a.length - 1];
        System.arraycopy(temp_a, 0, Temp1A, 0, temp_a.length - 1);

        char[] TempB = getKompleks2().toCharArray();
        char[] Temp1B = new char[TempB.length - 1];
        System.arraycopy(TempB, 0, Temp1B, 0, TempB.length - 1);

        String a = String.valueOf(Temp1A);
        String[] TempA1, TempA2;
        int[] TempA = new int[2];

        String b = String.valueOf(Temp1B);
        String[] TempB1, TempB2;
        int[] TempBB = new int[2];

        if (a.charAt(0) == '-') {
            char[] penampung_a = a.toCharArray();
            char[] penampung_A = new char[penampung_a.length - 1];
            for (int j = 0; j < penampung_a.length - 1; j++) {
                penampung_A[j] = penampung_a[j + 1];
            }
            
            String PenampungA = String.valueOf(penampung_A);
            TempA1 = PenampungA.split("\\+");

            if (TempA1.length == 1) {
                TempA2 = PenampungA.split("\\-");
                TempA[0] = Integer.parseInt(TempA2[0]) * -1;
                TempA[1] = Integer.parseInt(TempA2[1]) * -1;
            } 
            else {
                TempA2 = TempA1;
                TempA[0] = Integer.parseInt(TempA2[0]) * -1;
                TempA[1] = Integer.parseInt(TempA2[1]);
            }

            if (b.charAt(0) == '-') {
                char[] penampung_b = b.toCharArray();
                char[] penampung_B = new char[penampung_b.length - 1];
                for (int j = 0; j < penampung_b.length - 1; j++) {
                    penampung_B[j] = penampung_b[j + 1];
                }
                
                String PenampungB = String.valueOf(penampung_B);
                TempB1 = PenampungB.split("\\+");

                if (TempB1.length == 1) {
                    TempB2 = PenampungB.split("\\-");
                    TempBB[0] = Integer.parseInt(TempB2[0]) * -1;
                    TempBB[1] = Integer.parseInt(TempB2[1]) * -1;
                }
                else {
                    TempB2 = TempB1;
                    TempBB[0] = Integer.parseInt(TempB2[0]) * -1;
                    TempBB[1] = Integer.parseInt(TempB2[1]);
                }
            } 
            else {
                char[] penampung_B = b.toCharArray();
                String PenampungB = String.valueOf(penampung_B);
                TempB1 = PenampungB.split("\\+");

                if (TempB1.length == 1) {
                    TempB2 = PenampungB.split("\\-");
                    TempBB[0] = Integer.parseInt(TempB2[0]);
                    TempBB[1] = Integer.parseInt(TempB2[1]) * -1;
                } 
                else {
                    TempB2 = TempB1;
                    TempBB[0] = Integer.parseInt(TempB2[0]);
                    TempBB[1] = Integer.parseInt(TempB2[1]);
                }
            }
        } 
        else {
            char[] penampung_A = a.toCharArray();
            String PenampungA = String.valueOf(penampung_A);
            TempA1 = PenampungA.split("\\+");

            if (TempA1.length == 1) {
                TempA2 = PenampungA.split("\\-");
                TempA[0] = Integer.parseInt(TempA2[0]);
                TempA[1] = Integer.parseInt(TempA2[1]) * -1;
            } 
            else {
                TempA2 = TempA1;
                TempA[0] = Integer.parseInt(TempA2[0]);
                TempA[1] = Integer.parseInt(TempA2[1]);
            }

            if (b.charAt(0) == '-') {
                char[] penampung_b = b.toCharArray();
                char[] penampung_B = new char[penampung_b.length - 1];
                for (int j = 0; j < penampung_b.length - 1; j++) {
                    penampung_B[j] = penampung_b[j + 1];
                }
                String PenampungB = String.valueOf(penampung_B);
                TempB1 = PenampungB.split("\\+");

                if (TempB1.length == 1) {
                    TempB2 = PenampungB.split("\\-");
                    TempBB[0] = Integer.parseInt(TempB2[0]) * -1;
                    TempBB[1] = Integer.parseInt(TempB2[1]) * -1;
                }
                else {
                    TempB2 = TempB1;
                    TempBB[0] = Integer.parseInt(TempB2[0]) * -1;
                    TempBB[1] = Integer.parseInt(TempB2[1]);
                }
            } 
            else {
                char[] penampung_B = b.toCharArray();
                String PenampungB = String.valueOf(penampung_B);
                TempB1 = PenampungB.split("\\+");

                if (TempB1.length == 1) {
                    TempB2 = PenampungB.split("\\-");
                    TempBB[0] = Integer.parseInt(TempB2[0]);
                    TempBB[1] = Integer.parseInt(TempB2[1]) * -1;
                } 
                else {
                    TempB2 = TempB1;
                    TempBB[0] = Integer.parseInt(TempB2[0]);
                    TempBB[1] = Integer.parseInt(TempB2[1]);
                }
            }
        }

        int Jumlah1 = TempA[0] * TempBB[0] - TempA[1] * TempBB[1];
        int Jumlah2 = TempA[0] * TempBB[1] + TempA[1] * TempBB[0];

        System.out.print("Output    : ");
        if (Jumlah1 == 0) {
            if (Jumlah2 == 0) {
                System.out.println("0");
            } else {
                System.out.println(Jumlah2 + "i");
            }
        } 
        else {
            if (Jumlah2 == 0) {
                System.out.println(Jumlah1);
            } else if (Jumlah2 > 0) {
                System.out.println(Jumlah1 + "+" + Jumlah2 + "i");
            } else {
                System.out.println(Jumlah1 + "-" + (-Jumlah2) + "i");
            }
        }
    }
}
   
