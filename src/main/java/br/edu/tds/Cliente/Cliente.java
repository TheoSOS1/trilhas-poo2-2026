/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.Cliente;

/**
 *
 * @author aluno
 */
public class Cliente {
    // Definição de atributos da classe
    private String nome;
    private int idade;
    private String cpf;

//Definir o(s) meu(s) construtores
public Cliente(){
    
}

public Cliente(String n, int i, String cpf){ 
    this.nome = n;
    this.idade = i;
    this.cpf = cpf;
}

//Métodos get & set
public void setNome(String nome){
    this.nome = nome;
}

public void setIdade(int idade){
    this.idade = idade;
}

public void setCpf(String cpf){
    this.cpf = cpf;
}

public String getNome(){
    return nome;
}

public int getIdade(){
    return idade;
}

public String getCpf(){
    return cpf;
}

//Métodos funcionais
public void imprimeCliente(){
    System.out.println("\nNome.: "+this.nome);
    System.out.println("Idade: "+this.idade);
    System.out.println("CPF..: "+this.cpf);
}
}
