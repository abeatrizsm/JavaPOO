public class Principal {
    public static void main(String[] args) {
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
        
        // System.out.println("Gostaria de realizar uma transferencia?");
        // System.out.println("Digite: 1 - sim | 2 - não ");
        // opcao = prompt.nextInt();
        
        // while(opcao!=1 || opcao!=2){
        //     System.out.println("Insira uma opção válida.");
        //     System.out.println("Gostaria de realizar uma transferencia?");
        //     System.out.println("Digite: 1 - sim | 2 - não ");
        // }
        // if(opcao==1){
        //     System.out.println("Quanto você deseja transferir?");
        //     transferencia = prompt.nextDouble();
            
            
        // }




        // Conta consulta = new Conta();
        // consulta.infos();
        // consulta.mostrarAtributos();



        // Pessoa apresentar = new Pessoa();
        // apresentar.Dados();
        // apresentar.mostar();
    }
}
