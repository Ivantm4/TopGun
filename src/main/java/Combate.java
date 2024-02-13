//Clase Combate
class Combate extends Avion{
    private boolean esFurtivo;
    //Constructor
    public Combate(int idAvion, String modAvion, int capAvion, Piloto piloto, boolean esFurtivo){
        super(idAvion,modAvion,capAvion,piloto);
        this.esFurtivo=esFurtivo;
    }
    //Getter y Setter

    public boolean isEsFurtivo() {
        return esFurtivo;
    }

    public void setEsFurtivo(boolean esFurtivo) {
        this.esFurtivo = esFurtivo;
    }
}
