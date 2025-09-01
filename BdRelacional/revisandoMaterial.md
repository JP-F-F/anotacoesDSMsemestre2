# Revisando o powerPoint Aula02_Geral

## Coisas sobre o SQL

O **SQL** Tem alguns subconjuntos, sendo eles:
* DML - Linguagem de manipulação de dados(Select, Insert, Update, Delete)
* DDL - Linguagem de definição de dados(Create, Drop, Alter)
* DCL - Linguagem de controle de dados(Grant, Revoke)
* DTL - Linguagem de transações de dados(Begin Transaction, Commit Transaction, Rollback Transaction)

_SQL é uma linguagem não procedural_

Nós podemos usar a função isNull para tratar valores nulos no banco de dados.
A sintaxae funciona mais ou menos assim: isNull(Expressão, **expressão alternativa**).
A função ira verificar se a expressão é nula, se for ela irá **substituir pelo valor da expressão alternativa**

Caso queiramos eliminar registros duplicados que retornam no select, usamos a cláusa **DISTINCT**.

Aparentemente para visualizarmos a estrutura de uma tabela usamos **sp_help NomeDaTabela**

O operador é usado para chegar se os valores de uma tabela estão em valores específicos, ao invés de usarmos por exemplo: cidade = diadema or cidade = SBC, podemos usar o _IN_, por exemplo: where nomeCidade IN (diadema, SBC).

Para ordernarmos uma coluna, usamos o **ORDER BY**, usamos **ASC** para organizar em ordem ascendente e **DESC** para descendente, também podemos usar um número positivo que representa a posição da coluna na seleção.

Caso queiramos agrupar colunas numa query, usamos o **GROUP BY**, aí caso queiramos selecionar grupos específicos dessa query usamos o **HAVING**.

# Revisando aula 2.1 CriandoBD

O que é uma **Chave Candidata/Alternativa** é uma coluna ou combinação de colunas que pode ser uma chave primária.

## Falando de restrições de Integridade

Os SGBD devem garantir a integridade dos dados através dos mecanismos de restrição de integridade

* Integridade declarativa: Devem ser garantidas automaticamente por um SGBD a partir da sua delcaração na definição das tabelas(PKs e etc).

* Integridade de domínio: Define que os valores devem obedecer a definição de valores da coluna, essas definições podem ser os domínios(int, char e etc), definir uma possibilidade de valores (masculino ou feminino), ou até fórmulas(> 0)
* Domínio: Conjunto de valores que o campo de uma tabela pode assumir.

* Valores vazios - NULL: devemos especificar se uma coluna pode ter NULL, **somente colunas opcionais podem ter valores NULL**

Caso queiramos alterar uma tabela ou coluna usamos o **ALTER TABLE ou ALTER COLUMN**

Caso queiramos colocar uma validação em uma coluna, podemos usar o **CHECK**, EX: sexo char(1)... **CHECK(sexo in('F','M'))**;

