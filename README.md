# 📦 Projeto de Modelagem Conceitual UML para Sistema de Pedidos  

## 📌 Sobre o Projeto  
Este projeto consiste na modelagem conceitual de um sistema de pedidos utilizando **UML (Unified Modeling Language)** e sua implementação prática com **Java, Spring Boot e JPA**. O objetivo foi criar uma estrutura robusta para representar pedidos, clientes, produtos e pagamentos de forma eficiente e escalável.  

## 📊 Diagrama UML  
A modelagem do sistema pode ser visualizada no diagrama abaixo:  

![Diagrama UML](https://github.com/user-attachments/assets/11c29c9d-4a65-4120-9a50-3f20a4e032ac)


## 🔧 Tecnologias Utilizadas  
- **Java 17**  
- **Spring Boot**  
- **JPA / Hibernate**  
- **Maven**  
- **H2 Database (banco em memória para testes)**  
- **Postman (para testes dos endpoints REST)**  

## 🏗️ Estrutura do Projeto  
O sistema foi desenvolvido com uma abordagem modular e orientada a objetos, respeitando boas práticas de desenvolvimento. Ele contém as seguintes entidades principais:  

- **Customer**: Representa um cliente e seus dados pessoais.  
- **Order**: Pedido feito por um cliente, contendo produtos e um método de pagamento.  
- **Product**: Produto disponível para compra, vinculado a uma ou mais categorias.  
- **Payment**: Representa o pagamento, podendo ser por boleto ou cartão.  
- **Address**: Endereço do cliente, vinculado a uma cidade e estado.  
- **City e State**: Estruturas para organização geográfica dos endereços.  

## 🔥 Funcionalidades  
✅ Cadastro de clientes, pedidos e produtos.  
✅ Relacionamento entre pedidos e produtos, permitindo múltiplos itens por compra.  
✅ Pagamentos com diferentes tipos (cartão e boleto).  
✅ API REST para manipulação dos dados.  

## 🚀 Como Rodar o Projeto  
### Pré-requisitos  
- Ter o **Java 8 ou mais** instalado
- Ter o **Maven** instalado

### Passos  
1. Clone o repositório:  
   ```bash
   git clone https://github.com/FrancescoSala/cursomc.git
   ```  
2. Acesse a pasta do projeto:  
   ```bash
   cd cursomc
   ```  
3. Instale as dependências:  
   ```bash
   mvn install
   ```  
4. Execute a aplicação:  
   ```bash
   mvn spring-boot:run
   ```  
5. Acesse a API no navegador ou via Postman:  
   ```bash
   http://localhost:8080
   ```  
