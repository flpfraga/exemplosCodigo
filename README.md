# Repositório de Exemplos de Código Java

Este repositório contém exemplos práticos de implementação em Java, incluindo padrões de projeto e comportamento de equals e hashCode.

## Estrutura do Projeto

### 1. `design_pattern`

#### **Objetivo**
Implementação do padrão de projeto **Adapter**, permitindo a integração com bibliotecas externas de maneira flexível.

#### **Arquivos**
- **`TotalPedidoService.java`** → Interface que define a assinatura para o serviço de cálculo do total do pedido.
- **`SomaPedidoService.java`** → Classe que simula uma biblioteca externa utilizada para somar valores de pedidos.
- **`TotalPedidoAdapter.java`** → Classe adaptadora que permite a utilização do `SomaPedidoService` dentro do padrão estabelecido pelo `TotalPedidoService`.

#### **Exemplo de Uso**
```java
TotalPedidoService totalPedido = new TotalPedidoAdapter(new SomaPedidoService());
double total = totalPedido.calcularTotal(pedidos);
```

---

### 2. `model_equals_hash_code`

#### **Objetivo**
Demonstração do comportamento dos métodos `equals` e `hashCode` em diferentes classes de modelo e sua influência na comparação de objetos e na utilização em coleções como `Set`.

#### **Arquivos**
- **`Produto.java`** → Implementação dos métodos `equals` e `hashCode`.
- **`Pessoa.java`** → Implementa apenas o `equals`.
- **`Pedido.java`** → Implementa os métodos `equals` e `hashCode`.
- **Testes Unitários** → Cada classe possui um teste unitário correspondente para validar o comportamento esperado.

#### **Comportamento Demonstrado**
- Comparar objetos com `equals`.
- Inserção de objetos em um `Set` e verificação da unicidade dos elementos.

#### **Exemplo de Uso**
```java
Set<Produto> produtos = new HashSet<>();
produtos.add(new Produto(1, "Notebook"));
produtos.add(new Produto(1, "Notebook")); // Não será adicionado se equals e hashCode estiverem implementados corretamente
```

---

## Como Executar os Testes

Os testes unitários foram implementados para validar os comportamentos apresentados. Para executá-los, utilize:
```sh
mvn test
```
Ou, caso esteja usando JUnit no IntelliJ ou Eclipse, rode os testes diretamente na IDE.

---

## Contribuição
Sinta-se à vontade para abrir **issues** e enviar **pull requests** para melhorias no projeto.

---

## Licença
Este projeto está licenciado sob a **MIT License**.

