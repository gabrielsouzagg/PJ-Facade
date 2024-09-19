import classes.Cliente;
import classes.conta;
import classes.Fachada;


public class App {
    public static void main(String[] args) throws Exception {
       Cliente cliente = new Cliente(nome:"Gabe");
       conta conta = new conta(conta:"00399-9");

       Fachada fachada = new Fachada();
       fachada.fazerDeposito(valor:200, cliente, conta);
    }
}
