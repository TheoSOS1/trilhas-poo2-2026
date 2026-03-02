/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.Cliente;

/**
 *
 * @author aluno
 */
public class Principal {
    
    public static void main(String[] args) {
        System.out.println("Testando objetos da classe Cliente.");
        
        
        // Usando a classe cliente
        Cliente c1 = new Cliente("Theo", 18, "123.456.789-10");
        c1.imprimeCliente();
        Cliente c2 = new Cliente("Damilo", 20, "109.876.543-21");
        c2.imprimeCliente();
        Cliente c3 = new Cliente("Camila", 19, "123.765.431-30");
        c3.imprimeCliente();
        Cliente c4 = new Cliente();
        
        c4.setNome("Pedro");
        c4.setIdade(17);
        c4.setCpf("123");
        c4.imprimeCliente();
        
        // Imprimir somente o nome de um cliente
        // Usando métodos Get
        String nome = c4.getNome();
        System.out.println("\nNome obtido pelo get: " + nome);
        
    }
}
