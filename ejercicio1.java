public class ejercicio1{/*Ejercicio fizzbuzz */
    public static void main(String[] args) {

        int minimo=1;
        int maximo=100;
        
        for(int i= minimo; i<= maximo; i++){
            if(i%3 ==0 && i%5==0){
                System.err.println("fizzBuzz");
            }else if(i%3 ==0 ){
                System.err.println("fizz");
            }else if(i%5 ==0 ){
                System.err.println("Buzz");
            }
           else {
            System.err.println(i);
           }
        }
    }
}