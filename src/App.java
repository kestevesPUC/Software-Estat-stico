import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class App {
    /**
     * Método para "limpar" tela console
     */
    public static void clear() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void menu() {

        System.out.println(" ------------------------- ");
        System.out.println("|   SELECIONE UMA OPÇÃO:  |");
        System.out.println(" ========================= ");
        System.out.println("|1º - Poisson             |");
        System.out.println("|2º -                     |");
        System.out.println("|3º -                     |");
        System.out.println("|4º -                     |");
        System.out.println("|5º -                     |");
        System.out.println("|6º - Sair                |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println(" ------------------------- ");

        System.out.print("\nOpção: ");
    }
    public static void main(String[] args) throws Exception {
        clear();
            
        Scanner k = new Scanner(System.in);
        int opicao = 0;
        Poisson x = new Poisson();
            do{
                    menu();        
                    opicao = Integer.parseInt(k.nextLine());        
                    switch(opicao) {
                        
                        case 1:
                            clear();
                            
                            System.err.print("Informe o número de ocorrencias: ");
                            x.setOcorrencias(Double.parseDouble(k.nextLine()));
                            clear();
                            System.out.print("Informe o tempo padrão: ");
                            x.setTempo(Double.parseDouble(k.nextLine()));
                            clear();
                            System.out.print("Informe o tempo esperado, ou 'Sucesso': ");
                            x.setX(Integer.parseInt(k.nextLine()));
                            clear();

                            System.out.println("Resultado: " + x.calculateEquacao());
                            TimeUnit.SECONDS.sleep(2);

                            System.out.println("\n\nPressione enter para continuar: ");
                            String aux = k.nextLine();

                            clear();
                            opicao = 0;
                        break;

                        case 2:
                       

                        System.out.println("\n\nPressione enter para continuar: ");
                        aux = k.nextLine();

                        clear();
                        opicao = 0;
                        break;

                        case 6:
                            clear();
                            System.out.println("Obrigado e volte sempre!");
                            opicao = -1;
                            TimeUnit.SECONDS.sleep(2);
                            clear();
                        break;

                        default:

                            clear();
                            System.out.println("O valor informado é invalido!\nEscolha um valor entre 1 e 6.");
                            System.out.println("\n\n\n");
                            opicao = 0;
                        break;
                    }
                
            } while (opicao >= 0);
        }
}
