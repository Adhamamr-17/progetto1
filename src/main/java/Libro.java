public class Libro {
    
    private int codice;
    private String titolo;
    private Utente utenteAssegnato;

    public Libro(int unCodice, String unTitolo) {
        this.codice = unCodice;
        this.titolo = unTitolo;
        utenteAssegnato = null;
    }

    public Utente getUtenteAssegnato() {
        return utenteAssegnato;
    }

    public void setUtenteAssegnato(Utente unUtente) {
        utenteAssegnato = unUtente;
    }

    public int getCodice() {
        return codice;
    }
    
    @Override
    public String toString() {
        return utenteAssegnato + " " + codice + " " + titolo;
    }
}