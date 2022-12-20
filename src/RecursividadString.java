public class RecursividadString {
    private static int cuenta=0;
    private static char ultimaLetra;



    // Este metodo recursivo imprime en pantalla el String dado al reves y en cascada.
    public static void imprimirString(String s) {
        if (s.length() == 1)
            System.out.println(s.charAt(0));
        else {
            System.out.println(s.charAt(s.length() - 1));
            imprimirString(s.substring(0, s.length() - 1));
        }
    }

    //Imprime cuenta atras. N es el número por el que empieza
    public static void cuentaAtras(int n) {
        if (n >= 1) {
            System.out.print(n + " ");
            cuentaAtras(n - 1);
        }
    }
//Le das un texto y un caracter y busca dentro del texto cuantas veces está el caracter.
    public static int contarCaracter(String str, char ch) {
        if (str.length() == 0) {
            return getCuenta();
        } else {
            if (str.charAt(str.length() - 1) == ch) {
                setCuenta(cuenta++);
            } else {
            }
            str = str.substring(0, str.length() - 1);
            return contarCaracter(str, ch);
        }
    }
    public static int getCuenta() {
        return cuenta;
    }
    public static void setCuenta(int cuenta) {
        cuenta = cuenta;
    }

    // Le das un string y devuelve la suma de los caracteres ASCII.

public static int sumarChars(String str){
        if (str.length()==0){
            return 0;
        }return str.charAt(str.length()-1)+(sumarChars(str.substring(0,str.length()-1)));
}


// Le das un String y  tiene que devolver el mismo String pero sin letras adyacentes repetidas (Ej. aabbc=abc

    public static String eliminarAdyacentes(String str){
        if(str.length()>1){
            if(str.charAt(0)==str.charAt(1)){
                return str.charAt(0)+ eliminarAdyacentes(str.substring(2,str.length()));
            }else{
                return str.charAt(0)+eliminarAdyacentes(str.substring(1,str.length()));
            }
        }
        if(str.length()==1){
            return str.charAt(0)+"";}
        return "";
    }

//Confirma si un texto se escribe igual en un sentido que en el otro.
    public static boolean esPalindromo (String str){
      if (str.charAt(str.length()-1)!=str.charAt(0)){
          return false;
      }else if(str.length()<=1){
         return true;
      }
      return esPalindromo(str.substring(1,str.length()-1));
    }

    public static int sumaDigitos(int num) {
        if (num==0){
            return 0;
        }return num%10+(sumaDigitos(num/10));
    }



    public static void main(String[] args) {


        imprimirString("Hola World");
        System.out.println("Hello World");
        cuentaAtras(15);
        System.out.println();
        System.out.println(contarCaracter("Jaraldaba cuatrera", 'a'));
        System.out.println(sumarChars("22"));
        System.out.println(eliminarAdyacentes("aabbccdeeffgg"));
        System.out.println(esPalindromo("alxajala"));

    }





    //class
}
