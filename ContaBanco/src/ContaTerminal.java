import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        // Conhecer e importa a classe Scanner
        // Exibir as mensagens para o nosso usuário
        // Obter pela Scanner os valores digitados no terminal
        // Exibir a mensagem conta criada

        System.out.println("Olá, boa tarde!");

        System.out.println("Por favor, digite o número da Agência");
        // 067-8
        String agencia = leitor.next();

        System.out.println("Por favor, digite o número da Conta");
        // 1021
        int numero = leitor.nextInt();

        System.out.println("Por favor, digite o seu nome e sobrenome");
        // Mario Andrade
        String nomeCliente = leitor.next();

        System.out.println("Por favor, digite o seu saldo");
        // 237.48
        Double saldo = leitor.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + "e seu saldo" + saldo + "já está disponível para saque.");

    }
}
