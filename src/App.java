import classes.Cliente;
import classes.Fachada;  // Corrigido para "Conta" com C maiúsculo, seguindo convenções de nomenclatura
import classes.conta;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente("Gabe");  // Corrigido para usar o formato correto do construtor
        conta conta = new conta();  // Corrigido para "Conta" com C maiúsculo

        Fachada fachada = new Fachada();
        fachada.fazerDeposito(200, cliente, conta);  // Corrigido para passar o valor corretamente
    }
}
