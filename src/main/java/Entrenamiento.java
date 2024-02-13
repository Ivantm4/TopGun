//Clase Entrenamiento
public class Entrenamiento extends Avion{
    private boolean tieneDobleMando;
    //Construsctor
    public Entrenamiento(int idavion, String modAvion, int capAvion, Piloto piloto, boolean tieneDobleMando){
        super (idavion, modAvion, capAvion, piloto);
        this.tieneDobleMando=tieneDobleMando;
    }
    //Getter y Setter
    public boolean isTieneDobleMando(){
        return tieneDobleMando;
    }

    public void setTieneDobleMando(boolean tieneDobleMando) {
        this.tieneDobleMando = tieneDobleMando;
    }
}