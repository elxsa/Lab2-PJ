package pb1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MainPb1 {
    public static void main(String[] args) {
        try {
            // citire judete din fisier
            String[] judete = citesteJud("judete_in.txt");

            // sortare tablou
            Arrays.sort(judete);
            System.out.println("Lista judetelor sortate:");
            for (String judet : judete) {
                System.out.println(judet);
            }
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduceti judetul cautat: ");
            String judCautat = scanner.nextLine();

            // cautare judet in tablou sortat

            int pozitie = Arrays.binarySearch(judete, judCautat);
            if (pozitie >= 0) {
                System.out.println("Judetul " + judCautat + " se afla pe pozitia " + (pozitie + 1) + " in lista de judete");
            } else {
                System.out.println("Judetul " + judCautat + " NU a fost gasit in lista de judete!");
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul nu a fost gasit: " + e.getMessage());
        }
    }

    public static String[] citesteJud(String numeFisier) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(numeFisier));
        int numarJudete = 0;
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            numarJudete++;
        }
        scanner.close();
        String[] judete = new String[numarJudete];
        scanner = new Scanner(new File(numeFisier));
        for (int i = 0; i < numarJudete; i++) {
            judete[i] = scanner.nextLine();
        }
        scanner.close();
        return judete;
    }
}
