import java.util.ArrayList;
/**
 * Clase Lista de Tareas.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaTareas
{

    private ArrayList<Tarea> tareas;

    /**
     * Añade una tarea nueva
     */
    public void addTarea(String textoTarea)
    {
        tareas.add(textoTarea);
        tareas.add(false);
        
    }

    public void verTareasNumeradas(){
        int numeroPosicion = 1;
        for(String tarea : listaTareas){
            String textoAMostrar = "";
            textoAMostrar = textoAMostrar + numeroPosicion + ". ";
            if(tareaTerminada.get(numeroPosicion -1) == true) {
                textoAMostrar = textoAMostrar + " HECHO. ";
            }
            textoAMostrar = textoAMostrar + tarea; 
            System.out.println(numeroPosicion + ". " + tarea);
            numeroPosicion = numeroPosicion + 1;
        } 
    }

    public void marcarTarea(int numeroTarea)
    {
        if (numeroTarea > 0 && numeroTarea <= listaTareas.size()){
            tareaTerminada.set(numeroTarea -1,true);
        }
    }
}