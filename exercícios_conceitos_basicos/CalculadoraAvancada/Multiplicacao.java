public class Multiplicacao extends Operacao{
    public Multiplicacao(double num1, double num2) {
        super(num1, num2);
      
    }
    @Override
    public double executar(){

        return num1 * num2;
    }
    public String toString() {
        return "Multiplicacao de " + super.toString() + " = " + executar();
    }

    
}
