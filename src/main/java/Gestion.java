import java.util.*;
//Clase Gestión
public class Gestion {
    public static void main(String[] args) {
  Scanner scanner=new Scanner(System.in);

  //Crear 3 objetos de la clase Piloto
        Piloto piloto1 = new Piloto(1,"Pete Maverick", 10000, "Capítan");
        Piloto piloto2 = new Piloto(2, "Natasha Phoenix", 3000, "Teniente");
        Piloto piloto3 = new Piloto(3, "Bradley Rooster", 3500, "Teniente");

        //Solicitamos información para crear 2 nuevos pilotos
        System.out.println("Introduce los datos de otros dos pilotos: ");
        System.out.println("Id del Piloto");
        int idPiloto4 = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        System.out.println("Nombre del Piloto: ");
        String nombrePiloto4 = scanner.nextLine();
        System.out.println("Horas de vuelo del Piloto: ");
        int horasVueloPiloto4 = scanner.nextInt();
        scanner.nextLine();// Consumir una línea
        System.out.println("Rango del Piloto: ");
        String rangoPiloto4 = scanner.nextLine();

        Piloto piloto4 = new Piloto(idPiloto4, nombrePiloto4, horasVueloPiloto4, rangoPiloto4);

        System.out.println("Id del Piloto");
        int idPiloto5 = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        System.out.println("Nombre del Piloto: ");
        String nombrePiloto5 = scanner.nextLine();
        System.out.println("Horas de vuelo del Piloto: ");
        int horasVueloPiloto5 = scanner.nextInt();
        scanner.nextLine();// Consumir una línea
        System.out.println("Rango del Piloto: ");
        String rangoPiloto5 = scanner.nextLine();

        Piloto piloto5 = new Piloto(idPiloto5, nombrePiloto5, horasVueloPiloto5, rangoPiloto5);

        //Mostrar información de algunos pilotos
        System.out.println("Información del piloto Maverick: ");
        piloto1.mostrarPiloto();
        System.out.println("Informaciñon del piloto Rooster: ");
        piloto3.mostrarPiloto();

        //Mostrar informaciñon de los dos nuevos pilotos
        System.out.println("Informacion del piloto 4: ");
        piloto4.mostrarPiloto();
        System.out.println("Infomación del piloto 5: ");
        piloto5.mostrarPiloto();

        //Creación de objetos de la clase Avión
        Avion avion1 = new Entrenamiento(1,"Entrenador 1", 2, piloto1, true);
        Avion avion2 = new Combate(2, "Caza 1", 1, piloto2,true);
        Avion avion3 = new Combate(3, "Caza 2", 1, piloto3, false);

        //Solicitar información para crear dos nuevos aviones
        System.out.println("Introduce los datos de dos nuevos aviones: ");
        System.out.println("ID del Avión: ");
        int idAvion4 = scanner.nextInt();
        scanner.nextLine();//Consumir nueva línea
        System.out.println("Modelo del Avión: ");
        String modAvion4 = scanner.nextLine();
        System.out.println("Capacidad del Avión");
        int capAvion4 = scanner.nextInt();
        scanner.nextLine();//Consumir nueva linea
        System.out.println("ID del Piloto asignado al Avión: ");
        int idPilotoAvion4 = scanner.nextInt();
        scanner.nextLine();//Consumir nueva línea

        //Buscar el piloto correspondiente
        Piloto pilotoAvion4 = null;
        if (idPilotoAvion4 == piloto4.getIdPiloto()){
            pilotoAvion4 = piloto4;
        } else if (idPilotoAvion4 == piloto5.getIdPiloto()) {
          pilotoAvion4 = piloto5;
        }

        Avion avion4 = new Entrenamiento(idAvion4,modAvion4, capAvion4, pilotoAvion4, true);

        System.out.println("ID del Avión: ");
        int idAvion5 = scanner.nextInt();
        scanner.nextLine();//Consumir la nueva línea
        System.out.println("Modelo del Avión: ");
        String modAvion5 = scanner.nextLine();
        System.out.println("Capacidad del Avión: ");
        int capAvion5 = scanner.nextInt();
        scanner.nextLine();//Consumir la nueva línea
        System.out.println("ID del Piloto asignado al Avión: ");
        int idPilotoAvion5 = scanner.nextInt();
        scanner.nextLine();//Consumir la nueva línea

        //Buscar el piloto correspondiente
        Piloto pilotoAvion5 = null;
        if (idPilotoAvion5 == piloto4.getIdPiloto()){
            pilotoAvion5 = piloto4;
        } else if (idPilotoAvion5 == piloto5.getIdPiloto()){
            pilotoAvion5 = piloto5;
        }

        Avion avion5 = new Entrenamiento(idAvion5, modAvion5, capAvion5, pilotoAvion5, true);

        // Mostrar información de todos los aviones
        System.out.println("Informacion de los Aviones: ");
        System.out.println("Avión 1: ");
        avion1.mostrarAvion();
        System.out.println("Avión 2: ");
        avion2.mostrarAvion();
        System.out.println("Avión 3: ");
        avion3.mostrarAvion();
        System.out.println("Avión 4: ");
        avion4.mostrarAvion();
        System.out.println("Avión 5: ");
        avion5.mostrarAvion();

        scanner.close();
    }
}

