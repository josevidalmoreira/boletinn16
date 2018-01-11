
package boletin16;

import com.jose.Clase.Persoal;


public class Academica {
    private String nome;
    private int nota;
    private Persoal alum;
    private final int numReferencia =  2018;

    public Academica(String nome, int nota, Persoal alum) {
        this.nome = nome;
        this.nota = nota;
        this.alum = alum;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Persoal getAlum() {
        return alum;
    }

    public void setAlum(Persoal alum) {
        this.alum = alum;
    }

    @Override
    public String toString() {
        return "Academica{" + "nome=" + nome + ", nota=" + nota + ", alum=" + alum + ", numReferencia=" + numReferencia + '}';
    }
    

    
}
