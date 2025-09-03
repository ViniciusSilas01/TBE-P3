## TBE-P3
**Repositório destinado a cadeira de Tecnologia para Back-End - P3.**

## Projeto Aluno Online

## Descrição Geral:
O projeto "Aluno Online" foi desenvolvido durante a disciplina de Tecnologias para Back-End, sendo uma API RESTful construída com o ecossistema Spring. Seu objetivo principal é gerenciar o cadastro de alunos, professores, disciplinas e matrículas. 

## Estrutura do Projeto

. Model - Define os atributos das classes que representam as entidades do sistema. 

. Repository - Define a interface de acesso aos dados, conectando o serviço ao banco de dados. Há um repositório para cada entidade.

. Service - Centraliza as regras de negócio, intermediando a comunicação entre os controllers e os repositórios. Cada entidade possui um serviço específico.

. Controller - Responsável por gerenciar as requisições HTTP e encaminhá-las ao serviço correspondente. Cada entidade possui seu próprio controller.

. Enums - Enumerações utilizadas no sistema para categorização e controle de estados.

. DTO (Data Transfer Object) - Os DTOs são utilizados para transportar dados entre as camadas do sistema, evitando a exposição direta das entidades.

. Config - Inclui configurações específicas para a integração do Swagger e outros aspectos relevantes.

## Tecnologias do Projeto

. Java 17 - Linguagem. 

. Spring - Framework.

. PostgreSQL - Banco de Dados.

. Insomnia - Instrumento de Verificação.

. DBeaver - Gerenciador do Banco.

## Módulos do projeto

. Spring Boot - Framework base para a criação da API.

. Spring Web - Responsável por fornecer suporte às requisições HTTP e implementação de endpoints.

. Spring Data JPA - Facilita a interação com o banco de dados, simplificando as operações CRUD.

. Lombok - Reduz a repetição de código ao gerar automaticamente métodos como get, set, toString, entre outros.

. PostgreSQL - Permite a comunicação entre o Spring e o banco de dados PostgreSQL.

. Swagger - Gera uma documentação interativa acessível via URL, facilitando a visualização e o teste das funcionalidades da API.

