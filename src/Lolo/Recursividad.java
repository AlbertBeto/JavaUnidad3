package Lolo;

public class Recursividad {

    public static int sumaSuc(int n){
        int suma=0;
        if(n==0){
        return 0;
        }else {
                return n+sumaSuc(n-1);
        }

    }

    public static void main(String[] args) {
        System.out.println(sumaSuc(4));
    }
}
