package Clases;
import java.util.ArrayList;

public class EquipoDeFutbol {

    ArrayList <EquipoDeFutbol> equiposDeFutbol = new ArrayList<>();
    public int numeroCamiseta, edad;
    public String apellido, equipo;

    public EquipoDeFutbol(int numeroCamiseta, int edad, String apellido, String equipo){
        this.numeroCamiseta = numeroCamiseta;
        this.edad = edad;
        this.apellido = apellido;
        this.equipo = equipo;
    }

    public void agregarJugador(EquipoDeFutbol equipoDeFutbol){
        equiposDeFutbol.add(equipoDeFutbol);
    }

    public void eliminarJugador(EquipoDeFutbol equipoDeFutbol){
        int index = equiposDeFutbol.indexOf(equipoDeFutbol);

        System.out.println("El jugador llamado: " +  equipoDeFutbol.apellido + " fue eliminado");
        equiposDeFutbol.remove(index);
    }

    public void mostrarPlantilla(){
        System.out.println("Los jugadores de la plantilla son: ");
        for (EquipoDeFutbol jugadores: equiposDeFutbol){
            System.out.println(jugadores.apellido);
        }
    }
}
