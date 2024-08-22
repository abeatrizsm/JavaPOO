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
        
        
        // Conta consulta = new Conta();
        // consulta.infos();
        // consulta.mostrarAtributos();



        // Pessoa apresentar = new Pessoa();
        // apresentar.Dados();
        // apresentar.mostar();
    }
}
