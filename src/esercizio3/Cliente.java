package esercizio3;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class Cliente {
    private int codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private Date dataIscrizione;

    public Cliente(int codiceCliente, String nome, String cognome, String email, Date dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;

    }

    public Cliente(Random random, String dario, String cecchinato, String mail, LocalDate now) {

    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public Date getDataIscrizione() {
        return dataIscrizione;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codiceCliente=" + codiceCliente +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", dataIscrizione=" + dataIscrizione +
                '}';
    }
}
