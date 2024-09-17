public class Subtracao extends Operacao{

    public Subtracao(double num1, double num2) {
        super(num1, num2);
      
    }
    @Override
    public double executar(){

        return num1 - num2;
    }
    public String toString() {
        return "Subtração de " + super.toString() + " = " + executar();
    }

    
}