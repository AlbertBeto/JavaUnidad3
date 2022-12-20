import java.sql.SQLOutput;

public class RecursividadFinal {

    public static int factorial(int n) {
        if (n <= 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    public static void mystery (int n) {
        System.out.println(n + " ");
        if(n <= 5) {
            mystery (n + 1) ;
        }
    }

    public static void mystery2 (int n) {
        System.out.println(n + " ");
        if(n <= 5) {
            mystery2 (n - 1); ;
        }
    }

    public static int fun(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return (x + fun(x, y-1));
    }

    public static void fun2(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n%2);
        fun2(n/2);
    }

    public static void decimalToBinary(int num){
        if (num==0){
           return;
       }
        System.out.print(num%2);
       decimalToBinary(num/2);
    }

    public static int exponente(int x, int e) {
        if (e==0){
            return 1;
        }return x*(exponente(x,e-1));
    }


//exponentes pero en modo iterativo o normal
    public static int exponente22(int x, int e){
        int expo=1;
        for (int i=e;i>0;i--){
            expo=expo*x;
        }
        return expo;
    }

    public static int sumaDigitos(int num) {
        if (num==0){
    return 0;
    }return num%10+(sumaDigitos(num/10));
    }



    public static void main(String[] args) {
        System.out.println(factorial(5));
    mystery(100);
   // mystery2(5); BUCLE INFINITO
        System.out.println(fun(5,3));
        fun2(4);
        System.out.println();
        decimalToBinary(100);
        System.out.println();
        System.out.println(exponente(8,8));;
        System.out.println(exponente22(8,8));
        System.out.println(sumaDigitos(1234));
    }



}
