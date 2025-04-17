package utils;

import obj.Pergunta;
import obj.mapper.PerguntaMapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Leitura {

    static List<String> lsPerguntas = new ArrayList<>();

    public static List<Pergunta> formulario() {
        File diretorio = new File("E:\\Projetos Java\\cadastro-pets\\src\\docs\\");
        File arquivo = new File(diretorio, "formulario.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(arquivo);
            BufferedReader reader = new BufferedReader(fileReader);

            String pergunta = "";
            System.out.println();

            while (true) {
                if (!((pergunta = reader.readLine()) != null)) break;
                lsPerguntas.add(pergunta);
            }
            fileReader.close();
            reader.close();
        } catch (Exception e) {
            System.out.println("erro ao ler arquivo" + e.getMessage());
        }
        return lsPerguntas.stream().map(PerguntaMapper::mapToPergunta).collect(Collectors.toList());
    }

    public static void menu() {
        System.out.println("1. Cadastrar um novo pet\n" +
                "2. Alterar os dados do pet cadastrado\n" +
                "3. Deletar um pet cadastrado\n" +
                "4. Listar todos os pets cadastrados\n" +
                "5. Listar pets por algum critério (idade, nome, raça)\n" +
                "6. Sair");
    }

}
