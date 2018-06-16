class Pessoa {
    String nome=null;
    String cep= null;
    String endereço=null;
    String numero=null;
    String complemento=null;
    String bairro=null;
    String cidade=null;
    String estado=null;
    String telefone=null;

    public void setNome(String novoNome){
        nome=novoNome;
    }
    public void setCep(String novoCep){
        cep=novoCep;
    }
    public void setEndereço(String novoEnredeço){
        endereço=novoEnredeço;
    }
    public void setNumero(String novoNumero){
        numero=novoNumero;
    }
    public void setComplemento(String novoComplemento){
        complemento=novoComplemento;
    }
    public void setBairro(String novoBairro){
        bairro=novoBairro;
    }
    public void setCidade(String novoCidade){
        cidade=novoCidade;
    }
    public void setEstado(String novoEstado){
        estado=novoEstado;
    }
    public void setTelefone(String novoTelefone){
        telefone=novoTelefone;
    }
    public String obterInformacoes(){
        return "Nome:"+nome+", "+
        "CEP: "+cep+", "+
        "Endereço: "+endereço+", "+
        "Numero: "+numero+", "+
        "Complemento; "+complemento+", "+
        "Bairro; "+bairro+", "+
        "Cidade: "+cidade+", "+
        "Estado: "+estado+", "+
        "Telefone: "+telefone;

    }

}
