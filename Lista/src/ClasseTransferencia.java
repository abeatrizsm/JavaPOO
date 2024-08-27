import java.util.Scanner;

public class ClasseTransferencia {
    public void transferir(){
        Menu chamar = new Menu();
        chamar.menuContas();

        Scanner prompt = new Scanner(System.in);
        double valorTranferencia;


        System.out.println("Gostaria de realizar uma transferencia?");
        System.out.println("Digite: 1 - sim | 2 - não ");
        int opcao = prompt.nextInt();
        
        while(opcao!=1 || opcao!=2){
            System.out.println("Insira uma opção válida.");
            System.out.println("Gostaria de realizar uma transferencia?");
            System.out.println("Digite: 1 - sim | 2 - não ");
        }
        if(opcao==1){
            System.out.println("Quanto você deseja transferir?");
            valorTranferencia = prompt.nextDouble();

            if (saldo>valorTransferencia) {
                saldo -= valorTranferencia;
                contaDestino.saldo = contaDestino.saldo + valorTranferencia;
                System.out.println("Transferência realizada");
            }
            else{
                System.out.println("Saldo insuficiente para transferir.");
            }
        }
    
        
        
    }

}
