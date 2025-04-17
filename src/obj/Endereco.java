package obj;

public class Endereco {

    String cidade;
    String rua;
    Integer numero;

    public Endereco(String cidade, String rua, Integer numero) {
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
    }

    public Endereco() {
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
