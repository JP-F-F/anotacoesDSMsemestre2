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

# Revisando aula 2.2 comandos DML

Usamos o comando ***INSERT*** para adicionar linhas em uma tabela.
```sql
INSERT INTO nomeTabela VALUES
```
podemos após o "into" especificar que colunas preencher e após o "values" uma lista de expressões e valores fixos, em ambos os casos colocamos entre parênteses as colunas ou expressões e etc.

O comando ***UPDATE*** serve para alterar os dados das tabelas.
```sql
UPDATE <tabela> | <view> SET coluna [coluna] = {expressão} [WHERE <condicao>]
``` 

# Revisando aula 05 Transformação entre modelos

## Composição de um banco de dados relacional

Um banco de dados relacional é composto de **tabelas** e **relações**.
**Tabelas** são um conjunto não ordenado de linhas(**tuplas**).
As **linhas** são compostas por uma série de campos(valor de **atributo**).
Cada **Campo** é identificadp por um nome de campo(**Nome de atributo**).
O conjunto de campos homônimos de todas as linhas de uma tabela forma uma **coluna**.

Observações sobre tabelas:

* As linhas de uma tabela **Não têm ordenação** - a ordem de recuperação é arbitrária, a menos que uma ordenação seja especificada na instrução da consulta.
* Não existem linhas duplicadas.
* Não é possível referenciar linhas de uma tabela por posição.
* Os valores de um campo de uma tabela são atômicos(indivísivel) e monovalorados(apenas um valor por campo).

## Chaves Candidatas

colunas ou conjunto de colunas de uma tabela que indentificam de forma única cada linha.
O fato de todas as linhas de uma tabela serem distintas entre si garante a existência de ao menos uma chave candidata na tabela.
EX: RA, CPF, RG

Exige-se que seja mínima (quando todas as suas colunas forem efetivamente necessárias para garantir o requisito de unicidade de valores chave)
Uma tabela sempre tem ao menos uma chave candidata e pode ter mais que uma.
As chaves candidatas não tem classificação, todas possuem a mesma relevância na tabela.

## Chaves primárias

Quando vamos escolher uma chave candidata para se tornar uma chave primária, devemos considerar a existência de referências a esta chave primária em outras tabelas(chave estrangeira).
Quando definimos uma chave primária estamos definindo uma restrição de integridade e não um caminho de acesso(índice).

## Chave estrangeira
