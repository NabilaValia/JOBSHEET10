import java.util.Scanner;

public class ModifikasiBioskop11nomor7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        for (String[] baris : penonton) {
            System.out.printf("%s \t %s\n", baris[0], baris[1]);
        }
        int index = 0;
        for (String[] baris : penonton) {
            System.out.println("Panjang baris " + ": " + baris.length);
        }
        System.out.println("Nama penonton pada baris ke-3:");
        for (int i = 0; i < penonton[2].length; i++) {
            System.out.println(penonton[2][i]);
        }
        System.out.println("Jumlah total baris: " + penonton.length);
    }
}