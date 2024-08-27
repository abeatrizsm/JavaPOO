import java.util.Scanner;

public class Menu {
    public void menuContas(){
        ContaAtualizada conta1 = new ContaAtualizada();
        conta1.cpf = "033.987.993-96";
        conta1.numeroBanco = "341";
        conta1.saldo = 5000.90;
        conta1.tipoConta = "especial";
        
        ContaAtualizada conta2 = new ContaAtualizada();
        conta2.cpf = "987.654.321-03";
        conta2.numeroBanco = "001";
        conta2.saldo = 3409.98;
        conta2.tipoConta = "comum";

        Scanner prompt = new Scanner(System.in);

        ContaAtualizada contaPrincipal = null;
        ContaAtualizada contaDestino = null;

        while (true) {
            System.out.println("Escolha a conta principal:");
            System.out.println("Digite: 1 - conta 1 | 2 - conta 2");
            int escolha = prompt.nextInt();

            if(escolha == 1){
                contaPrincipal = conta1;
                contaDestino = conta2;
                break;
            }
            else if (escolha == 2) {
                contaPrincipal = conta2;
                contaDestino = conta1;
                break;
            }
            else {
                System.out.println("Opção inválida.");
            }
        }
        prompt.close();

    }

}
