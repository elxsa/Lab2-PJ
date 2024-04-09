package pb2;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

class Vers {
    private String vers;

    public Vers(String vers) {
        this.vers = vers;
    }

    public int numarCuvinte() {
        return vers.split("\\s+").length;
    }

    public int numarVocale() {
        int numarVocale = 0;
        for (char c : vers.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                numarVocale++;
            }
        }
        return numarVocale;
    }

    public String convertesteInMajuscule() {
        return vers.toUpperCase();
    }

    public String toString() {
        return vers;
    }
}

public class MainPb2 {
    public static void main(String[] args) {
        try {
            // Citim versurile din fișier
            Vers[] versuri = citesteVersuri("cantec_in.txt");

            // Citim gruparea de litere de la tastatură
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduceți gruparea de litere: ");
            String grupare = scanner.nextLine();

            // Deschidem fișierul pentru scriere
            FileWriter writer = new FileWriter("cantec_out.txt");

            // Scriem versurile în fișierul de ieșire, efectuând operațiile cerute
            Random random = new Random();
            for (Vers vers : versuri) {
                // Verificăm dacă generăm numere mai mici decât 0.1 pentru a scrie versul cu majuscule
                if (random.nextDouble() < 0.1) {
                    writer.write(vers.convertesteInMajuscule());
                } else {
                    writer.write(vers.toString());
                }

                // Adăugăm numărul de cuvinte și numărul de vocale în dreptul fiecărui vers
                writer.write(" (" + vers.numarCuvinte() + " cuvinte, " + vers.numarVocale() + " vocale)");

                // Adăugăm o steluță la sfârșitul rândurilor care se încheie cu gruparea de litere aleasă
                if (vers.toString().endsWith(grupare)) {
                    writer.write(" *");
                }

                // Trecem la următorul rând
                writer.write("\n");
            }

            // Închidem fișierul de ieșire
            writer.close();

            System.out.println("Fișierul cantec_out.txt a fost creat cu succes.");
        } catch (IOException e) {
            System.out.println("Eroare la scrierea în fișier: " + e.getMessage());
        }
    }

    public static Vers[] citesteVersuri(String numeFisier) throws IOException {
        File file = new File(numeFisier);
        Scanner scanner = new Scanner(file);
        int numarVersuri = 0;
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            numarVersuri++;
        }
        scanner.close();

        Vers[] versuri = new Vers[numarVersuri];
        scanner = new Scanner(file);
        for (int i = 0; i < numarVersuri; i++) {
            versuri[i] = new Vers(scanner.nextLine());
        }
        scanner.close();

        return versuri;
    }
}
