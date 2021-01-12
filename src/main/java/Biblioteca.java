import java.util.ArrayList;
public class Biblioteca {

    private  ArrayList<Libro> libri;
    private  ArrayList<Utente> utenti;

    public Biblioteca() {
        utenti = new ArrayList<Utente>();
        libri = new ArrayList<Libro>();
    }

    private int cercaCodice(int unCodice) {
        int test = -1;
        for (int x = 0; x < libri.size(); x++) {
            if (libri.get(x).getCodice() == unCodice) {
                test = x;
            }
        }
        return test;
    }

    private int cercaUtente(String unCognome) {
        int test = -1;
        for (int x = 0; x < utenti.size(); x++) {
            if (utenti.get(x).getCognome().equals(unCognome)) {
                test = x;
            }
        }
        return test;
    }

    public void aggiungiUtente(String unNome, String unCognome) {
        if (cercaUtente(unCognome) != -1) {
            System.out.println("Questo nome e` gia` nella lista");
            return ;
        }
        Utente u1 = new Utente(unNome, unCognome);
        utenti.add(u1);
        System.out.println("L'utente e` aggiunto");
    }

    public void aggiungiLibro(int unCodice, String unTitolo) {
        if (cercaCodice(unCodice) != -1) {
            System.out.println("Questo libro e` gia` nella lista");
            return;
        }
        Libro l1 = new Libro(unCodice, unTitolo);
        libri.add(l1);
        System.out.println("Il libro e` aggiunto");
    }

    public void creaPrestito(int unCodice, String unCognome) {
        libri.get(cercaCodice(unCodice)).setUtenteAssegnato(utenti.get(cercaUtente(unCognome)));
    }

    @Override
    public String toString() {
        String collega = "" ;
        collega = "Libri = " + libri + " Utenti = " + utenti ;
        return collega;
    }
}