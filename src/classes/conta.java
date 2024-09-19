package classes;

public class conta {
   public String conta;
   private int saldo;


public String getConta() {
    return conta;
}
public int getSaldo() {
    return saldo;
}
 public int setSaldo(int saldo){
     this.saldo = saldo;
     return this.saldo;
       
 }  
public int depositar(int valor){
     return  this.setSaldo(this.getSaldo()+ valor);
}
public conta() {
}
public conta(String conta) {
    this.conta = conta;
}

}
