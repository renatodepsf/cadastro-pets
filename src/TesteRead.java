import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TesteRead {

    public static void main(String[] args) {

        ler(1);

    }

    static void ler(int numPergunta) {
        File diretorio = new File("E:\\Projetos Java\\cadastro-pets\\src\\docs\\");
        File arquivo = new File(diretorio, "formulario.txt");
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(arquivo);
            BufferedReader reader = new BufferedReader(fileReader);

            String linha = "";
            System.out.println();

            while (true) {
                if (!((linha = reader.readLine()) != null)) break;
                System.out.println(linha);
                numPergunta++;
            }
            fileReader.close();
            reader.close();
        } catch (Exception e) {
            System.out.println("erro ao ler arquivo" + e.getMessage());
        }
    }
}
