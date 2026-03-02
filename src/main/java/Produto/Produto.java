/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produto;

/**
 *
 * @author aluno
 */
public class Produto {
    // Atributos
    private String nome;
    private float preco;
    private int quantidade;
    
    // Métodos get & set
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setPreco(float preco){
        this.preco = preco;
    }
    public float getPreco(){
        return preco;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return quantidade;
    }
    
    // Construtores
    public Produto(){
    
}
    public Produto(String n, float p, int q){
        this.nome = n;
        this.preco = p;
        this.quantidade = q;
    }
    
    // Métodos 
    
    public void aplicarDesconto(float percentual){
        preco = preco - ((preco*percentual)/100);
    }
    
    public void aumentarQuantidade(int valor){
        quantidade = quantidade + valor;
    }
    
    public void diminuirQuantidade(int valor){
        quantidade = quantidade - valor;
    }
}

