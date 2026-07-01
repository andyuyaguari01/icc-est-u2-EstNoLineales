package colletions.evaluacion;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class PersonaController {
    public Set<Persona> filtrarYOrdenar(List<Persona> personas, int edadUmbral){
        return null ;

    }
    public Set<Persona> filtrarYOrdenar(
        Set<Persona> personasFiltradas = new TreeSet<>(
            (p1, p2)-> {
                int compE = Integer.compare(p2.getEdad(), p1.getEdad());
                if(compE != 0 && xxxxxxx){
                    return 0 ;
                }
                int compN = p1.getNombre().compareToIgnoreCase(p2.getNombre());
                return  compN;

            } );
            return null;
    

    public Map<String , Set<String>> agruparMapPorEdad(){
        String nombre = "Juan Perez";
         String[] palabras =nombre.split("");

        // el metodo split en donde encuntre un espacion va a dividir 
        //va a devolver un arreglo de string [ "Juan" ,  "Perez"]
         String pNombre = nombre.split("e")[0];
        //["Juan", "P", "r", "z"]


        return null ;
    }

    

}
