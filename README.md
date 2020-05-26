# Api-Rest-com-Spring-boot

### Funcionamento da API

Api Rest desenvolvida em Java com Spring boot e JPA, para cadastro de Clientes em um banco de dados local Postgres.Todas as operações no banco são feitas através de requisições HTTP (Get, Post, Put e Delete) feitas para a API.

#### Exemplos de Requisições:

##### Listar todos os Clientes

- Requisição do Tipo GET;
- URI: http://localhost:8080/cliente/listarTodos;

Retorna um Json com todos os clientes do banco.

##### Pegar um único cliente dado um Id

- Requisição do Tipo GET;
- URI: http://localhost:8080/cliente/porId/Id_cliente;

Retorna um Json com o cliente do respectivo Id.

##### Cadastrar Cliente

- Requisição do Tipo POST;
- URI: http://localhost:8080/cliente/cadastrar;

- Passar cliente como parametro em Json no corpo da requisição, Exemplo:

```javascript
{
  "nome":"João",
  "cpf":"123.123.123.12",
  "sexo":"m"
}
```

Retorna um Json com o cliente cadastrado indicando o sucesso da operação.

##### Cadastrar Cliente

- Requisição do Tipo PUT;
- URI: http://localhost:8080/cliente/atualizar;

- Passar cliente como parametro em Json no corpo da requisição, Exemplo:

```javascript
{
  "id": 1,
  "nome":"João Mario",
  "cpf":"123.123.123.12",
  "sexo":"m"
}
```

Retorna um Json com o cliente atualizado indicando o sucesso da operação.

##### Deletar Cliente

- Requisição do Tipo DELETE;
- URI: http://localhost:8080/cliente/deletar/Id_cliente;

Retorna um Json com o cliente deletado indicando o sucesso da operação.


