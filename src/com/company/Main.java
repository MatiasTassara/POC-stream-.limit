package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Evento a = new Evento(1,"Evento 1",new Location(1,"Location 1",new City(1,"Miramar")));
        Evento b = new Evento(2,"Evento 2",new Location(2,"Location 2",new City(2,"Mar del Plata")));
        Evento c = new Evento(3,"Evento 3",new Location(3,"Location 3",new City(3,"Buenos Aires")));
        Evento d = new Evento(4,"Evento 4",new Location(4,"Location 4",new City(4,"Ushuaia")));
        Evento e = new Evento(5,"Evento 5",new Location(5,"Location 5",new City(5,"La Quiaca")));
        Evento f = new Evento(6,"Evento 6",new Location(6,"Location 6",new City(6,"Carapachay")));

        List<Evento> lista = Arrays.asList(d,b,f,c,a,e);

        //System.out.println(lista);

        /**
         * Ordenar la lista de eventos y mostrar los 5 primeros alfabeticamente
         */
        List<Evento> listaOrdenada = lista.stream()
                .sorted(Comparator.comparing(Evento::getName))
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(listaOrdenada);

        /**
         * Extraer los IDs de los eventos a una lista
         */
        List<Integer> listaIds = lista.stream()
                .map(Evento::getId)
                .collect(Collectors.toList());
        System.out.println(listaIds);

        //extraer ids y ordenarlos en una lista
        List<Integer> listaIdOrdenada = lista.stream()
                .map(Evento::getId)
                .sorted(Comparator.comparing(Integer::byteValue))
                .collect(Collectors.toList());
        System.out.println(listaIdOrdenada);




    }


}



