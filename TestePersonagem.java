public class TestePersonagem{
    public static void main(String [] args){
       //p é uma variável de referência ao objeto construído com new
       //Personagem p = new Personagem();
       //java 10+
       var p = new Personagem();
       p.nome = "John";
       p.cacar();
       p.comer();
       p.dormir(); 
    }
}