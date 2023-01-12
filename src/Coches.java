public class Coches {

    private int anyo;
    private String modelo;
    private int kiloscoche = 0;
    private int porcentajeTanque = 100;


    public Coches(String modelo, int anyo){
        this.modelo=modelo;
        this.anyo=anyo;
    }

    public Coches(String modelo, int anyo, int kiloscoche, int porcentajeTanque){
        this.modelo=modelo;
        this.anyo=anyo;
        this.kiloscoche=kiloscoche;
        this.porcentajeTanque=porcentajeTanque;
    }




    public void cambiarKm(int kilosViaje){
        setKiloscoche(getKiloscoche()+kilosViaje);
    }

    public boolean tanqueVacio(){
        if (getPorcentajeTanque()==0){
            return true;
        }else{
            return false;
        }
    }

    public int convertKmFuel(int kms){
        int porcentajeConsumoFuel;
        porcentajeConsumoFuel=kms/4;
        return porcentajeConsumoFuel;
    }

    public void modificaTanque(int kms){
        int porcentajeFuelGastado;
        porcentajeFuelGastado=convertKmFuel(kms);

        if (tanqueVacio()==false){
            if ((getPorcentajeTanque()-porcentajeFuelGastado)<0){
                setPorcentajeTanque(0);
            }
            else{
                setPorcentajeTanque(getPorcentajeTanque()-porcentajeFuelGastado);
            }
        }

    }

    public void setKiloscoche(int kiloscoche) {
        this.kiloscoche = kiloscoche;
    }


    public String getModelo() {
        return modelo;
    }

    public int getKiloscoche() {
        return kiloscoche;
    }



    public int getPorcentajeTanque() {
        return porcentajeTanque;
    }

    public void setPorcentajeTanque(int porcentajeTanque) {
        this.porcentajeTanque = porcentajeTanque;
    }

    public int getAnyo() {
        return anyo;
    }




    //class
}