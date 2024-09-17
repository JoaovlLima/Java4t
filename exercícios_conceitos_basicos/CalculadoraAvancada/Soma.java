public class Soma extends Operacao{

    public Soma(double num1, double num2) {
        super(num1, num2);
      
    }
    @Override
    public double executar(){

        return num1 + num2;
    }
    public String toString() {
        return "Soma de " + super.toString() + " = " + executar();
    }

    
}