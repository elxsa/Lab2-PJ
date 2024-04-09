package pb4;
import java.time.LocalDate;
import java.util.Scanner;

class Persoana {
    private String nume;
    private String cnp;
    public Persoana(String nume, String cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }
    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public String getCnp() {
        return cnp;
    }
    public void setCnp(String cnp) {
        this.cnp = cnp;
    }
    public int getVarsta() {
        int anNastere = Integer.parseInt(cnp.substring(1, 3));
        int lunaNastere = Integer.parseInt(cnp.substring(3, 5));
        int ziNastere = Integer.parseInt(cnp.substring(5, 7));

        int anCurent = LocalDate.now().getYear() % 100;
        int lunaCurenta = LocalDate.now().getMonthValue();
        int ziCurenta = LocalDate.now().getDayOfMonth();
        int varsta = anCurent - anNastere;
        if (lunaCurenta < lunaNastere || (lunaCurenta == lunaNastere && ziCurenta < ziNastere)) {
            varsta--;
        }
        return varsta;
    }
    public static boolean validareCNP(String cnp) {
        if (cnp.length() != 13 || !cnp.matches("\\d+")) {
            return false;
        }
        char primaCifra = cnp.charAt(0);
        if (primaCifra != '1' && primaCifra != '2' && primaCifra != '5' && primaCifra != '6') {
            return false;
        }
        int[] cifreCNP = new int[13];
        for (int i = 0; i < 13; i++) {
            cifreCNP[i] = Character.getNumericValue(cnp.charAt(i));
        }
        int suma = 0;
        for (int i = 0; i < 12; i++) {
            suma += cifreCNP[i] * (i % 9 + 1);
        }
        int cifraControlCalculata = suma % 11;
        if (cifraControlCalculata == 10) {
            cifraControlCalculata = 1;
        }
        int cifraControlData = cifreCNP[12];
        if (cifraControlCalculata != cifraControlData) {
            return false;
        }
        return true;
    }
}
public class MainPb4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // citire nr. persoane
        System.out.print("Introduceti numarul de persoane: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        // vector stocare persoane
        Persoana[] persoane = new Persoana[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Persoana " + (i + 1) + ":");
            System.out.print("Nume: ");
            String nume = scanner.nextLine();
            String cnp;
            do {
                System.out.print("CNP: ");
                cnp = scanner.nextLine();
                if (!Persoana.validareCNP(cnp)) {
                    System.out.println("CNP-ul introdus nu este valid! Reintroduceti CNP.");
                }
            } while (!Persoana.validareCNP(cnp));
            // adaugare in vector
            persoane[i] = new Persoana(nume, cnp);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Persoana " + (i + 1) + ":");
            System.out.println("Nume: " + persoane[i].getNume());
            System.out.println("CNP: " + persoane[i].getCnp());
            System.out.println("Varsta: " + persoane[i].getVarsta());
            System.out.println();
        }
        scanner.close();
    }
}

