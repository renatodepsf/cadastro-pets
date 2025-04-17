package utils;

import excecoes.PetException;
import obj.*;

import java.util.*;

public class Escrita {

    static Scanner scan = new Scanner(System.in);

    public static boolean cadastrarPet() {
        Pet pet = new Pet();
        List<Pergunta> perguntas = Leitura.formulario();

            perguntas.stream().forEach(pergunta -> {

                switch (pergunta.getNrPergunta()) {
                    case 1:
                        System.out.println(pergunta.getNmPergunta());
                        String resp = scan.nextLine();
                        String nomeCompleto = null;
                        try {
                            nomeCompleto = validaNomeSobrenome(resp);
                        } catch (PetException e) {
                            throw new RuntimeException(e);
                        }
                        pet.setNome(nomeCompleto);
                        break;

                    case 2:
                        System.out.println(pergunta.getNmPergunta());
                        String tipoPet = scan.nextLine();
                        Tipo tipo = (Tipo) validaTipoPet(tipoPet, null);
                        pet.setTipo(tipo);
                        break;

                    case 3:
                        System.out.println(pergunta.getNmPergunta());
                        String sexoPet = scan.nextLine();
                        Sexo sexo = (Sexo) validaTipoPet(null, sexoPet);
                        pet.setSexo(sexo);
                        break;

                    case 4:
                        System.out.println(pergunta.getNmPergunta());
                        System.out.println("i. Numero da casa");
                        String numero = scan.next();
                        System.out.println("ii. Cidade");
                        String cidade = scan.next();
                        System.out.println("iii. Rua");
                        String rua = scan.next();
                        pet.setEndereco(new Endereco(cidade, rua, Integer.valueOf(numero)));
                }
            });


        return false;
    }

    private static Object validaTipoPet(String tipoPet, String sexoPet) {
        if (sexoPet == null) {
            return tipoPet.toLowerCase().equals("cachorro") ? Tipo.CACHORRO :
                    tipoPet.toLowerCase().equals("gato") ? Tipo.GATO : null;
        } else {
            return sexoPet.toLowerCase().equals("macho") ? Sexo.MACHO :
                    sexoPet.toLowerCase().equals("femea") ? Sexo.FEMEA : null;
        }
    }

    private static String validaNomeSobrenome(String resp) throws PetException {
        String nomeConcatenado = "";

        String[] split = resp.split("\\s+", 0);

        if (split.length < 2) {
            throw new PetException("Erro: falta nome e sobrenome ou dados inválidos");
        }

        for (int i = 0; i < split.length; i++) {
            nomeConcatenado += String.join("", new String[]{resp.split("\\s+", 0)[i]});
        }

        String nomeCompleto = String.join(" ", split);

        return nomeConcatenado.matches("[a-zA-Z]{3,}") ? nomeCompleto : null;
    }
}
