//Clase piloto
public class Piloto {
    private int idPiloto;
    private String nomPiloto;
    private int horasVueloPiloto;
    private String rangoPiloto;

    //Constructor
    public Piloto(int idPiloto, String nomPiloto, int horasVueloPiloto, String rangoPiloto){
        this.idPiloto=idPiloto;
        this.nomPiloto=nomPiloto;
        this.horasVueloPiloto=horasVueloPiloto;
        this.rangoPiloto=rangoPiloto;
    }
    // Getter y Setter

    public int getIdPiloto() {
        return idPiloto;
    }

    public void setIdPiloto(int idPiloto) {
        this.idPiloto = idPiloto;
    }

    public String getNomPiloto() {
        return nomPiloto;
    }

    public void setNomPiloto(String nomPiloto) {
        this.nomPiloto = nomPiloto;
    }

    public int getHorasVueloPiloto() {
        return horasVueloPiloto;
    }

    public void setHorasVueloPiloto(int horasVueloPiloto) {
        this.horasVueloPiloto = horasVueloPiloto;
    }

    public String getRangoPiloto() {
        return rangoPiloto;
    }

    public void setRangoPiloto(String rangoPiloto) {
        this.rangoPiloto = rangoPiloto;
    }
    //Metodo para mostrar información del piloto
    public void mostrarPiloto(){
        System.out.println("ID Piloto: " + idPiloto);
        System.out.println("Nombre: " + nomPiloto);
        System.out.println("Horas de vuelo "+ horasVueloPiloto);
        System.out.println("Rango "+ rangoPiloto);
    }
}