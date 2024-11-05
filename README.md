# Gestor de Biblioteca Pessoal

Este projeto é um Gestor de Biblioteca Pessoal desenvolvido em Java, que permite ao usuário gerenciar uma coleção de livros de forma simples e eficiente. O aplicativo permite adicionar, remover e listar livros, além de salvar e carregar a biblioteca de um arquivo usando serialização.

## Funcionalidades

- **Adicionar Livro**: O usuário pode adicionar um novo livro à biblioteca, informando o título, autor, ano de publicação e status (Lido, Não Lido, Em Andamento).
- **Remover Livro**: Permite que o usuário remova um livro da biblioteca com base no título.
- **Listar Livros**: O usuário pode visualizar todos os livros cadastrados na biblioteca.
- **Salvar e Carregar Biblioteca**: O estado da biblioteca pode ser salvo em um arquivo e carregado posteriormente, utilizando a funcionalidade de serialização do Java.

## Estrutura do Código

O projeto utiliza o Command Pattern, facilitando a adição de novos comandos e mantendo o código organizado e fácil de manter. Cada ação (adicionar, remover, listar, salvar) é encapsulada em classes de comando separadas, permitindo uma extensão e testabilidade simplificadas.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para o desenvolvimento do projeto.
- **Serialização**: Para salvar e carregar a biblioteca de livros em um arquivo.
