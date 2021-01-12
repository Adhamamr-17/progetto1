
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Biblioteca b1 = new Biblioteca();
        int x = 1;
        System.out.println("Benvenuto nella nostra biblioteca");
        while (x > 0) {
            System.out.println("Scegli l'operazione da fare :");
            System.out.println("1)Aggiungi utene \n2)Aggiungi libro \n3)Prestare libro \n4)Stampa i libri e gli utenti \n5)Uscire");
            int test = in.nextInt();
            switch (test) {
                case 1: {
                    System.out.println("Metti il nome utente:");
                    String a = in.nextLine();
                    String nome = in.nextLine();
                    System.out.println("Metti il cognome utente:");
                    String cognome = in.nextLine();
                    b1.aggiungiUtente(nome, cognome);
                    break;
                }
                case 2: {
                    System.out.println("Metti il titolo del libro:");
                    String a = in.nextLine();
                    String titolo = in.nextLine();
                    System.out.println("Metti il codice del libro:");
                    int codice = in.nextInt();
                    b1.aggiungiLibro(codice, titolo);
                    break;
                }
                case 3: {
                    System.out.println("Per prestare un libro devi insersire un codice di un libro esistente e un cognome presente nella lista");
                    System.out.println("Metti il cognome dell'utente che vuol prestare il libro:");
                    String a = in.nextLine();
                    String cognome = in.nextLine();
                    System.out.println("Metti il codice del libro da prestare:");
                    int codice = in.nextInt();
                    b1.creaPrestito(codice, cognome);
                    System.out.println("Hai prestato il libro");
                    break;
                }
                case 4:
                    System.out.println("Il contenuto della biblioteca:");
                    System.out.println(b1.toString());
                    break;
                case 5:
                    System.out.println("Ciao ");
                    x = 0;
                    break;
                default:
                    break;
            }
        }
    }
}