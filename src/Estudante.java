
import java.util.ArrayList;

public class Estudante {

    ArrayList<Double> notas = new ArrayList<Double>();

    //Atributos
    private String name;

    private boolean aprovado;


//Métodos

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    //COMO GUARDAR OS DADOS INSERIDOS NO ARRAY DO PROGRAMA PRINCIPAL?

    public double media() {

         double soma = 0;

        for (int i=0; i<notas.size(); i++) {
             soma += notas.get(i);
        }

        double media = soma/notas.size();
        if (media>7.0) {
            aprovado = true;
        } else {
            aprovado = false;
        }
        return media;

    }


}
