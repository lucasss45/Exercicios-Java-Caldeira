public class Conta {
    //Verifica Horario
    public String nomeConta;
    public String cpf;
    public double nConta;
    public String data;
    public String endereço;
    public String NomeBanco;
    public double saldo;

    public void deposito(double valor) {
        this.saldo = saldo + valor;
    }
    public void saque(double valor) {
        this.saldo = saldo - valor;
    }
    public double retornaSaldo() {
        return this.saldo;
    }
    public double pix(double valor){
        return this.saldo - valor;

    }
    public String (){
        //
    }

    public String info() {
        return "Conta{" +
                "nomeConta='" + nomeConta + '\'' +
                ", cpf='" + cpf + '\'' +
                ", nConta=" + nConta +
                ", data='" + data + '\'' +
                ", endereço='" + endereço + '\'' +
                ", NomeBanco='" + NomeBanco + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public Conta(double saldo, String nomeConta, String cpf,
                 double nConta, String data, String endereço,
                 String NomeBanco) {
        this.nomeConta = nomeConta;
        this.cpf = cpf;
        this.nConta = saldo;
        this.NomeBanco = NomeBanco;
        this.saldo = saldo;
        this.data = NomeBanco;
        this.endereço = NomeBanco;
    }

}
