class Main2 {
    public static void main(String[] args) {
        System.out.println("Vejamos um produto sendo adicionado");
        void  adicionarProduto();
        System.out.println("Agora removemos um produto");
        void removerProduto();
        System.out.println("Vamos listar os produtos");
        System.out.println("Agora eles serao vendidos");
        System.out.println("Hora de re-estocar");





    }
}

 class Produto {
    String nome;
    double preco;
    int quantidade;

    public String getnome(){
        return nome;

    }

     public void setNome(String novonome) {
         this.nome = novonome;
     }

     public double getpreco(){
         return preco;

     }

     public void setpreco(double novopreco) {
         this.preco = novopreco;
     }

     public int getquantidade(){
         return quantidade;

     }

     public void setquantidade(int novoquantidade) {
         this.quantidade = novoquantidade;
     }
 }

 class Loja{
    Produto produto1;
     Produto produto2 = new Produto();
     Produto produto3 = new Produto();

      void adicionarProduto(Produto novoproduto){
         if(produto1==null){
             produto1 = novoproduto;
         }
          if(produto2==null){
              produto2 = novoproduto;
          }
          if(produto3==null){
              produto3 = novoproduto;
          }
     }

     void removerProduto(Produto produto){
         if(produto1 != null) {
             produto1 = null;
         }
         if(produto2!=null){
             produto2 = null;
         }
         if(produto3!=null){
             produto3 = null;
         }
     }

     void listarProdutos(){
         System.out.println(produto1);
         System.out.println(produto2);
         System.out.println(produto3);}

     void venderProduto(){
         if (produto1.quantidade>=1){
             System.out.println(produto1 + 'vendido com sucesso');

         }
         else {
             System.out.println(produto1+' fora de estoque');

         }

         if (produto2.quantidade>=1){
             System.out.println(produto2 + 'vendido com sucesso');

         }
         else {
             System.out.println(produto2+' fora de estoque');

         }

         if (produto3.quantidade>=1){
             System.out.println(produto3 + 'vendido com sucesso');

         }
         else {
             System.out.println(produto3+' fora de estoque');

         }

     }

     void adicionarProduto(Produto produto, int quantidade){
          if (produto1.quantidade == 0){
              produto1.quantidade++;

          }
             if (produto2.quantidade == 0){
                 produto2.quantidade++;

             }
                 if (produto3.quantidade == 0){
                     produto3.quantidade++;

                 }

     }
 }