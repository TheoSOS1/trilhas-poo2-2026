/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.projetopoo;

/**
 *
 * @author aluno
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("Testando objetos da classe Cliente.");
        
        //Usando a classe cliente
        Cliente c1 = new Cliente("Theo", 18, "123.456.789-10");
        c1.imprimeCliente();
    }
}
