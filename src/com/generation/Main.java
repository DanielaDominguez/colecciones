package com.generation;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	//Colecciones : HashSet, LinkedHashSet, TreeSet
        // Debemos declarar un tamaño el cual será estático y no cambiará

        // arreglo declarado en multilinea
        /*
        String universidades [];
        universidades = new String[5];
        universidades[0] = "ITVH";
        universidades[1] = "ULA";
        universidades[2] = "UAM";
        universidades[3] = "UADM";
        universidades[4] = "UNAM";
        */
        //---------------------------------------
        // no permitio la entrada de 8 universidades porque el tamaño es de 5 asi que comentamos las que sobran
        /*
        universidades[5] = "UPN";
        universidades[6] = "IPN";
        universidades[7] = "TESCO";
        */
        //---------------------------------------
        //arreglo declarado en una linea
        /*
        String universidades [] = new String[]{"ITVH", "ULA", "UAM", "UADM", "UNAM"};

        //vamos a guardar universidades en universidad
        for (String universidad : universidades) {
            System.out.println((universidad));
        }
        */


        //------------------------------------------------------------------------------
        System.out.println("----HashSet---");
        Set<String> frutas = new HashSet(4); //si le agregamos capacidad no estamos limitados, como en los arreglos
        //Caracteristicas principales de Set
        // No puede contener elementos duplicados
        // El orden de los elementos puede variar
        frutas.add("Mango");
        frutas.add("Fresa");
        frutas.add("Pera");
        frutas.add("Uva");
        frutas.add("Melon");
        frutas.add("Lima");
        frutas.add("Mango");

        for (String fruta : frutas) {
            System.out.println((fruta));
        }

        System.out.println("----TreeSet---");

        Set<String> frutas2 = new TreeSet<>();
        // Es mas lento que el HashSet
        // Ordena los elementos
        frutas2.add("Mango");
        frutas2.add("Fresa");
        frutas2.add("Pera");
        frutas2.add("Uva");
        frutas2.add("Melon");
        frutas2.add("Lima");


        for (String fruta : frutas2) {
            System.out.println((fruta));
        }

        System.out.println("----LinkedHashSet---");
        Set<String> frutas3 = new LinkedHashSet<>();
        // Es un poco mas costosa que HashSet
        // Almacena los valores en orden de inserción
        frutas3.add("Mango");
        frutas3.add("Fresa");
        frutas3.add("Pera");
        frutas3.add("Uva");
        frutas3.add("Melon");
        frutas3.add("Lima");

        for (String fruta : frutas3) {
            System.out.println((fruta));
        }
        //-----------------------------
        /*
        System.out.println("----Dani---");

        // Estamos haciendo una prueba de rendimiento
        //final es una constante, esta declarando un HashSet
        final Set hashSet = new HashSet(1_000_000);
        final Long startHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            hashSet.add(i);
        }
        // Mide el tiempo de ejecusión
        final Long endHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));

        final Set treeSet = new TreeSet();
        final Long startTreeSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            treeSet.add(i);
        }
        final Long endTreeSetTime = System.currentTimeMillis();
        System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));

        final Set linkedHashSet = new LinkedHashSet(1_000_000);
        final Long startLinkedHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            linkedHashSet.add(i);
        }
        final Long endLinkedHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));
        */

        //------------------------------------------
        System.out.println("----ArrayList---");

        List<String> frutas4 = new ArrayList<>();
        // List si admite elementos duplicados
        frutas4.add("Mango");
        frutas4.add("Fresa");
        frutas4.add("Pera");
        frutas4.add("Uva");
        frutas4.add("Melon");
        frutas4.add("Lima");
        frutas4.add("Mango");

        for (String fruta : frutas4) {
            System.out.println((fruta));
        }

        System.out.println("----Elemento ArrayList---");
        System.out.println(frutas4.get(3));
        int indice = frutas4.indexOf("Melon");

        System.out.println(frutas4.get(indice));

        System.out.println("----LinkedList---");
        List<String> frutas5 = new LinkedList<>();
        frutas5.add("Mango");
        frutas5.add("Fresa");
        frutas5.add("Pera");
        frutas5.add("Uva");
        frutas5.add("Melon");
        frutas5.add("Lima");
        frutas5.add("Mango");

        for (String fruta : frutas5) {
            System.out.println((fruta));
        }

        System.out.println("----HashMap---");

        Map<Integer,String> universidades = new HashMap<Integer,String>();
        // Asocia claves con valores
        // No puede tener claves repetidas
        // Sólo puede tener un valor asociado a la clave
        universidades.put(1, "IPN");
        universidades.put(2, "UNAM");
        universidades.put(3, "UAEM");
        universidades.put(4, "UAM");
        universidades.put(5, "TESCO");

        for (Map.Entry<Integer,String> universidad : universidades.entrySet()) {
            System.out.println("clave=" + universidad.getKey() + ", valor=" + universidad.getValue());
        }

        System.out.println(universidades.get(3));


    }
}
