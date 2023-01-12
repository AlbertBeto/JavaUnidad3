public class Viaje {

    public static void conducir(Coches coches, int kms){
        coches.cambiarKm(kms);
        coches.modificaTanque(kms);
        if(coches.tanqueVacio()==true){
            System.out.println("¡El tanque de combustible del "+coches.getModelo()+" está vacio.");
        }else {
            System.out.println("El coche " + coches.getModelo() + " " + coches.getAnyo() + " condujo un total de " + coches.getKiloscoche() + " kms y su nivel de tanque de combustible actual es de " + coches.getPorcentajeTanque() + "%");
        }
    }


    //class
}