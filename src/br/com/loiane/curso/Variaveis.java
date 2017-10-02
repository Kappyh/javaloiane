/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.loiane.curso;

public class Variaveis {

    private int idade;
    private String nome;
    private String nomeDoMeuCachorro;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void mostrarDados(){
        System.out.println("Minha idade é: " + this.getIdade() + " Meu nome é "
                + getNome());
    }
}
