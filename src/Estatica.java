public class Estatica {
    /*static int x = 6;
    Estatica() {
        x++;
    }
    void metodo() {
        System.out.print("-x" + x);
    }
    public static void main(String[] args) {
        Estatica e1, e2, e3, e4;
        Estatica e5 = new Estatica();
        Estatica e6 = new Estatica();
        Estatica e7 = new Estatica();
        e7.metodo();
    }*/

    static int x;
    int y;
    Estatica() {
        x += 2;
        y++;
    }
    static int obtenerCuadrado() {
        return x * x;
    }
    public static void main(String[] args) {
        Estatica e1 = new Estatica();
        Estatica e2 = new Estatica();
        int cuadrado = e1.obtenerCuadrado();
        System.out.print("x " + cuadrado + "- y" + e2.y);
    }


}
