import java.util.ArrayList;
/**
 * Clase Lista de Tareas.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaTareas
{
  private ArrayList<String> listatareas;
  private ArrayList<Boolean> tareaTerminada;  
  private Tarea tareas;

  
  
  
 /**
     * Añade una tarea nueva
     */
    public void addTarea(String nuevaTarea)
    {
   listatareas.add(nuevaTarea);
   tareaTerminada.add(false);  
    
    }
    
}
