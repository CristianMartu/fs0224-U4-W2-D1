package Es3.entities;

public class ContoCorrente {
    private final int maxMovimenti = 50;
    private String titolare;
    private int nMovimenti;
    private double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = getTitolare();
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public void preleva(double x) throws BancaException {
        if (nMovimenti < maxMovimenti) {
            if (x > saldo) throw new BancaException("il tuo conto è in rosso");
            else saldo = saldo - x;
        } else {
            if (x > saldo) throw new BancaException("il tuo conto è in rosso");
            else saldo = saldo - x - 0.50;
        }
        nMovimenti++;
    }

    public String getTitolare() {
        return titolare;
    }

    public void setTitolare(String titolare) {
        this.titolare = titolare;
    }

    public int getnMovimenti() {
        return nMovimenti;
    }

    public void setnMovimenti(int nMovimenti) {
        this.nMovimenti = nMovimenti;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getMaxMovimenti() {
        return maxMovimenti;
    }

}
