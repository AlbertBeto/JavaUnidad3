package Lolo;

public class RecursividadReal {

    public void mystery (int n) {
        System.out.println(n + " ");
        if(n <= 5) {
            mystery (n + 1) ;
        }
    }

    public static void main(String[] args) {
        System.out.println();
    }


}
