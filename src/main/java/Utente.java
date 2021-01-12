public class Utente {

    private String nome;
    private String cognome;

    public Utente(String unNome, String unCognome) {
        this.nome = unNome;
        this.cognome = unCognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    @Override
    public String toString() {
        return nome + " " + cognome;
    }
}