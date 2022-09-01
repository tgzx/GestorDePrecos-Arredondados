<h1>GestorDePrecos-Arredondados</h1> 
<h3>Gestor de Preços Inteligente.</h3>

<p align="center">
  <img src="https://img.shields.io/static/v1?label=code&message=java&color=red&style=for-the-badge&logo=java"/>
   <img src="http://img.shields.io/static/v1?label=STATUS&message=rodando&color=GREEN&style=for-the-badge"/>
</p>

### Tópicos 

:small_blue_diamond: [Descrição do projeto](#descrição-do-projeto)

:small_blue_diamond: [Casos de Uso](#casos-de-uso)

:small_blue_diamond: [Código](#código)

:small_blue_diamond: [Desenvolvedor](#desenvolvedor)

## Descrição do projeto 

<p align="justify">
- No atual momento de crise e de forte concorrência no mercado, o empresário precisa de agilidade e praticidade na gestão empresarial. Se faz necessário desenvolver soluções que facilitem a vida do empresário durante o uso do sistema. E o gestor de preços precisa ser um facilitador e não mais um obstáculo. Fazer os preços de um por um é dispendioso, tanto na importação de nota fiscal de entrada bem como na gestão de preços. Aumentar a praticidade no uso do sistema, principalmente em sistemas em que se é possível realizar a importação de nota fiscal de entrada de mercadorias, pode fazer com que o cliente fique apaixonado e acomodado com o sistema, podendo resultar até mesmo em indicações.
</p>


## Casos de Uso
<p align="justify">
- O método GestorDePreco recebe porcentagem, preco, arredondaMaisMenos e casaDecimal. Ele retorna um valor inteiro ou um valor terminado em '00,50', arredondado mais para cima ou mais para baixo dependendo da solicitação do usuário. Exemplos:
</p>
<p align="justify">
Sintaxe:
</p>

~~~java
// Parâmetros: (String mercadoria, float preco)
Produto produto = new Produto("Arroz", 10);
// Parâmetros: (float porcentagem, String arredondaMaisMenos, float casaDecimal)
produto.setPorcentagem(18.25f, "praMais", 0.50f);
~~~

<p align="justify">
Saída:
</p>

~~~java
Arroz 12.5
~~~

##
<p align="justify">
Sintaxe:
</p>

~~~java
// Parâmetros: (String mercadoria, float preco)
Produto produto2 = new Produto("Acucar", 2);
// Parâmetros: (float porcentagem, String arredondaMaisMenos, float casaDecimal)
produto2.setPorcentagem(880, "praMenos", 1);
~~~

<p align="justify">
Saída:
</p>

~~~java
Acucar 19.0
~~~

## Código

<p align="justify">
- Abaixo o código que realiza a gestão de preços de forma inteligente. Ele pega o valor e verifica se é pra arredondar pra mais ou pra menos, depois verifica se é pra retornar um valor redondo ou quebrado em 00,50. O código pode ser implementado da forma como está ou pode ser removido a condição "praMenos" e deixar como padrão sempre arredondar pra cima.
</p>

~~~java
public class GestaoDePreco {

    // A Classe GestaoDePreco.java arredona pra mais ou pra menos
    // usando a condição (0.50f) para quebrar o valor no meio (50 centavos) ou
    // usando a condição (1) para arrendondar o valor para inteiro.

    public static float GestorDePrecos(float porcentagem, String arredondaMaisMenos, float preco, float casaDecimal) {
        float valorFinal = 0;
        // Por padrao o codigo vai sempre aumentar o valor.
        if (arredondaMaisMenos.equals("praMais") || arredondaMaisMenos.equals("")) {
            if (casaDecimal == 0.50f) {
                valorFinal = (((porcentagem / 100) * preco) + preco);
                float resultado = valorFinal - (int) valorFinal;
                if (resultado < 0.5) {
                    valorFinal = (int) valorFinal + 0.5f;
                } else {
                    valorFinal = (int) valorFinal + 1.5f;
                }
            } else if (casaDecimal == 1) {
                valorFinal = (((porcentagem / 100) * preco) + preco);
                float resultado = valorFinal - (int) valorFinal;
                if (resultado > 0) {
                    valorFinal = (int) valorFinal + 1;
                }
            } else {
                valorFinal = (((porcentagem / 100) * preco) + preco);
                String verificador = String.valueOf(valorFinal);
                if (verificador.length() > 5){
                    valorFinal = convertDigits(valorFinal);
                }
            }
        } else if (arredondaMaisMenos.equals("praMenos")) {
            if (casaDecimal == 0.50f) {
                valorFinal = (((porcentagem / 100) * preco) + preco);
                float resultado = valorFinal - (int) valorFinal;
                if (resultado < 0.5) {
                    valorFinal = (int) valorFinal - 0.5f;
                } else {
                    valorFinal = (int) valorFinal + 0.5f;
                }
            } else if (casaDecimal == 1) {
                valorFinal = (((porcentagem / 100) * preco) + preco);
                float resultado = valorFinal - (int) valorFinal;
                if (resultado > 0) {
                    valorFinal = (int) valorFinal;
                }
            } else {
                valorFinal = (((porcentagem / 100) * preco) + preco);
                String verificador = String.valueOf(valorFinal);
                if (verificador.length() > 5){
                    valorFinal = convertDigits(valorFinal);
                }
            }
        }
        return valorFinal;
    }
}
~~~

## Desenvolvedor

| [<img src="https://avatars.githubusercontent.com/u/82123497?v=4" width=100><br><sub>Tiago Moreira<br>(Desenvolvedor)</sub>](https://github.com/tgzx) |
| :---:

## Licença 

The [MIT License]() (MIT)

Copyright :copyright: 2022 - GestorDePrecos-Arredondados
