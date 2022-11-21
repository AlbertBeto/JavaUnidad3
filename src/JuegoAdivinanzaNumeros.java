import java.util.Scanner;

public class JuegoAdivinanzaNumeros {

    private static int numeroSecreto =1 + (int) (Math.random() * 100);
    Scanner sc= new Scanner(System.in);
    private static int propuesta;
    public static void main(String[] args) {
        System.out.println(numeroSecreto);
        Scanner sc= new Scanner(System.in);
        System.out.println("Juego de adivinanzas. Adivina en que número estoy pensando. Introduce un número:");
                int salida = 0;
        do {
            propuesta = sc.nextInt();
            if (propuesta == numeroSecreto) {
                System.out.println("EXITO!!!");
                salida=1;
            } else if (propuesta < numeroSecreto) {
                System.out.println("El número que busca es mayor.");
            } else if (propuesta > numeroSecreto) {
                System.out.println("El número que busca es menor ");
            } else {
                System.out.println("No ha introducido un número vuelva a intentarlo.");
            }
        }
        while (salida == 0) ;


}
//class
}