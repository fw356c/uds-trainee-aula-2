public abstract class  Animal{
    private String nomeAnimal=null;
    private Integer quantidaDePatas=null;
    protected Integer distancia=0;
    protected  Integer peso=20;


    public Animal(String nomeAnimal,Integer quantidadePatas){
        this.nomeAnimal=nomeAnimal;
        this.quantidaDePatas=quantidadePatas;

    }

    public abstract void andar();


}
