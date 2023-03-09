public class Personagem{
    String nome;
    int energia;
    int fome;
    int sono;

    //isto é um método de instância
    void cacar(){
        System.out.println(nome + " cacando");
    }

    void comer(){
        System.out.print(nome + " comendo\n");
    }

    void dormir(){
        System.out.printf("%s esta dormindo%n", nome);
    }

}