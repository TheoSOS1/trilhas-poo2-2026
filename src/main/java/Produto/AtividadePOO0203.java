/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Produto;

/**
 *
 * @author aluno
 */
public class AtividadePOO0203 {
    public static void main(String[] args) {
       Produto p1 = new Produto("Pão de queijo", (float)2.50, 300);
       Produto p2 = new Produto("Danoninho", (float)5.50, 400);
       
       System.out.println("Nome: " + p1.getNome() + "\nPreço: " + p1.getPreco() + "\nQuantidade: " + p1.getQuantidade());
       System.out.println("\nNome: " + p2.getNome() + "\nPreço: " + p2.getPreco() + "\nQuantidade: " + p2.getQuantidade());
       
       p1.aplicarDesconto((float)50.0);
       p2.aplicarDesconto((float)30.0);
       
       p1.aumentarQuantidade(10);
       p2.aumentarQuantidade(10);
       
       p1.diminuirQuantidade(50);
       p2.diminuirQuantidade(40);
       
       System.out.println("\n Depois das alterações...\n");
       
       System.out.println("Nome: " + p1.getNome() + "\nPreço: " + p1.getPreco() + "\nQuantidade: " + p1.getQuantidade());
       System.out.println("\nNome: " + p2.getNome() + "\nPreço: " + p2.getPreco() + "\nQuantidade: " + p2.getQuantidade());
       
    }
}
