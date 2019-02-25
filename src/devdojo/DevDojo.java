package devdojo;

import devdojo.Metodos.Estudante;

/**
 *
 * @author Secretaria
 */
public class DevDojo {

    public static void main(String[] args) { 
        Estudante estudante = new Estudante();
        estudante.nome = "Teste Silva";
        estudante.idade = 55;
        estudante.notas = new double[]{6,6,6};
                       
        estudante.tirarMedia();
        estudante.print();
        
    }
    
}