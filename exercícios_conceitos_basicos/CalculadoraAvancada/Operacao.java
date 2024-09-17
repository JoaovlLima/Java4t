public abstract class Operacao {
    protected double num1;
    protected double num2;


    public Operacao(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
 
public abstract double executar();

    @Override
    public String toString() {
        return String.format("%.2f e %.2f", num1, num2);
    }
    
}
