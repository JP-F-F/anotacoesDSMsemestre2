# Revisando o arquivo aula_02_TP

POO é um paradigma de programação.
A POO facilita a comunicação entre analista e utilizador, por referenciar/usar objetos da vida real; 
Também é muito útil para _reutilização de código_, pois é possível usar os mesmos objetos em projetos diferentes;

## Programação estruturada VS. POO

|Programação OO | Programação Estruturada |
|---------------|-------------------------|
|Métodos        | Procedimentos e Funções |
|Atributos      | Dados                   |
|Mensagens      | Chamdas                 |
|Classes        | Tipos de Dados          |
|Herança        | Não Existe              |
|Controle do Usuário| linear              |

## Características do JAVA

* **Portabilidade**: seus byte codes(código binário dq aplicação) podem ser executados em várias plataformas sem restrição;
* **Uso Geral**: pode fazer desde smart-cards a mainframes;
* **Linguagem Distríbuida(RMI, EJB)**: possui API's para criar objetos distribuidos onde partes de uma aplicação pode ser executada em diversas máquinas;
* **Segurança(Sandbox)**: Controle de segurança do ambiente de execução das aplicações;
* **Multithreading**: Suporta programação de aplicações multitarefa, compostas por várias threads;
* **Linguagem Dinâmica(JCP)**: O java evolui com constancia pois ele é melhorado pela comunidade constantemente;
* **JAVA e a Internet(Applets, Serviets / JSP)**: Total suporte para criação de aplicações em rede/web.

## Ambiente Java e os Bytecodes

* O _código compilado_ gera um conjunto de instruções chamado **bytecodes**;
* O bytecode é _aplicado na JVM_ que interpreta os comandos para o SO; basicamente o JVM traduz o java para o SO.
* Esse bytecodes podem ser **_interpretados_ por qualquer máquina JAVA**;

## Ambiente java e o garbage collection

* É o responsável por alocar e liberar memória;
* Quando uma váriavel é declarada o JVM 