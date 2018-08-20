# Twitter Small Analytics
Exemplo de utilização da API Twitter4J.

## Getting Started

  Atualmente usuários de redes sociais contribuem para entendimento de informações massivas que são postados e atualizados continuamente. Tais informações podem servir de subsídio para melhor conhecimento e refinamento de diversos fatos que contribui para tomada de decisões rápidas e eficazes.
Diante disto, o objetivo do projeto é construir uma aplicação Java que seja capaz de se integrar a API do Twitter para buscar as seguintes informações de uma determinada hashtag.

1. Quantidade por dia de tweets da última semana.
2. Quantidade por dia de retweets da última semana.
3. Quantidade por dia de favoritações da última semana.
4. Ordenar os tweets pelo nome do autor, e exibir o primeiro nome e o último nome.
5. Ordenar os tweets por data, e exibir a data mais recente e a menos recente.


### Instalação

 Após realizar o download do projeto disponível no GitHub, e descompactar o zip em sua pasta
de preferência, realize os passos a seguir para importar o projeto no eclipse:

1. Abrir o eclipse;
2. Clicar em File > Import;
3. Escolha General > Projects from Folder or Archive:
a. Clique em ‘Next’;
4. Clique em ‘Directory’:
a. Selecione a pasta desejada;
5. Clique em Finish.

![alt tag](https://raw.githubusercontent.com/juliodasilv/Twitter-Small-Analytics/master/files/project_installed.PNG)

### Como Utilizar

Para utilizar o Twitter Small Analytics é necessário configurar as chaves de acesso no arquivo
twitter4j.properties.

![alt tag](https://raw.githubusercontent.com/juliodasilv/Twitter-Small-Analytics/master/files/config_properties.PNG)

Com a chave e o token de acesso configurados é necessário criar uma instância da classe
TwitterSmallAnalytics.java passando como parâmetro a hashtag que desejar, para que a
contagem dos tweets ocorra. Após isso deve-se escolher uma estratégia de contagem de dados
dos tweets definidos na classe enum Action.java.

## Componentes, Bibliotecas e Frameworks

O sistema foi desenvolvido utilizando uma integração com a API Twitter4J.
O Twitter4J permite chamadas à API do Twitter por meio da linguagem Java facilitando a integração do seu aplicativo Java com os serviços do Twitter. O Twitter4J é uma biblioteca não-oficial.

Características:
 - Funciona em qualquer plataforma Java na versão 5 ou posterior;
 - Plataformas Android e Google App Engine incluídas;
 - Dependência zero: não requer jar’s adicionais;
 - Suporte a OAuth integrado;
 - Suporte a gzip;
 - Compatível com a versão 1.1 do Twitter API.

Essa API viabiliza a integração com o Twitter e assim explorar suas diversas funcionalidades objetivando a coleta, busca e análise de dados, como também formas de interação automatizadas bastante eficazes.

Essa API é composta por diversas bibliotecas nas quais utilizamos:
 - twitter4j-async-4.0.4.jar;
 - twitter4j-core-4.0.4.jar;
 - twitter4j-media-support-4.0.4.jar;
 - twitter4j-stream-4.0.4.jar.

Com a API Twitter4J é possível realizar qualquer tipo de operação que poderia ser efetuada manualmente pelo usuário no site do Twitter, dentre elas: criar tweets, buscar por assuntos com critérios específicos, enviar e visualizar mensagens diretas, entre outras funcionalidades.
Estas funcionalidades permitirão automatizar diversas operações e tornar mais ágil a comunicação com os usuários do Twitter. Por exemplo, é possível desenvolver um sistema que identifique mensagens de reclamação, por meio da busca de temas específicos, e que automaticamente responda estas mensagens solicitando mais informações ou fornecendo algum tipo de feedback. Também é possível que seja estabelecido uma interface com os sistemas próprios da empresa para facilitar e tornar ainda mais ágil este tipo de interação.

## Exemplo de saída no console

Obs: Esta versão de saída foi executada no dia 07 de novembro de 2016 com a hashtag #java8.

Data Inicial - 2016-12-05 | Data Final - 2016-12-12<br/>
Quantidade por dia de tweets da última semana:<br/>
2016-12-05 30 tweets.<br/>
2016-12-06 15 tweets.<br/>
2016-12-07 15 tweets.<br/>
2016-12-08 30 tweets.<br/>
2016-12-09 15 tweets.<br/>
2016-12-10 15 tweets.<br/>
2016-12-11 0 tweets.<br/>
<===========================================><br/>
Quantidade por dia de retweets da última semana:<br/>
2016-12-05 156 retweets.<br/>
2016-12-06 12 retweets.<br/>
2016-12-07 12 retweets.<br/>
2016-12-08 42 retweets.<br/>
2016-12-09 5 retweets.<br/>
2016-12-10 4 retweets.<br/>
2016-12-11 0 retweets.<br/>
<===========================================><br/>
Quantidade por dia de favoritações da última semana:<br/>
2016-12-05 57 favoritações.<br/>
2016-12-06 8 favoritações.<br/>
2016-12-07 8 favoritações.<br/>
2016-12-08 14 favoritações.<br/>
2016-12-09 8 favoritações.<br/>
2016-12-10 4 favoritações.<br/>
2016-12-11 0 favoritações.<br/>
<===========================================><br/>
Primeiro Nome: @ADAMLDAVIS<br/>
Ultimo Nome: @ZDAVEP<br/>
<===========================================><br/>
Data mais antiga: 04/12/2016 08:30<br/>
Data mais recente: 09/12/2016 21:43<br/>
<===========================================><br/>
Tweet postado com sucesso! [12/12/2016 18:01:55 - Trabalho final de Fundamentos Java - 28SCJ - @michelpf].<br/>
<===========================================><br/>

## Diagrama de classes

![alt tag](https://raw.githubusercontent.com/juliodasilv/Twitter-Small-Analytics/master/files/diagram.JPG)

## Resumo das tecnologias utilizadas

* [Twitter4J](http://twitter4j.org/) - O Twitter4J é uma biblioteca que permite realizar chamadas para a API do Twitter através da linguagem Java, podendo realizar a contagem e o monitoramento de tweets em tempo real.
* [Java 8](https://www.java.com/pt_BR/download/faq/java8.xml)  - Versão do Java utilizada.

## Autor

* **Julio Oliveira da Silva** - [juliodasilv](https://github.com/juliodasilv)
* **Helena Strada** - [hstrada](https://github.com/hstrada)
* **Vinícius Rigo** - [vrigosilva](https://github.com/vrigosilva)
