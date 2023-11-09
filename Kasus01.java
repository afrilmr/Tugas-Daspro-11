import java.util.Scanner;

public class Kasus01 {
    public static void main(String[] args) {
        
        Scanner sc01 = new Scanner(System.in);
        int baris = 5;
        int kolom = 5;

        // Loop luar untuk iterasi baris
        for (int i = 1; i <= baris; i++) {

            // Loop dalam untuk iterasi kolom
            for (int j = 1; j <= kolom; j++) {
                System.out.print(i * j + " ");
            }

            System.out.println();
        }
    }
}
