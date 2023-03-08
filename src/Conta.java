public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;  // Atributo titular do tipo classe

    public void deposita(double valor) {  // Metodo 1
        this.saldo += valor;

    }

    public boolean saca(double valor) {  // metodo 2
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }
    public double getSaldo(){
        return this.saldo;
    }

}
