import java.util.Scanner;

public class ContaAtualizada {
    String cpf;
    String numeroBanco; 
    double saldo;
    double valorTranferencia;
    double bonus;  
    double bonusAtualizado;  
    int opcao;
    String tipoConta;
    Scanner prompt = new Scanner(System.in);

    public double bonificacao(){

        if(tipoConta=="especial"){
            bonus = saldo * 0.1;
        }
        if(tipoConta=="comum"){
            bonus = saldo * 0.05;
        }
        return bonus;
    }
       
    public void transferencia(Conta contaDestino){
        valorTranferencia = prompt.nextDouble();

        if(saldo>valorTranferencia){
            saldo = saldo - valorTranferencia;
            contaDestino.saldo = contaDestino.saldo + valorTranferencia;
            System.out.println("Transferência realizada");
        }
        else{
            System.out.println("Saldo insuficiente para transferir.");
        }
    
    }

    public double bonificacaoAtualizada(){

        if(tipoConta=="especial"){
            bonusAtualizado = saldo * 0.1;
        }
        else{
            bonusAtualizado = saldo * 0.05;
        }
        return bonusAtualizado;
    }

    public void mostrarAtributos(){
        bonus = bonificacao();
        // saldo = transferencia();
        bonusAtualizado = bonificacaoAtualizada();

        System.out.println("==========================================================");
        System.out.println("CPF do titular: " + cpf);
        System.out.println("Número representativo do banco: " + numeroBanco);
        System.out.printf("O seu saldo atual é: %.2f\n", saldo);
        //System.out.printf("Valor transferido: %.2f\n", valorTranferencia);
        System.out.printf("Valor da bonificacão antes das operações: %.2f\n", bonus);
        System.out.printf("Valor da bonificacão após das operações: %.2f\n", bonusAtualizado);
        System.out.println("==========================================================");

    }
    



}
