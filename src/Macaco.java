public class Macaco extends Animal {
    public  Macaco(String nomeAnimal,Integer quantidaDePatas){
        super(nomeAnimal,quantidaDePatas);

    }
    @Override
    public void andar() {
        this.distancia+=10;
        this.peso-=1;
    }


    public void comerBanana() {
        this.peso+=1;

    }
}
