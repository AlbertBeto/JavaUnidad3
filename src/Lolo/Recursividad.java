package Lolo;

public class Recursividad {

    /*public static int sumaSuc(int n){
        if(n==0){
        return 0;
        }else {
                return n+sumaSuc(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(sumaSuc(4));
    }*/

   /* public static boolean paliTexto(String j){
        if(j.length()==0 || j.length()==1){
return true;}
else if(j.charAt(0)==j.charAt(j.length()-1)){
    return paliTexto(j.substring(1,j.length()-1));
}else{
    return false;
        }
    }*/

    public static void mierdaString(String str){
                if(str.length()>0){
                    System.out.println(str.charAt(str.length()-1));
                    mierdaString(str.substring(0,str.length()-1));
        }
    }



    //class
}
