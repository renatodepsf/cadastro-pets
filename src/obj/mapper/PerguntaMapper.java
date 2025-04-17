package obj.mapper;

import obj.Pergunta;

public class PerguntaMapper {

    public static Pergunta mapToPergunta(String s) {
        Pergunta pergunta = new Pergunta();
        pergunta.setNmPergunta(s.split(" - ")[1]);
        pergunta.setNrPergunta(Integer.parseInt(s.split(" - ")[0]));
        return pergunta;
    }
}
