/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unal.unal_ciclo2clase12_grupo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        ArrayList<Integer> ejemplo = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ejemplo.add((int) (Math.random() * 100));
        }
        System.out.println(ejemplo);

        ejemplo.add(2, 1258);
        ejemplo.set(0, -45);
        ejemplo.set(5, -45);
        System.out.println(ejemplo);
        ejemplo.remove(2);
        Integer elim = -45;
        ejemplo.remove(elim);

        for (Integer x : ejemplo) {
            System.out.print(x + " ; ");
        }

        System.out.println("\ni=5: " + ejemplo.get(5));
        Scanner t = new Scanner(System.in);
        System.out.println("Valor a buscar en el ArrayList:");
        Integer buscado = t.nextInt();
        System.out.println("Buscando '" + buscado + "' :" + ejemplo.contains(buscado));
        System.out.println("Esta en i=" + ejemplo.indexOf(buscado));
        System.out.println("Lista vacia? " + ejemplo.isEmpty());
        System.out.println("Tamaño: " + ejemplo.size());
         */
        //ListaEnlazada();

        //vectorJava();
        
        //MapaHash();
        
        ArbolMap();

    }

    public static void ListaEnlazada() {
        // LinkedListdecadenasdecaracteres
        LinkedList<String> lista = new LinkedList<String>();
        // mecanismosparaagregarelementos
        lista.add("A");
        lista.add("B");
        lista.addLast("C");
        lista.addFirst("D");
        lista.add(2, "E");
        System.out.println("Lista1:" + lista);
        // modificaciondeunelemento
        lista.set(1, "a");
        System.out.println(lista);
// impresionutilizandociclos
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + "");
        }
        System.out.println();
// mecanismosparaeliminarelementos
        lista.remove("B");
        lista.remove(3);
        lista.removeFirst();
        lista.removeLast();
        System.out.println("Listafinal:" + lista);

    }

    public static void vectorJava() {
        // Vectorparaalmacenarcualquiertipo
        Vector vector = new Vector();
        // agregarelementosdedistintotipo
        vector.add(1);
        vector.add(true);
        vector.add("Mision");
        vector.add("TIC");
        vector.add(2);
        System.out.println("Vector1:" + vector);
        // modificarelvalordeunodeloselementos
        vector.set(0, 2021);
        System.out.println("Vector2:" + vector);
        // eliminarelementoenelndice4
        vector.remove(4);
        System.out.println("Vector3:" + vector);
        // impresiondeelementosconcicloporelemento
        for (Object elemento : vector) {
            System.out.print(elemento + ";");
        }

    }

    public static void MapaHash() {
        // HashMapconclavesstringyvaloresdouble
        HashMap<String, Double> mapa = new HashMap<>();
// agregarelementosalHashMap
        mapa.put("nota1", 3.2);
        mapa.put("nota2", 4.3);
        mapa.put("nota3", 3.9);
        mapa.put("nota1", 5.0);//sin querer lo sobre escribe por la clave
// cantidaddeelementosenelHashMap
        System.out.println("Tama~no:" + mapa.size());
// impresiondelHashMap
        System.out.println("HashMap1:" + mapa);
// verificaciondellaveyextracciondevalor
        if (mapa.containsKey("nota2")) {
            Double valor = mapa.get("nota2");
            System.out.println("nota2--->" + valor);
        }
        mapa.remove("nota1");
        System.out.println("HashMapFinal:");
// recorrerHashMapporllaveyclave
        for (Map.Entry<String, Double> elem : mapa.entrySet()) {
            System.out.println(elem.getKey() + ":" + elem.getValue());
        }

    }

    public static void ArbolMap() {
        // Creacion del TreeMap
        TreeMap<Integer, String> mapa
                = new TreeMap< Integer, String>();
        // Agregar elementos
        mapa.put(3, "MisionTIC");
        mapa.put(2, "estudiantes");
        mapa.put(1, "hola");
        for (Map.Entry pareja : mapa.entrySet()) {
            int clave = (int) pareja.getKey();
            String valor = (String) pareja.getValue();
            System.out.println(clave + ":" + valor);
        }
        
        System.out.println(mapa);

    }

}
