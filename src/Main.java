        public class Main {
            public static void main(String[] args) {

                Produto primeiroProduto = new Produto("Placa Mãe", 485.60);
                Produto segundoProduto = new Produto("Placa de Video", 1330.99);
                Produto terceiroProduto = new Produto("Memoria", 586.82);
                Produto quartoProduto = new Produto("SSD", 189.98);
                Produto quitoProduto = new Produto("Fonte", 269.48);

                Pedido pedido = new Pedido();
                pedido.adicionarProduto(primeiroProduto);
                pedido.adicionarProduto(segundoProduto);
                pedido.adicionarProduto(terceiroProduto);
                pedido.adicionarProduto(quartoProduto);
                pedido.adicionarProduto(quitoProduto);
                pedido.calcularTotal();
}



//
//
//                Pato pato = new PatoDeCabeçaVermelha();
//                System.out.println("Pato de cabeça Vermelha Voa:");
//                pato.voar();
//                Pato patoCibernetico = new PatoCibernetico();
//                System.out.println("Pato cibernetico Voa:");
//                patoCibernetico.voar();




//        Macaco macaco = new Macaco("kenji",4);
//        macaco.andar();
//        macaco.comerBanana();



    }
//    public static void main(String[] args){
//
//        ArrayList<String> alisonTora = new ArrayList();
//
//        alisonTora.add("Alison");
//        alisonTora.add("cep:86750-000");
//        alisonTora.add("Av. Brasil");
//        alisonTora.add("centro");
//        alisonTora.add("Iguarasitio");
//        alisonTora.add("Paraná");
//        alisonTora.add("3248-1151");
//
//        alisonTora.set(0,"Alison Tadeu Veloza");
//        alisonTora.remove(6);
//
//        alisonTora.stream().forEach((item)->{
//            System.out.println(item);
//        });
//
//    }
//}

