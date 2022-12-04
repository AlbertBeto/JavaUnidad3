public class StringsOne {

    // Dado por la profesora
    //ejercicio 1
    // Escribe un método Java para obtener el carácter en el índice dado como parámetro dentro de
    //un String pasado como parámetro.
     public static char getIndice(int indice, String str){
     return str.charAt(indice);
     }
// comprueba si son iguales
     public static boolean sonIguales(String str1, String str2){
    if(str1.equals(str2)){
        return true;
    }else {
        return false;
    }
     }

     // Compara pero ignora mayusculas y minuculas
     public static boolean sonIgualesIgnorando(String str1, String str2){
         if(str1.equalsIgnoreCase(str2)){
             return true;
         }else {
             return false;
         }
     }
// Compara si son iguales de extension

    public static String igualLexico(String str1,String str2){
         if (str1.compareTo(str2)==0){
             return str1 +" es igual que "+ str2;
        }else if(str1.compareTo(str2)<str2.compareTo(str1)){
             return str1+" es menor que "+str2;
        }else if(str1.compareTo(str2)>str2.compareTo(str1)){
             return str2+" es mayor que "+str1;}
         else{
             return "Error en entrada";
         }
    }

    // Compara si son iguales ignorando mayusculas

    public static String igualLexicoIgnorandoMays(String str1,String str2){
        if (str1.compareToIgnoreCase(str2)==0){
            return str1 +" es igual que "+ str2;
        }else if(str1.compareToIgnoreCase(str2)<str2.compareToIgnoreCase(str1)){
            return str1+" es menor que "+str2;
        }else if(str1.compareToIgnoreCase(str2)>str2.compareToIgnoreCase(str1)){
            return str2+" es mayor que "+str1;}
        else{
            return "Error en entrada";
        }
    }

    //Confirma si tienes un segundo texto dentro del primer texto
    public static boolean loIncluye(String str1, String str2){
         if (str1.contains(str2)){
             return true;
         }else{return false;}
    }

    // Confirma que el String2 empieza igual el String1
    public static boolean empiezanIgual(String str1, String str2){
         char str2Empieza= str2.charAt(0);
         String realstr2Empieza=""+str2Empieza;
         if (str1.startsWith(realstr2Empieza)){
             return true;
         }else{
             return false;
         }
    }

    //Desglosa el String en letras.
    public static void desglose(String str1){
         int longitud=str1.length();
         for (int y=0;y<longitud;y++){
            System.out.println(str1.charAt(y));
         }
    }

    //Sustituye caracteres por otros caracteres dentro de un String
    public static void sustituir(String str1, char alfa, char bravo){
        System.out.println(str1.replace(alfa,bravo));
    }

    //Elimina el char de la posición que se diga empezando desde 0.
    public static String eliminarCharsPosicion(String str1, int posicion){
        String primerBloque="";
        String segundoBloque="";
         if (posicion-1<0){
             primerBloque="";
        }else{primerBloque=str1.substring(0,posicion);
         }
         if (posicion>=str1.length()){
             segundoBloque="";
         }else {
             segundoBloque=str1.substring(posicion+1,str1.length());
         }
        String definitivo=primerBloque+segundoBloque;
         return definitivo;
         }

         // Escribres un String y te lo devuelve al reves
         public static String giradorString(String str1){
             int longitud=str1.length();
             String girado="";
             for (int y=longitud;y>0;y--){
                 girado=girado+str1.charAt(y-1);
             }
            return girado;
         }

         //Introduces un String y seleccionas una parte marcando coordenada de entrada y de salida.
         public static String seleccionString(String str1, int alfa, int bravo){
         String salida=str1.substring(alfa,bravo);
         return salida;

         }


         public static void textoDividido(String str1, int divisor){
         int grupos=str1.length()/divisor;
         int posicion=0;
         if(str1.length()%divisor!=0){
             System.out.println("El texto no es divisible entre "+divisor);
         }else{
             for (int i=grupos;grupos>0;grupos--){
                 System.out.println(str1.substring(posicion,posicion+divisor));
                 posicion=posicion+divisor;
             }
         }
         }


    // public static void main(String[] args){
    // System.out.println(CalculatorTester.getIndice(0,"Patri"));}


         //public static boolean sonIguales(String str1, String str2){
        // comprueba si son iguales
         //}*/

         public static void main(String[] args){

             System.out.println(getIndice(0,"Beto"));
             System.out.println(sonIguales("Joder con esta mierda", "Joder con esta mierda"));
             System.out.println(sonIgualesIgnorando("Joder con esta mierda", "JoDer con esta Mierda"));
             System.out.println(igualLexico("a","a"));
             System.out.println(igualLexicoIgnorandoMays("A","a"));
             System.out.println(loIncluye("Vaya o tal vez sea","sea"));
             System.out.println(empiezanIgual("Al mar","Al airearse"));
             desglose("Al mar me fui para no volver");
             sustituir("calabazas para saltar",'a', 'u');
             System.out.println(eliminarCharsPosicion("Perla",4));
             System.out.println(giradorString("Mojamaaa"));
             System.out.println(seleccionString("Clamor",2,6));
             textoDividido("abcdef",2);
         }


    }
