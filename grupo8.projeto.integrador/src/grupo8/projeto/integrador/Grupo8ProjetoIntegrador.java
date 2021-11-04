/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo8.projeto.integrador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author muril
 */
public class Grupo8ProjetoIntegrador {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    static String playerName = "";
    static String score[][] = new String[5][4];

    public static void main(String[] args) throws InterruptedException {
        showLogo();
        showWelcome();
        playerName = entrada.next();
        Thread.sleep(2000);
        showGameMenu();

    }

    public static void showGreetings(String playerName) {
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("|              Ola, " + playerName.toUpperCase());
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("");

    }

    public static void showLogo() {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
                + "@(                                                                                                @@\n"
                + "@(    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&@@&    @@\n"
                + "@(    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&%##(((((#%&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@@@@@@@@@@@@@@@@(,                                    ./&@@@@@@@@@@@@@@@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@@@@@@@@@/                                                    *&@@@@@@@@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@@@@*                                                              *@@@@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@(                                                                      #@@@@@@@@    @@\n"
                + "@(    @@@@@%                                                                            @@@@@@    @@\n"
                + "@(    @@@(                                                                                @@@@    @@\n"
                + "@(    @@                                                                                   ,@@    @@\n"
                + "@(    &                                                                                     ,@    @@\n"
                + "@(                                                                                           #    @@\n"
                + "@(                                                                                           .    @@\n"
                + "@(    @@*                                                                                  &@@    @@\n"
                + "@(    @@@@@#          .%@@@@@@@@@@%.                            (@@@@@@@@@@&*          .@@@@@@    @@\n"
                + "@(    @@@@@@,    %@@@@@@@@@@@@@@@@@@@@@*                    &@@@@@@@@@@@@@@@@@@@@&,    @@@@@@&    @@\n"
                + "@(    #%&@@@. @@@@@@,         .@@@@@@@@@@@@#.          /@@@@@@@@@@@@(         .%@@@@@* @@@@%#/    @@\n"
                + "@(    @@@@@@@                     #@@@@@@@@@@@@     &@@@@@@@@@@@@.                    /@@@@@@@    @@\n"
                + "@(      .#@@@                        *@@@@@@@@@     #@@@@@@@@%                        (@@&*       @@\n"
                + "@(    @@@%       *(                      #@@&,        %@@%.                     .#       /@@@@    @@\n"
                + "@(             @@         *@@@@@@@@@&.                        #@@@@@@@@@#         *@.             @@\n"
                + "@(            #@       .@@@@@@@@@@@@@@@&                   (@@@@@@@@@@@@@@@(       %@             @@\n"
                + "@(             @       @@@@@@@@@@@@@@@@@      @,    @*     @@@@@@@@@@@@@@@@@*      %,             @@\n"
                + "@(                   .@@@*.   .(@@@@@@&       @.    &%      /@@@@@@#,    *&@@/                    @@\n"
                + "@(                                   ((      #@     /@      ,&                                    @@\n"
                + "@(                                         &@,        @@,                                         @@\n"
                + "@(            .@@&                      @&               *@.                     ,@@(             @@\n"
                + "@(          @@@@@                      @,                  @*                     #@@@@.          @@\n"
                + "@(        #@@@@@/                      %,                  @                       @@@@@@         @@\n"
                + "@(       &@@@@@@@                   (&@@@@@@,          &@@@@@@%,                  (@@@@@@@        @@\n"
                + "@(      /@@@@@@@@@@/         .#@@@@@@@@@@@@@@@,      @@@@@@@@@@@@@@@&*         .&@@@@@@@@@@       @@\n"
                + "@(      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@       @@\n"
                + "@(      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@       @@\n"
                + "@(      .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&       @@\n"
                + "@(    @@. @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@, &@@    @@\n"
                + "@(    @@@@*  #@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&.  @@@@@    @@\n"
                + "@(    @@@@@@                         .(#/.    ,*/(/*,     *#(*                         /@@@@@@    @@\n"
                + "@(    @@@@@@@                   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,                  (@@@@@@@    @@\n"
                + "@(    @@@@@@@@                    %@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.                   ,@@@@@@@@    @@\n"
                + "@(    @@@@@@@@,                       /@@@@@@@@@@@@@@@@@@@@@%.                       @@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@                                                                     /@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@*                                                                    @@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@@                                                                   &@@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@@@                                                                 @@@@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@@@@&                                                             /@@@@@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@@@@@@@,                                                        @@@@@@@@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@@@@@@@@@@@.                                                (@@@@@@@@@@@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@@@@@@@@@@@@@@.                                          &@@@@@@@@@@@@@@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@@@@@@@@@@@@@@@@%                                     ,@@@@@@@@@@@@@@@@@@@@@@@@@    @@\n"
                + "@(    @@@@@@@@@@@@@@@@@@@@@@@@@@/                                  @@@@@@@@@@@@@@@@@@@@@@@@@@@    @@\n"
                + "@(    **,*******,*******,*******,,            ,*,*,**            .*,,,**,*******,*******,***,,    @@\n"
                + "@(                                                                                                @@\n"
                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
                + "@@@#*  #( ,*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   .@@@@@@@@@@@@@@@@@@@@@*#@@@@@@@@@@@@@@@@@@@\n"
                + "@@@(   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   (@@@@@@@@@@@@@@@@@@@\n"
                + "@@@/   @@@@@@@@%      .@@@@@       @@@@@.      %@@@      .@@@@@@%      .@@@.         ,@/   @@@(   @@\n"
                + "@@@/   @@@@@@@@%   &@@@@@@.   @@@   .@/   @@@@@@@@@@@@   .@@@@@          /@@@   (@@@@@@(   @@@(   @@\n"
                + "@@@(   @@@@@@@@@@@@.  .@@@.   @@@   .@/   @@@@@@@@@@@@   .@@@@@   (@@@@@@@@@@   (@@@@@@(   @@@(   @@\n"
                + "@@%*   &%@@@@@,, /%%%  ,#@*,  %%%  ,*@(,  %%%/ ,,@@%%%.  .%%%@@,, /%%%  ,(@@@,, /%  ,*@#,  %%%/ ,,@@\n"
                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   &@@@\n"
                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   /@@@@@\n"
                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&&@@@@@@@");
    }

    public static void showWelcome() {
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("|              BEM VINDO AO JOGO FSOCIETY - GRUPO 8 - TURMA A                                   |");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("|              DIGITE SEU NOME PARA CONTINUAR                                                   |");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("");
    }

    public static void showGameMenu() throws InterruptedException {
        Integer resposta;
        Boolean sair = true;

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------MENU PRINCIPAL-----------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("|                      1 – Instruções                                                            |");
        System.out.println("|                      2 – Jogar                                                                 |");
        System.out.println("|                      3 – Créditos                                                              |");
        System.out.println("|                      4 – Sair                                                                  |");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("");

        do {
            resposta = entrada.nextInt();

            switch (resposta) {
                case 1:
                    showInstructions();
                    break;
                case 2:
                    runGame();
                    break;
                case 3:
                    showCredit();
                    break;
                case 4:
                    System.out.println("Entrei em Sair");
                    sair = false;
                    break;
                default:
                    System.out.println("Valor invalido");
                    break;
            }
        } while (sair);
    }

    public static void runGame() throws InterruptedException {
        Thread.sleep(2000);
        showIntro();
        Thread.sleep(4000);
        showGreetings(playerName);
        Thread.sleep(3000);
        firsQuestionLogo();
        Thread.sleep(1000);
        firstQuestion();
        Thread.sleep(3000);
        secondQuestionLogo();
        Thread.sleep(1000);
        secondQuestion();
        Thread.sleep(3000);
        thirdQuestionLogo();
        Thread.sleep(1000);
        thirdQuestion();
        Thread.sleep(3000);
        fourthQuestionLogo();
        Thread.sleep(1000);
        fourthquestion();
        Thread.sleep(3000);
        fivethQuestionLogo();
        Thread.sleep(1000);
        fivethQuestion();
        Thread.sleep(3000);
        sixthQuestionLogo();
        Thread.sleep(1000);
        sixthQuestion();
    }

    public static void showCredit() throws InterruptedException {
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Desenvolvido por:");
        System.out.println("");
        System.out.println("                           _");
        System.out.println("            ,---.          U");
        System.out.println("           ;     \\         ;");
        System.out.println("       .==\\'//==.  `-.___.-'");
        System.out.println("      ((+) .  .:)");
        System.out.println("      |`.-(o)-.'|");
        System.out.println("      \\//  \\_//  \\//");
        System.out.println("");
        System.out.println("Daniel Alef");
        System.out.println("E-mail: ");
        System.out.println("");
        Thread.sleep(2000);
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("     _________");
        System.out.println("    // ======= \\");
        System.out.println("   // __________\\");
        System.out.println("  | ___________ |");
        System.out.println("  | | -       | |");
        System.out.println("  | |         | |");
        System.out.println("  | |_________| |________________________");
        System.out.println("  \\=____________//                        )");
        System.out.println("  // ''''''''''' \\                       //");
        System.out.println(" // ::::::::::::: \\                  =D-'");
        System.out.println("(_________________)");
        System.out.println("");
        System.out.println("Erick Michael Porto");
        System.out.println("E-mail: erick.porto12@gmail.com");
        System.out.println("");
        Thread.sleep(2000);
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("            __");
        System.out.println("           (  )");
        System.out.println("            ||");
        System.out.println("            ||");
        System.out.println("        ___|''|__.._");
        System.out.println("       //____________\\");
        System.out.println("       \\____________//~~~.");
        System.out.println("");
        System.out.println("Igor Moura Santos");
        System.out.println("E-mail: igormourasantos@hotmail.com ");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("");
        Thread.sleep(2000);
        System.out.println("");
        System.out.println("       _         ||");
        System.out.println("      |-|        ||");
        System.out.println("  ____| |____    ||");
        System.out.println(" //   _| |_   \\   ////");
        System.out.println("|  // ,| |. \\  |_////");
        System.out.println("| ( ( '-' ) ) |-'");
        System.out.println("|  \\ `''' //  |");
        System.out.println("|   `-----'   ;");
        System.out.println("|\\___________//|");
        System.out.println("|             ;");
        System.out.println(" \\___________//");
        System.out.println("");
        System.out.println("Marcos Vinicius Ramos");
        System.out.println("E-mail: marcosvramosdecaldas@gmail.com");
        System.out.println("");
        Thread.sleep(2000);
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("   ._________________.");
        System.out.println("   |.---------------.|");
        System.out.println("   ||               ||");
        System.out.println("   ||   -._ .-.     ||");
        System.out.println("   ||   -._| | |    ||");
        System.out.println("   ||   -._|'|'|    ||");
        System.out.println("   ||   -._|.-.|    ||");
        System.out.println("   ||_______________||");
        System.out.println("   //.-.-.-.-.-.-.-.-.\\");
        System.out.println("  //.-.-.-.-.-.-.-.-.-.\\");
        System.out.println(" //.-.-.-.-.-.-.-.-.-.-.\\");
        System.out.println("//______//__________\\___o_\\ ");
        System.out.println("\\_______________________//");
        System.out.println("");
        System.out.println("Murilo Henrique Silva Paxi");
        System.out.println("E-mail: murilo.paxi@gmail.com");
        System.out.println("-------------------------------------------------------------------------------------------------");
        showGameMenu();

    }

    public static void showInstructions() throws InterruptedException {
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------Instruções----------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("| O Jogo possui o padrão de RPG textual contendo a mecânica de questionário (múltipla Escolha    |");
        System.out.println("| e dissertativa (texto livre), todas as questões contém apenas um cenário correto.              |");
        System.out.println("| As respostas são geradas de forma aleatória e a sequência e reordenada a cada tentativa falha. |");
        System.out.println("| Ao final do jogo será exibido o escore do jogador com o percentual de sucesso em cada pergunta.|");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("");
        showGameMenu();
    }

    public static void shuffleAnswer(ArrayList<String> answers) {
        Collections.shuffle(answers);
        for (int i = 0; i < answers.size(); i++) {
            switch (i) {
                case 0:
                    System.out.println("A - " + answers.get(i));
                    break;
                case 1:
                    System.out.println("B - " + answers.get(i));
                    break;
                case 2:
                    System.out.println("C - " + answers.get(i));
                    break;
                case 3:
                    System.out.println("D - " + answers.get(i));
                    break;
                case 4:
                    System.out.println("E - " + answers.get(i));
                    break;
            }

        }

        System.out.println("");
    }

    public static void verifyAnswer(ArrayList<String> answers, String corretAnswer) {
        try {
            Thread.sleep(2000);
            shuffleAnswer(answers);

            boolean sair = true;

            do {
                Integer index = 0;
                String resposta = entrada.next();
                boolean outIndex = false;

                switch (resposta.toLowerCase()) {
                    case "a":
                        index = 0;
                        break;
                    case "b":
                        index = 1;
                        break;
                    case "c":
                        index = 2;
                        break;
                    case "d":
                        index = 3;
                        break;
                    case "e":
                        index = 4;
                        break;
                    default:
                        outIndex = true;

                }

                if (outIndex) {
                    System.out.println("");
                    System.out.println((char) 27 + "[41m-------------------------------------------------------------------------------------------------");
                    System.out.println((char) 27 + "[41m|                                                                                               |");
                    System.out.println((char) 27 + "[41m|                                      RESPOSTA INCORRETA                                       |");
                    System.out.println((char) 27 + "[41m|                                                                                               |");
                    System.out.println((char) 27 + "[41m-------------------------------------------------------------------------------------------------");
                    System.out.println("");
                    shuffleAnswer(answers);

                } else {

                    if (answers.get(index).equals(corretAnswer)) {
                        System.out.println("");
                        System.out.println((char) 27 + "[42m-------------------------------------------------------------------------------------------------");
                        System.out.println((char) 27 + "[42m|                                                                                               |");
                        System.out.println((char) 27 + "[42m|                                      RESPOSTA CORRETA                                         |");
                        System.out.println((char) 27 + "[42m|                                                                                               |");
                        System.out.println((char) 27 + "[42m-------------------------------------------------------------------------------------------------");
                        System.out.println("");
                        sair = false;
                    } else {
                        System.out.println("");
                        System.out.println((char) 27 + "[41m-------------------------------------------------------------------------------------------------");
                        System.out.println((char) 27 + "[41m|                                                                                               |");
                        System.out.println((char) 27 + "[41m|                                      RESPOSTA INCORRETA                                       |");
                        System.out.println((char) 27 + "[41m|                                                                                               |");
                        System.out.println((char) 27 + "[41m-------------------------------------------------------------------------------------------------");
                        System.out.println("");
                        shuffleAnswer(answers);
                    }

                }

            } while (sair);
        } catch (InterruptedException ex) {
            Logger.getLogger(Grupo8ProjetoIntegrador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void verifyAnswer(String corretAnswer) {
        boolean sair = true;
        do {
            if (corretAnswer.equals(entrada.nextLine().toLowerCase())) {
                sair = false;
                System.out.println("");
                System.out.println((char) 27 + "[42m-------------------------------------------------------------------------------------------------");
                System.out.println((char) 27 + "[42m|                                                                                               |");
                System.out.println((char) 27 + "[42m|                                      RESPOSTA CORRETA                                         |");
                System.out.println((char) 27 + "[42m|                                                                                               |");
                System.out.println((char) 27 + "[42m-------------------------------------------------------------------------------------------------");
                System.out.println("");
            } else {
                System.out.println("");
                System.out.println((char) 27 + "[41m-------------------------------------------------------------------------------------------------");
                System.out.println((char) 27 + "[41m|                                                                                               |");
                System.out.println((char) 27 + "[41m|                                      RESPOSTA INCORRETA                                       |");
                System.out.println((char) 27 + "[41m|                                                                                               |");
                System.out.println((char) 27 + "[41m-------------------------------------------------------------------------------------------------");
                System.out.println("");
            }
        } while (sair);
    }

    public static void showIntro() {
        System.out.printf("\n Elliot (Rami Malek) é um jovem programador que trabalha como engenheiro de segurança virtual durante o dia, \n"
                + " e como hacker vigilante durante a noite. Elliot se vê numa encruzilhada quando o líder (Christian Slater) \n "
                + "de um misterioso grupo de hacker o recruta para destruir a firma que ele é pago para proteger. "
                + "\n Motivado pelas suas crenças pessoais, "
                + "\n ele luta para resistir à chance de destruir os CEOs da multinacional que ele acredita estarem controlando - e destruindo - o mundo.");
        System.out.println("");
        System.out.println("");
    }

    public static void firstQuestion() {
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("|  Você está no começo do seu expediente, vamos começar com o plano com calma. Primeiro de tudo, |");
        System.out.println("|  vamos ligar o computador. Para ligar o computador escolha a alternativa que                   |");
        System.out.println("|  NÃO tem relação com estruturas de repetição.                                                  |");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("");

        ArrayList<String> mylist = new ArrayList<String>();

        mylist.add("Contadores");
        mylist.add("Estrutura “for”");
        mylist.add("Estrutura “while”");
        mylist.add("Incrementações");
        mylist.add("Bifurcação");

        verifyAnswer(mylist, "Bifurcação");

    }

    public static void secondQuestion() {
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("|  Pronto, conseguimos logar, graças à sua boa memória! (nem tanto por demorar um pouco).           |");
        System.out.println("|  Agora precisamos desativar o firewall do sistema sem que ninguém perceba,                        |");
        System.out.println("|  para isso resolva esta pequena questão: “O uso de variáveis é extremamente comum em programação. |");
        System.out.println("|  Escolha uma variável que não seja primitiva em Java.”                                            |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("");

        ArrayList<String> mylist = new ArrayList<String>();

        mylist.add("boolean acessoRestrito =  !((false || true) && (true && false))");
        mylist.add("int codigoDeRede = 1204423");
        mylist.add("Scanner entradaDeDados = new Scanner(System.in)");
        mylist.add("bool acessarRede = false");
        mylist.add("double justSomeData = 202.010101");

        verifyAnswer(mylist, "Scanner entradaDeDados = new Scanner(System.in)");

    }

    public static void thirdQuestion() {
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| Firewall destruído! Agora podemos começar o trabalho sujo. Crie um script para começar a infecção.|");
        System.out.println("| Para ter êxito com o script, escolha a alternativa em que há uma afirmação falsa:                 |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("");

        ArrayList<String> mylist = new ArrayList<String>();

        mylist.add("Strings em java pertence aos tipos primitivos");
        mylist.add("O tipo inteiro em java é um tipo primitivo");
        mylist.add("O tipo “long” armazena números maiores que o tipo “int”");
        mylist.add("Strings são nada mais do que cadeias de caracteres");
        mylist.add("Existe mais de um tipo primitivo para armazenar número decimais.");

        verifyAnswer(mylist, "Strings em java pertence aos tipos primitivos");

    }

    public static void fourthquestion() {
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| Parabéns! Mas que belo script é esse que você criou, ele infectou tudo.                           |");
        System.out.println("| Nós estamos a um passo de acabar com as dívidas de todos os clientes do banco X.                  |");
        System.out.println("| Agora, para confirmar o nosso ataque, complete a seguinte afirmação:                              |");
        System.out.println("| Quando usamos os operadores relacionais com valor em cada lado, resulta em...                     |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("");

        ArrayList<String> mylist = new ArrayList<String>();

        mylist.add("Verdadeiro ou falso");
        mylist.add("Strings");
        mylist.add("Uma condição");
        mylist.add("Condição");
        mylist.add("Em uma atribuição");

        verifyAnswer(mylist, "Verdadeiro ou falso");
    }

    public static void fivethQuestion() {
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| Todas as barreiras foram superadas e agora temos o acesso ao sistema, escreva um laço de                                           |");
        System.out.println("| repetição que deixe o valor como zero de todas as contas negativadas.                                                              |");
        System.out.println("|                                                                                                                                    |");
        System.out.println("|        do {                                                                                                                        |");
        System.out.println("|            System.out.println(\"Id da Conta: \" + contas[0][contador] + \" - \" + \"Saldo anterior R$: \" + contas[1][contador]);  |");
        System.out.println("|            //ADICIONE SEU CODIGO AQUI                                                                                              |");
        System.out.println("|            System.out.println(\"Id da Conta: \" + contas[0][contador] + \" - \" + \"Saldo atual R$: \" + contas[1][contador]);     |");
        System.out.println("|            contador++;                                                                                                             |");
        System.out.println("|        } while (contador < contas[0].length);                                                                                      |");
        System.out.println("|                                                                                                                                    |");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");

        verifyAnswer("contas[1][contador] = 0;");

    }

    public static void sixthQuestion() {
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| Para sair sem deixar rastro insira o codigo de desativação da invasão                                                              |");
        System.out.println("|                                                                                                                                    |");
        System.out.println("|        int n = 5, a = 0, b = 1, c = b;                                                                                             |");
        System.out.println("|        for (b = 1; b <= n; b++) {                                                                                                  |");
        System.out.println("|            for (c = b; c <= n; c++) {                                                                                              |");
        System.out.println("|                a = a + 1;                                                                                                          |");
        System.out.println("|            }                                                                                                                       |");
        System.out.println("|        }                                                                                                                           |");
        System.out.println("|        System.out.printf(\"%d \\n\", a);                                                                                           |");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");

        verifyAnswer("15");

    }

    public static void firsQuestionLogo() {
        System.out.println("                              \\\\\\\\\\\\\\\n"
                + "                            \\\\\\\\\\\\\\\\\\\\\\\\\n"
                + "                          \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n"
                + "  -----------,-|           |C>   // )\\\\\\\\|\n"
                + "           ,','|          /    || ,'/////|\n"
                + "---------,','  |         (,    ||   /////\n"
                + "         ||    |          \\\\  ||||//''''|\n"
                + "         ||    |           |||||||     _|\n"
                + "         ||    |______      `````\\____/ \\\n"
                + "         ||    |     ,|         _/_____/ \\\n"
                + "         ||  ,'    ,' |        /          |\n"
                + "         ||,'    ,'   |       |         \\  |\n"
                + "_________|/    ,'     |      /           | |\n"
                + "_____________,'      ,',_____|      |    | |\n"
                + "             |     ,','      |      |    | |\n"
                + "             |   ,','    ____|_____/    /  |\n"
                + "             | ,','  __/ |             /   |\n"
                + "_____________|','   ///_/-------------/   |\n"
                + "              |===========,'");
    }

    public static void secondQuestionLogo() {
        System.out.println("             ,----------------,              ,---------,\n"
                + "        ,-----------------------,          ,\"        ,\"|\n"
                + "      ,\"                      ,\"|        ,\"        ,\"  |\n"
                + "     +-----------------------+  |      ,\"        ,\"    |\n"
                + "     |  .-----------------.  |  |     +---------+      |\n"
                + "     |  |                 |  |  |     | -==----'|      |\n"
                + "     |  |  I LOVE DOS!    |  |  |     |         |      |\n"
                + "     |  |  Bad command or |  |  |/----|`---=    |      |\n"
                + "     |  |  C:\\>_          |  |  |   ,/|==== ooo |      ;\n"
                + "     |  |                 |  |  |  // |(((( [33]|    ,\"\n"
                + "     |  `-----------------'  |,\" .;'| |((((     |  ,\"\n"
                + "     +-----------------------+  ;;  | |         |,\"    \n"
                + "        /_)______________(_/  //'   | +---------+\n"
                + "   ___________________________/___  `,\n"
                + "  /  oooooooooooooooo  .o.  oooo /,   \\,\"-----------\n"
                + " / ==ooooooooooooooo==.o.  ooo= //   ,`\\--{)B     ,\"\n"
                + "/_==__==========__==_ooo__ooo=_/'   /___________,\"\n"
                + "`-----------------------------'");
    }

    public static void thirdQuestionLogo() {
        System.out.println((char) 27 + "[31;43m@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@...................................................................");
        System.out.println((char) 27 + "[31;43m@@@@@@@@@@@@@@@@@@@@@@#/@@@@@@@@..((((((((((((((((((((((((((((((((.((((((((((((((((((((((((((((((((.");
        System.out.println((char) 27 + "[31;43m@@@@@@@@@@@@@@@@@@@@###(@@@@@@@@..((((((((((((((((((((((((((((((((.((((((((((((((((((((((((((((((((.");
        System.out.println((char) 27 + "[31;43m@@@@@@@@@@@@@@@@@@#####@@@@@@@@@..((((((((((((((((((((((((((((((((.((((((((((((((((((((((((((((((((.");
        System.out.println((char) 27 + "[31;43m@@@@@@@@@@@@@@@@(####/#@@@@@@@@@..((((((((((((((((((((((((((((((((.((((((((((((((((((((((((((((((((.");
        System.out.println((char) 27 + "[31;43m@@@@@@@@@@@@@@.####(/##@@@@@@@@@..((((((((((((((((((((((((((((((((.((((((((((((((((((((((((((((((((.");
        System.out.println((char) 27 + "[31;43m@@@@@@@@@@@@@#####///##&@@@@@@@@..((((((((((((((((((((((((((((((((.((((((((((((((((((((((((((((((((.");
        System.out.println((char) 27 + "[31;43m@@@@@@@@@@@(#####////###............................................................................");
        System.out.println((char) 27 + "[31;43m*(@@@@@@@@######/////####((((((((((((((((((((((((..((((((((((((((((((((((((((((((((.(((((((((((((((.");
        System.out.println((char) 27 + "[31;43m #####.@ #######//////####(((((((((((((((((((((((..((((((((((((((((((((((((((((((((.(((((((((((((((.");
        System.out.println((char) 27 + "[31;43m@*#############(///////####((((((((((((((((((((((..((((((((((((((((((((((((((((((((.(((((((((((((((.");
        System.out.println((char) 27 + "[31;43m@@(####/(######/////////#####((((((((((((((((((((..((((((((((((((((((((((((((((((((.(((((((((((((((.");
        System.out.println((char) 27 + "[31;43m@@@#####//(####(//////////#####((((((((((((((((((..((((((((((((((((((((((((((((((((.(((((((((((((((.");
        System.out.println((char) 27 + "[31;43m@@@#####(///###(//////*////#####(((((((((((((((((..((((((((((((((((((((((((((((((((.(((((((((((((((.");
        System.out.println((char) 27 + "[31;43m@@######//////#/////////////######..................................................................");
        System.out.println((char) 27 + "[31;43m@@(#####/////////////////////######(##((((((((((((((((((((((((((((.((((((((((((((((((((((((((((((((.");
        System.out.println((char) 27 + "[31;43m@@.####/////////////**//**////########((((((((((((((((((((((((((((.((((((((((((((((((((((((((((((((.");
        System.out.println((char) 27 + "[31;43m@@#####/////////////,,////////#####(##((((((((((((((((((((((((((((.((((((((((((((((((((((((((((((((.");
        System.out.println((char) 27 + "[31;43m@@*###////////////*,,/////////#####/###(((((((((((((((((((((((((((.((((((((((((((((((((((((((((((((.");
        System.out.println((char) 27 + "[31;43m@@####///////////,,,,,////////####//###(((((((((((((((((((((((((((.((((((((((((((((((((((((((((((((.");
        System.out.println((char) 27 + "[31;43m@@ ###//////////,,,,,,,/////////////(##(((((((((((((((((((((((((((.((((((((((((((((((((((((((((((((.");
        System.out.println((char) 27 + "[31;43m@@@###(////////*,,,,,,,,*///////////##..............................................................");
        System.out.println((char) 27 + "[31;43m@@@.###///////*,,,,,,,,,,,//////////##(((((((((((..((((((((((((((((((((((((((((((((.(((((((((((((((.");
        System.out.println((char) 27 + "[31;43m@@@@.##///////,,,,,,,,,,,,,/////////#((((((((((((..((((((((((((((((((((((((((((((((.(((((((((((((((.");
        System.out.println((char) 27 + "[31;43m@@@@@ ##//////,,,,,,,,,,,,,////////#(((((((((((((..((((((((((((((((((((((((((((((((.(((((((((((((((.");
        System.out.println((char) 27 + "[31;43m@@@@@@@##/////,,,,,,,,,,,,,///////#((((((((((((((..((((((((((((((((((((((((((((((((.(((((((((((((((.");
        System.out.println((char) 27 + "[31;43m@@@@@@@@%#/////,,,,,,,,,,,,/////(((((((((((((((((..((((((((((((((((((((((((((((((((.(((((((((((((((.");
        System.out.println((char) 27 + "[31;43m@@@@@@@@@@@#////,,,,,,,,,*////#((((((((((((((((((..((((((((((((((((((((((((((((((((.(((((((((((((((.");
        System.out.println((char) 27 + "[31;43m@@@@@@@@@@@@@@(#//,,,,,///(.........................................................................");

    }

    public static void fourthQuestionLogo() {
        System.out.println((char) 27 + "[30;44m             ________________________________________________              ");
        System.out.println((char) 27 + "[30;44m            /                                                \\             ");
        System.out.println((char) 27 + "[30;44m           |    _________________________________________     |            ");
        System.out.println((char) 27 + "[30;44m           |   |                                         |    |            ");
        System.out.println((char) 27 + "[30;44m           |   |  C:\\> _                                 |    |            ");
        System.out.println((char) 27 + "[30;44m           |   |                                         |    |            ");
        System.out.println((char) 27 + "[30;44m           |   |                                         |    |            ");
        System.out.println((char) 27 + "[30;44m           |   |                                         |    |            ");
        System.out.println((char) 27 + "[30;44m           |   |                                         |    |            ");
        System.out.println((char) 27 + "[30;44m           |   |                                         |    |            ");
        System.out.println((char) 27 + "[30;44m           |   |                                         |    |            ");
        System.out.println((char) 27 + "[30;44m           |   |                                         |    |            ");
        System.out.println((char) 27 + "[30;44m           |   |                                         |    |            ");
        System.out.println((char) 27 + "[30;44m           |   |                                         |    |            ");
        System.out.println((char) 27 + "[30;44m           |   |                                         |    |            ");
        System.out.println((char) 27 + "[30;44m           |   |                                         |    |            ");
        System.out.println((char) 27 + "[30;44m           |   |_________________________________________|    |            ");
        System.out.println((char) 27 + "[30;44m           |                                                  |            ");
        System.out.println((char) 27 + "[30;44m            \\_________________________________________________/            ");
        System.out.println((char) 27 + "[30;44m                   \\___________________________________/                   ");
        System.out.println((char) 27 + "[30;44m                ___________________________________________                ");
        System.out.println((char) 27 + "[30;44m             _-'    .-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.  --- `-_             ");
        System.out.println((char) 27 + "[30;44m          _-'.-.-. .---.-.-.-.-.-.-.-.-.-.-.-.-.-.-.--.  .-.-.`-_          ");
        System.out.println((char) 27 + "[30;44m       _-'.-.-.-. .---.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-`__`. .-.-.-.`-_       ");
        System.out.println((char) 27 + "[30;44m    _-'.-.-.-.-. .-----.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-----. .-.-.-.-.`-_    ");
        System.out.println((char) 27 + "[30;44m _-'.-.-.-.-.-. .---.-. .-------------------------. .-.---. .---.-.-.-.`-_ ");
        System.out.println((char) 27 + "[30;44m:-------------------------------------------------------------------------:");
        System.out.println((char) 27 + "[30;44m`---._.-------------------------------------------------------------._.---'");
    }

    public static void fivethQuestionLogo() {

        System.out.println((char) 27 + "[42m                 /'.    /|    .'\\                     ");
        System.out.println((char) 27 + "[42m            ,._   |+i\\  /++\\  / +|    ,,             ");
        System.out.println((char) 27 + "[42m            |*+'._/+++\\/+ ++\\/+++<_.-'+|             ");
        System.out.println((char) 27 + "[42m       :-.  \\ ++++?++ +++++*++++++ +++ /  .-:         ");
        System.out.println((char) 27 + "[42m       |*+\\_/++++ +++*++ ++++++ ++?++++\\_/ +|        ");
        System.out.println((char) 27 + "[42m   ,    \\*+++++ ++++ +++*+++ ++++ +++ +++++/   ,      ");
        System.out.println((char) 27 + "[42m   \\'-._> +__+*++__*+++_+__*++ ++__++++__*<_.-'/      ");
        System.out.println((char) 27 + "[42m    `>*+++|  \\++/  |+*/     `\\ +|  |++/  |++++<'     ");
        System.out.println((char) 27 + "[42m _,-'+ * +*\\  \\/  /++|__.-.  |+ |  |+/  /+ +*+'-._   ");
        System.out.println((char) 27 + "[42m '-.*+++++++\\    /+ ++++++/  / *|  |/  /+ ++++++.-'   ");
        System.out.println((char) 27 + "[42m     > *+++++\\  /*++++ +/` /`+++|     < *++ +++<      ");
        System.out.println((char) 27 + "[42m _,-'* +++ ++|  |++ +*/` /` +* +|  |\\  \\+ ++++++'-._ ");
        System.out.println((char) 27 + "[42m `-._+ +*++?+|  |+++*|  '-----.+|  |+\\  \\+* ++ +_.-' ");
        System.out.println((char) 27 + "[42m    _`\\++++++|__|+ *+|________|+|__|++\\__|++++/`_    ");
        System.out.println((char) 27 + "[42m   /*++_+* + +++++ ++ + ++++ +++++ ++ ++++ ++_+*+\\    ");
        System.out.println((char) 27 + "[42m   '--' `>*+++ +++++ +++++*++++  +++ ++++ ?<' '--'     ");
        System.out.println((char) 27 + "[42m        /++_++ ++ ++++++ ++?+ +++++*+++ ++++ \\        ");
        System.out.println((char) 27 + "[42m        |_/ `\\++ ++ +++*++++++++++ ++++*./`\\_|       ");
        System.out.println((char) 27 + "[42m             /+*.-.*+ +_ ++*+ _+++ .-.* +\\            ");
        System.out.println((char) 27 + "[42m       jgs   | /   | +/ `\\?+/` \\*+|    \\ |          ");
        System.out.println((char) 27 + "[42m              '    \\.'    |/    './     '             ");
    }

    public static void sixthQuestionLogo() {
        System.out.println((char) 27 + "[30;44m  ______________ ");
        System.out.println((char) 27 + "[30;44m |[]            |");
        System.out.println((char) 27 + "[30;44m |  __________  |");
        System.out.println((char) 27 + "[30;44m |  | SAVE   |  |");
        System.out.println((char) 27 + "[30;44m |  |  AND   |  |");
        System.out.println((char) 27 + "[30;44m |  |_EXIT___|  |");
        System.out.println((char) 27 + "[30;44m |   ________   |");
        System.out.println((char) 27 + "[30;44m |   [ [ ]  ]   |");
        System.out.println((char) 27 + "[30;44m \\___[_[_]__]___|");
    }
}
