package esercizio3;

import java.time.LocalDate;

public class Cliente {
    private int codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataIscrizione;

    public Cliente(int codiceCliente, String nome, String cognome, String email, LocalDate dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    public int getCodiceCliente() {
        return codiceCliente;
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

    public LocalDate getDataIscrizione() {
        return dataIscrizione;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codiceCliente='" + codiceCliente + '\'' +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", dataIscrizione=" + dataIscrizione +
                '}';
    }
}
