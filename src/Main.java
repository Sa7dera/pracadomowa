import java.util.Scanner;

class Osoba{
    String imie;
    String nazwisko;
    int wiek;

    public Osoba(String imie, String nazwisko, int wiek){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;

    }


    public void DaneOsoby(){
        System.out.println("imie " + imie);
        System.out.println("nazwisko "  + nazwisko);
        System.out.println("wiek " + wiek);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("podaj imie ");
        String imie = sc.nextLine();

        System.out.println("podaj nazwisko ");
        String nazwisko = sc.nextLine();

        System.out.println("podaj wiek ");
        int wiek = sc.nextInt();
        sc.close();

        Osoba osoba = new Osoba(imie, nazwisko, wiek);
        osoba.DaneOsoby();

    }
}