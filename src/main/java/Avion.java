//Clase Avión (Padre)
public abstract class Avion {
    private int idAvion;
    private String modAvion;
    private int capAvion;
    private Piloto piloto;

    //Constructor
    public Avion(int idAvion, String modAvion, int capAvion,Piloto piloto ){
        this.idAvion= idAvion;
        this.modAvion = modAvion;
        this.capAvion = capAvion;
        this.piloto = piloto;
    }
    //Getter y Setter

    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    public String getModAvion() {
        return modAvion;
    }

    public void setModAvion(String modAvion) {
        this.modAvion = modAvion;
    }

    public int getCapAvion() {
        return capAvion;
    }

    public void setCapAvion(int capAvion) {
        this.capAvion = capAvion;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
    //Método para mostrar la información del avión
    public void mostrarAvion(){
        System.out.println("ID Avión "+ idAvion);
        System.out.println("Modelo: "+modAvion);
        System.out.println("Capacidad: "+ capAvion);
        System.out.println("Piloto asignado: "+piloto);
        piloto.mostrarPiloto();
    }
}