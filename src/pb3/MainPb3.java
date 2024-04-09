package pb3;
import java.util.Scanner;

public class MainPb3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // citire sir original
        System.out.print("Introduceti șirul original: ");
        String original = scanner.nextLine();
        // citire sir inserat
        System.out.print("Introduceti șirul de inserat: ");
        String deInserat = scanner.nextLine();
        // citim pozitia
        System.out.print("Introduceti pozitia de inserare: ");
        int pozitie = scanner.nextInt();
        StringBuilder sb = new StringBuilder(original);
        // inseram al doilea sir in sirul original
        sb.insert(pozitie, deInserat);
        // afisare sir (dupa inserare)
        System.out.println("Sirul dupa inserare: " + sb.toString());
        System.out.print("Introduceti pozitia de stergere: ");
        int pozitieStergere = scanner.nextInt();
        System.out.print("Introduceti nr. de caractere de sters: ");
        int numarCaractere = scanner.nextInt();
        sb.delete(pozitieStergere, pozitieStergere + numarCaractere);
        // afisare sir rezultat
        System.out.println("Sirul dupa stergere (sir final): " + sb.toString());
        scanner.close();
    }
}

