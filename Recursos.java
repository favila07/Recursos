/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Real Madrid
 */
public class Recursos {

    public String obtenerMensajePOO(){
        return "Programacion Orientada a Objetos";
    }
    
    public String verificarEdad(int edad){
        if (edad >= 21){
            return "Mayor de edad";
        } 
        else {
            return "Menor de edad";
        }
    }
    
    public int multiplicar(int a, int b){
        return a * b;
    }
    
    public List<Integer> generarListaNumeros(int x){
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= x; i++){
            numeros.add(i);
        }
        
    return numeros;  
    }
}    
   
  public class Main {
    public static void main(String[] args) {
    
    Recursos recursos = new Recursos();

    String mensajePOO = recursos.obtenerMensajePOO();
    System.out.println(mensajePOO);
    
    int edadEstudiante = 20;
    String mensajeEdad = recursos.verificarEdad(edadEstudiante);
    System.out.println(mensajeEdad);
    
    int resultadoMultiplicacion = recursos.multiplicar(5, 3);
    System.out.println("Resultado de la multiplicacion: " + resultadoMultiplicacion);
    
    List<Integer> listaNumeros = recursos.generarListaNumeros(5);
    System.out.println("Lista de numeros del 1 al X: " + listaNumeros);
    
    
    }
    
}
