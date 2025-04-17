import utils.Escrita;
import utils.Leitura;

import java.util.Scanner;

public class CadastroPetsApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer op;

        do {
            Leitura.menu();

            String next = scan.next();
            op = next.matches("[0-9]+") ? Integer.valueOf(next) : -1;

            switch (op) {
                case 1:
                    Escrita.cadastrarPet();
            }

            if (op <= 0) {
                System.out.println("ATENÇÃO: Não é permitido 0, números negativos, letras ou caracteres especiais\n");
            }
        } while (!op.equals(6));
    }
}
