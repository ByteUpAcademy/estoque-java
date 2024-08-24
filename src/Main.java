import constants.MenuConstants;
import constants.MessageConstants;
import model.Veiculo;
import model.Vendedor;
import model.Funcionario;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println(MessageConstants.WELCOME_MESSAGE);


        Scanner sc = new Scanner(System.in);


        try {
            System.out.println("Digite uma opacao para acessar o sistema" +
                    "\n 1) Cadastrar funcionario" +
                    "\n 2) Realizar venda" +
                    "\n 3) Consultar carro em estoque \n");

            int codigo = sc.nextInt();


            if (MenuConstants.CADASTRAR_FUNCIONARIO == codigo) {

                Funcionario funcionario = new Funcionario();
                System.out.println("Digite o nome do funcionario: ");
                funcionario.setNome(sc.nextLine());




            } else if (MenuConstants.REALIZAR_VENDA == codigo) {
                Locale ptBr = new Locale("pt", "BR");
                Vendedor vendedor = new Vendedor();
                sc.nextLine();
                System.out.println("Qual o nome do vendedor: ");
                vendedor.setNome(sc.nextLine());
                System.out.println("Qual o valor da venda ? ");
                vendedor.vender(sc.nextDouble());
                String comissaoConvertida = NumberFormat.getCurrencyInstance(ptBr).format(vendedor.getComissao());
                System.out.println(comissaoConvertida);
            } else if (MenuConstants.CONSULTAR_CARROS == codigo) {

            } else {
                throw new Exception("O codigo digitado nao existe nas opcoes");
            }
        } catch (Exception exception) {
            System.out.println("Infelizmente tivemos problemas em nossos servidores, tente novamente");
            System.out.println("Erro : " + exception.getMessage());
            exception.printStackTrace();
        } finally {
            sc.close();
            // conexao de banco de dados
            // destruir algum objeto
        }
    }
}
