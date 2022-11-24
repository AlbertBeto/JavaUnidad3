package Lolo;

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

    // public static void main(String[] args){
    // System.out.println(CalculatorTester.getIndice(0,"Patri"));}


         //public static boolean sonIguales(String str1, String str2){
        // comprueba si son iguales
         //}*/

         public static void main(String[] args){
        //System.out.println(StringsOne.getIndice(0,"Patri"));
             System.out.println(getIndice(0,"Beto"));
             System.out.println(sonIguales("Joder con esta mierda", "Joder con esta mierda"));
             System.out.println(sonIgualesIgnorando("Joder con esta mierda", "JoDer con esta Mierda"));
             System.out.println(igualLexico("a","a"));
             System.out.println(igualLexicoIgnorandoMays("A","a"));
         }


    }
