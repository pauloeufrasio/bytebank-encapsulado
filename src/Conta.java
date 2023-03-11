public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular ;  // Atributo titular do tipo classe
    // Criando Construtor
    public Conta (int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou criando uma conta "
                + this.numero
                + " e a agencia é "
                +this.agencia);
    }
    public Conta() {

    }

    public void deposita(double valor) {  // Metodo 1
        this.saldo += valor;

    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Nao pode valor menor ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Não é permitido numeros abaixo ou igual a 0 ");
            return;
        }
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
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
