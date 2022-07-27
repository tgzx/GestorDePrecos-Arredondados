public class Main {
    // crie produtos e teste o gestor de precos personalizado.
    public static void main(String[] args) {

        // Criando os objetos de tipo Produto.
        Produto produto = new Produto("Arroz", 10);
        Produto produto2 = new Produto("Acucar", 2);
        Produto produto3 = new Produto("Feijao", 8);
        Produto produto4 = new Produto("Batata", 1.50f);
        Produto produto5 = new Produto("Cenoura", 1.10f);

        // Printando na tela a ficha de cada produto.
        produto.status();
        produto2.status();

        // Abaixo é gerado novos precos usando porcentagem, a condicao 'arredondaMaisMenos' e a condicao 'casaDecimal'
        // (0.50f) para terminar sempre com 50 centavos e (1) para arredondar para um valor inteiro.
        // Consulte a classe GestaoDePreco.java

        // ******************************************** Teste 1 **************************************************//
        produto.setPorcentagem(18.25f, "praMais", 0.50f);
        produto2.setPorcentagem(800, "praMais", 1);

        System.out.println("Precos aumentados: ");
        produto.status();
        produto2.status();

        // ******************************************** Teste 2 **************************************************//
        produto.setPreco(10);
        produto2.setPreco(2);

        produto.setPorcentagem(18.25f, "praMais", 1);
        produto2.setPorcentagem(880, "praMenos", 1);

        System.out.println("Precos aumentados: ");
        produto.status();
        produto2.status();
    }
}