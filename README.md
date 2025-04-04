# Lab Padrões de Projeto com Spring Boot

Este é um projeto Spring Boot desenvolvido para exemplificar o uso de padrões de projeto, com funcionalidades como persistência de dados, integração de APIs externas e operações CRUD.

## 🛠️ Tecnologias Utilizadas
- **Spring Boot**: Framework para desenvolvimento de aplicações Java.
- **Spring Data JPA**: Gerenciamento de banco de dados.
- **Spring Web**: Criação de APIs REST.
- **Spring Cloud OpenFeign**: Integração com APIs externas (ViaCEP).
- **H2 Database**: Banco de dados em memória.

---

## 📋 Funcionalidades
- Operações CRUD para clientes e endereços.
- Consulta de endereços por CEP usando a API ViaCEP.
- Persistência de dados com banco H2.

---

## 🚀 Como Executar
1. Certifique-se de ter o Java 21 e o Maven instalados no sistema.
2. Clone o repositório:
   ```bash
   git clone https://github.com/seu-repositorio/lab-padroes-projeto-spring.git
   ```
3. Navegue até o diretório do projeto:
   ```bash
   cd lab-padroes-projeto-spring
   ```
4. Execute o comando para iniciar a aplicação:
   ```bash
   mvn spring-boot:run
   ```

---

## 💻 Estrutura do Projeto

### Entidades e Repositórios
- **`Cliente`**:
  - Representa os dados de um cliente, incluindo `id`, `nome` e `endereco`.
  - Relaciona-se com a entidade `Endereco`.
  
- **`Endereco`**:
  - Representa os dados de endereço, como `cep`, `logradouro`, `bairro`, e outros atributos relacionados.
  
- **`ClienteRepository`**:
  - Interface para operações CRUD relacionadas a clientes no banco de dados.

- **`EnderecoRepository`**:
  - Interface para operações CRUD relacionadas a endereços.

---

### Controladores e Serviços
- **`ClienteRestController`**:
  - Controlador REST para gerenciar clientes:
    - **GET `/clientes`**: Busca todos os clientes.
    - **GET `/clientes/{id}`**: Busca um cliente por ID.
    - **POST `/clientes`**: Adiciona um novo cliente.
    - **PUT `/clientes/{id}`**: Atualiza um cliente existente.
    - **DELETE `/clientes/{id}`**: Remove um cliente.

- **`ClienteService`**:
  - Interface que define a lógica de negócios para clientes, utilizando o padrão **Strategy**.

- **`ClienteServiceImpl`**:
  - Implementação da lógica de negócios para clientes, com integração ao banco de dados e à API ViaCEP. Segue os padrões **Facade** e **Singleton**.

- **`ViaCepService`**:
  - Client HTTP criado com **OpenFeign** para consumir a API ViaCEP e consultar CEPs.

---

## 📝 Padrões de Projeto Utilizados
- **Strategy**:
  Permite definir múltiplas implementações para a interface `ClienteService`.

- **Facade**:
  Centraliza e simplifica as integrações entre subsistemas, como o banco de dados e a API ViaCEP.

- **Singleton**:
  Garantido pela anotação `@Service` no Spring para instâncias únicas.

---

## 🤝 Autor
Desenvolvido por **Riany Quaresma**.

