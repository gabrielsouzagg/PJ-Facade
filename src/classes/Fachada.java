package classes;

public class Fachada {
    private Cliente cliente;
    private conta conta;

    public Fachada(){
        this.cliente = new Cliente();
        this.conta = new conta();
    }

    public void fazerDeposito(int  valor, Cliente cliente, conta conta){
       System.out.print("Cliente:" + cliente.getNome());
       System.err.println("Conta:" + conta.getConta());
       System.err.println("Saldo Anterior:" + conta.getSaldo());
       System.err.println("Valor Depositado:" + valor);
       conta.depositar(valor);
       System.err.println("Saldo Atual:" + conta.getSaldo());
    }
}
