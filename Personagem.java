import static java.lang.Math.min;
public class Personagem{
    String nome;
    int energia;
    int fome;
    int sono;

    //isto é um método de instância
    void cacar(){
        if (energia >= 2){
            System.out.println(nome + " cacando");
            energia -= 2;
        }
        else{
            System.out.println(nome + " sem energia para cacar");
        }
        fome = min(fome + 1, 10);
        sono = min(sono + 1, 10);
    }

    void comer(){
        if (fome >= 1){
            System.out.print(nome + " comendo\n");
            energia = min(energia + 1,10);
            fome -= 1;//fome = fome - 1 ou ainda fome-- ou ainda --fome
        }
        else{
            System.out.println(nome +" sem fome");
        }
        
    }

    void dormir(){
        if (sono >= 1){
            System.out.printf("%s esta dormindo%n", nome);
            energia = energia + 1 < 10 ? energia + 1 : 10;
            sono--;
        }
        else{
            System.out.println(nome + " sem sono");
        }
    }

}