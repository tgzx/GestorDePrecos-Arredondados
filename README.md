<h1>GestorDePrecos-Softcom</h1> 
<h3>Sugestão de Melhoria para o Gestor de Preços do Softshop.</h3>

<p align="center">
  <img src="https://img.shields.io/static/v1?label=softcom&message=softshop&color=yellow&style=for-the-badge&logo=java"/>
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
- No atual momento de crise e de forte concorrência no mercado, um empresário precisa de agilidade e praticidade na gestão empresarial. Se faz necessário desenvolver soluções que facilitem a vida do empresário durante o uso do sistema. E o gestor de preços precisa ser um facilitador e não mais um obstáculo. Fazer os preços de um por um é dispendioso, tanto na importação de nota fiscal de entrada bem como na gestão de preços. Aumentar a praticidade no uso do sistema, principalmente na importação de nota fiscal de entrada, pode fazer com que o cliente fique apaixonado e acomodado com o sistema, podendo resultar até mesmo em indicações.
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

## Desenvolvedor

| [<img src="https://avatars.githubusercontent.com/u/82123497?v=4" width=100><br><sub>Tiago Moreira<br>(Desenvolvedor)</sub>](https://github.com/tgzx) |
| :---:

## Licença 

The [MIT License]() (MIT)

Copyright :copyright: 2022 - GestorDePrecos-Softcom
