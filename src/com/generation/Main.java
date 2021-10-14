package com.generation;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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
    }
}
