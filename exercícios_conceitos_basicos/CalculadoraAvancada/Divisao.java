public class Divisao extends Operacao{

    public Divisao(double num1, double num2) {
        super(num1, num2);
        
    }
    @Override
 public double executar(){

    return num1 / num2;


 } 

 public String toString() {
    return "Divisao de " + super.toString() + " = " + executar();
}


    
}
