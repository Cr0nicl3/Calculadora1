package calculadora;

/** @since 28/02/2020
 * 
 * @author dam
 * 
 * @version 1.0
 * 
 * 
 */
public class Calculadora {
    private int num1;  //hello world
    private int num2;
    /**
     * 
     * @param a primer valor con el que calcular
     * @param b segundo valor con el que calcular
     */
    public Calculadora(int a, int b){
        num1=a;
        num2=b;
    }
    /**
     * @return el resultado de la suma entre ambos números
     */
    public int suma(){
        int result=num1+num2;
        return result;
    }
    /**
     * 
     * @return el resultado de la resta entre ambos números
     */
    public int resta(){
        int result;
        if(resta2())result=num1-num2;
        else result=num2-num1;
        return result;
    }
    /**
     * 
     * @return verdadero si el número 1 es mayor o igual al número 2, si no es así, falso
     */
    public boolean resta2(){
        if(num1>=num2)return true;
        else return false;
    }
    /**
     * 
     * @return el resultado de multiplicar ambos números
     */
    public int multiplica(){
        int result=num1*num2;
        return result;
    }
    /**
     * 
     * @return el resultado de dividir ambos números sin condición 
     */
    public int divide(){
        int result=num1/num2;
        return result;
    }
    /**
     * 
     * @return el resultado de dividir ambos números en el caso de que el número 2 no sea igual a 0, en ese caso null 
     */
    public Integer divide2(){
        if(num2==0) return null;
        int result=num1/num2;
        return result;
    }
    /**
     * @throws java.lang.ArithmeticException si el número 2 es igual a 0
     * @return el resultado de dividir ambos números
     */
    public int divide0(){
        if(num2==0)
            throw new java.lang.ArithmeticException("División por 0");
        else{
            int result=num1/num2;
            return result;
        }
    }/**
     * 
     * @param args algo no se 
     */
    public static void main(String[] args) {
    }
    
}
