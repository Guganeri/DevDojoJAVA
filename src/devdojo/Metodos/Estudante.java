package devdojo.Metodos;
/**
 *
 * @author Secretaria
 */
public class Estudante {
    public String nome;
    public int idade;
    public double[] notas;
    
 public void print(){
     System.out.println("Nome: "+this.nome);
     System.out.println("Idade: "+this.idade);
     System.out.println("Notas: "+this.notas);             
 }   
 
 public void tirarMedia(){
     double media = 0;
     for(double nota: notas){
         media += nota;
     }
     media = media / notas.length;
     
     if(media > 6){
         System.out.println("Aprovado");         
     }else{
         System.out.println("Reprovado");
     }         
 }            
}