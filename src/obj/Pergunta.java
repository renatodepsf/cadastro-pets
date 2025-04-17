package obj;

public class Pergunta {

    Integer nrPergunta;
    String nmPergunta;

    public Pergunta(int nrPergunta, String nmPergunta) {
        this.nrPergunta = nrPergunta;
        this.nmPergunta = nmPergunta;
    }

    public Pergunta() {
    }

    public Integer getNrPergunta() {
        return nrPergunta;
    }

    public void setNrPergunta(Integer nrPergunta) {
        this.nrPergunta = nrPergunta;
    }

    public String getNmPergunta() {
        return nmPergunta;
    }

    public void setNmPergunta(String nmPergunta) {
        this.nmPergunta = nmPergunta;
    }
}
