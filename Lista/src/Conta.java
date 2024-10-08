import java.util.Scanner;

public class Conta {
    String cpf;
    String numeroBanco; 
    double saldo;
    double saque;
    double deposito;
    double bonus;  
    double bonusAtualizado;  
    int opcao;
    int opcao2;
    Scanner prompt = new Scanner(System.in);

    public void infos(){
        System.out.println("Insira o CPF:");
        cpf = prompt.next();
        System.out.println("Insira o numero representativo do banco:");
        numeroBanco = prompt.next();
        System.out.println("Insira o saldo:");
        saldo = prompt.nextDouble();
        
    }

    public double bonificacao(){
        System.out.println("Digite 1 para correntista especial e 2 para comum:");
        opcao2 = prompt.nextInt();

        if(opcao2==1){
            bonus = saldo * 0.1;
        }
        else{
            bonus = saldo * 0.05;
        }
        return bonus;
    }
    
    public double saqueDeposito(){
        System.out.println("Gostaria de realizar um saque ou um depósito em sua conta?");
        System.out.println("Digite: 1 - Sacar | 2 - Depositar | 3 - encerrar ");
        opcao = prompt.nextInt();

        if(opcao==1){
            System.out.println("Quanto você deseja sacar?");
            saque = prompt.nextDouble();
            saldo = saldo - saque;
        }
        if(opcao==2){
            System.out.println("Quanto você deseja depositar?");
            deposito = prompt.nextDouble();
            saldo = saldo + deposito;
        }
        if(opcao==3){
            System.out.println("Obrigada pela preferência.");
        }
        return saldo;
    }

    public double bonificacaoAtualizada(){

        if(opcao2==1){
            bonusAtualizado = saldo * 0.1;
        }
        else{
            bonusAtualizado = saldo * 0.05;
        }
        return bonusAtualizado;
    }

    public void mostrarAtributos(){
        bonus = bonificacao();
        saldo = saqueDeposito();
        bonusAtualizado = bonificacaoAtualizada();

        System.out.println("==========================================================");
        System.out.println("CPF do titular: " + cpf);
        System.out.println("Número representativo do banco: " + numeroBanco);
        System.out.printf("O seu saldo atual é: %.2f\n", saldo);
        System.out.printf("Valor sacado: %.2f\n", saque);
        System.out.printf("Valor depositado: %.2f\n", deposito);
        System.out.printf("Valor da bonificacão antes das operações: %.2f\n", bonus);
        System.out.printf("Valor da bonificacão após das operações: %.2f\n", bonusAtualizado);
        System.out.println("==========================================================");

    }
    



}
