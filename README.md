# Conversor de Moedas - CLI

Projeto criado para estudo e consolidação de Programação Orientada a Objetos, Herança e Polimorfismo em JAVA. 

Com estruturação no padrão MVC, sua organização foi pensada da seguinte maneira:

* Model <br>
Contém a classe abstrata para criação de Moedas  no arquivo "Currency", <br>
Contém a classe de criação das moedas Euro e Dolar nos arquivos "Euro" e "USDollar".

* Controller <br>
Contém a criação de uma classe para conversão chamando o método "convertToReais" da classe abstrata "Currency" <br>

* View <br>
Contém a classe "Main" com a efetivação do programa com java.util.Scanner.
