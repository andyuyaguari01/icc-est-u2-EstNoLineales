package colletions.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import structure.models.Contacto;

public class Maps {

    //Mapa simpre esta compuesto por una clave y un valor 
    // le agregamos el tipo de clave y el tipo de valor

    // Map<K, V>
    // Map<TIPO CLAVE, TIPO VALOR>

    public Map<String, Integer > construirHashMap(){
        Map<String, Integer > mapa = new HashMap<>();
        mapa.put("A", 10);
        mapa.put("B", 20);
        mapa.put("C", 30);
        mapa.put("A", 50);
        System.out.println(mapa.size());
        System.out.println(mapa);

        for(int i=0; i<= mapa.size(); i++){
             System.out.println( mapa.values().toArray());
        }
        for ( String Key : mapa.keySet()){
            System.out.println(Key);


        }

        System.out.println(mapa.get("A"));
        System.out.println(mapa.get("B"));
        System.out.println(mapa.get("C"));

        mapa.putIfAbsent("F", 100);
        mapa.putIfAbsent("A", 200);



        return  mapa;



    }
    public Map<String, Integer> cLinkedHashMap(){
         Map<String, Integer > mapa = new LinkedHashMap<>();
        mapa.put("A", 10);
        mapa.put("B", 20);
        mapa.put("C", 30);
        mapa.put("A", 50);
        System.out.println(mapa);
        return mapa;
        
    }
    public Map<String, Integer> cTreeMap(){
         Map<String, Integer > mapa = new TreeMap<>();
        mapa.put("A", 10);
        mapa.put("B", 20);
        mapa.put("C", 30);
        mapa.put("A", 50);
        System.out.println(mapa);
        return mapa;
    }
        public Set<Contacto> ordenarUnicos(List<Contacto> contactos){
            //Retorna contactor unicos
            //Unicos -> si hay un repetido no se repite
            //Ordene segun el apellido de manera descendente 
            Set<Contacto> nueva = new  TreeSet<>(
                (c1, c2) -> {
                if(c1.getNombre().equals(c2.getNombre())){
                    return 0;
                }
                return  c1.getApellido().compareTo(c2.getApellido() );
            });
        for(Contacto contacto : contactos){
                nueva.add(contacto);
            }
            return nueva;
        }
        
    }


