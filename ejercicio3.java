public class ejercicio3 {/*Ejercicio fibonacci */
    public static void main(String[] args) {
        long num1= 0, num2=1;
        long maximo =50;

        System.out.print(num1 + ", " + num2);

        for(int i=2; i <=maximo;i++){
         long siguente = num1+num2;
         System.out.println(", " +siguente);
         num1=num2;
         num2= siguente;
        }
    }
}