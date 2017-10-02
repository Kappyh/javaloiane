/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loiane;

import br.com.loiane.curso.Variaveis;

/**
 *
 * @author developer
 */
public class Loiane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Variaveis variavel = new Variaveis();
        
        variavel.setNome("Gabriela");
        variavel.setIdade(25);
        
        variavel.mostrarDados();
    }
    
}
