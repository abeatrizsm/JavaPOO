import java.util.Scanner;

public class Pessoa {
    String nome;
    int anoDeNascimento;
    float peso;
    float altura;
    double imc;
    int idade;
    float agua;
    
    public void Dados(){
        Scanner prompt = new Scanner(System.in);
        System.out.println("Insira o nome:");
        nome = prompt.next();
        System.out.println("Insira o ano de nascimento:");
        anoDeNascimento = prompt.nextInt();
        System.out.println("Insira o peso(em kg):");
        peso = prompt.nextFloat();
        System.out.println("Insira o altura(em metros):");
        altura = prompt.nextFloat();

        prompt.close(); 
    }
    public double calcularImc(){
        imc = peso /(altura*altura);  
        return imc;
    }
    public int calcularIdade(){
        idade = 2024 - anoDeNascimento;
        return idade;
    }
    public float calcularAgua(){
        agua = peso * 35;
        return agua;
    }
    public void mostar(){
        imc = calcularImc();
        idade = calcularIdade();
        agua = calcularAgua();
        System.out.printf(nome + ", o seu IMC é %.1f", imc);
        System.out.print(", sua idade é " + idade + " anos e você precisa beber " + agua + "ml de água por dia.");
    }

}
