# Sistema de Gerenciamento de Estoque

## Visão Geral do Sistema

O **Sistema de Gerenciamento de Estoque** é uma aplicação simples desenvolvida em Java que permite o gerenciamento de produtos em um estoque. O sistema possibilita aos usuários realizar as seguintes operações:

- Adicionar novos produtos ao estoque.
- Remover produtos existentes do estoque.
- Atualizar a quantidade de um produto.
- Exibir o estoque atual.
- Calcular o valor total do estoque com base nos preços e quantidades dos produtos.

Este sistema é destinado a pequenas empresas ou armazéns que necessitam de um controle simples de estoque, sem a complexidade de sistemas mais robustos.

## Objetivos do Sistema

O principal objetivo do sistema é fornecer uma interface simples para a gestão de um estoque de produtos. Os usuários podem facilmente adicionar, remover e atualizar informações dos produtos, além de visualizar o valor total do estoque.

## Funcionalidades Principais

- **Adicionar Produto**: Permite ao usuário adicionar novos produtos ao estoque, fornecendo informações como nome, preço e quantidade.
- **Remover Produto**: Permite a remoção de produtos do estoque com base no nome do produto.
- **Atualizar Quantidade de Produto**: Atualiza a quantidade de um produto específico no estoque.
- **Exibir Estoque**: Exibe todos os produtos no estoque, mostrando nome, preço e quantidade.
- **Calcular Valor Total do Estoque**: Calcula o valor total do estoque com base nos preços e nas quantidades dos produtos.

## Processo de Desenvolvimento

### Etapa 1: Definição de Requisitos

Os requisitos para o sistema foram definidos com base nas necessidades de controle de estoque. O sistema precisava ser simples, com funcionalidades básicas de gerenciamento de produtos. As principais operações identificadas foram: adicionar, remover, atualizar e exibir produtos, além de calcular o valor total do estoque.

### Etapa 2: Análise de Projeto

Com base nos requisitos, o sistema foi projetado para ser modular e fácil de manter. O projeto foi dividido em classes que representam os **Produtos** e o **Estoque**. Cada classe possui responsabilidades bem definidas, seguindo o princípio de responsabilidade única:

- **Classe `Product`**: Representa um produto no estoque com informações sobre nome, preço e quantidade.
- **Classe `Stock`**: Gerencia a coleção de produtos, com métodos para adicionar, remover, atualizar, exibir e calcular o valor total do estoque.
- **Classe `Main`**: Contém a lógica principal que permite a interação com o usuário através de um menu de opções.

### Etapa 3: Implementação

O sistema foi implementado utilizando Java e a biblioteca `Scanner` para interação com o usuário via linha de comando. A lógica de controle do estoque foi implementada na classe `Stock`, enquanto a classe `Product` foi usada para representar individualmente os produtos.

### Etapa 4: Testes

Embora o sistema seja simples, testes manuais foram realizados para verificar se as funcionalidades estavam sendo executadas corretamente. As operações de adicionar, remover e atualizar produtos foram testadas em diferentes cenários para garantir o comportamento esperado.

### Etapa 5: Manutenção e Melhorias Futuras

Este projeto pode ser expandido para incluir funcionalidades adicionais, como:

- **Persistência de dados**: Armazenamento dos produtos em um banco de dados para manter os dados entre reinicializações do sistema.
- **Interface gráfica**: Substituição da interface de linha de comando por uma interface gráfica (GUI).
- **Autenticação de usuários**: Implementação de um sistema de login para restringir o acesso a certas funcionalidades.

### Estágio de Maturidade

Este projeto está em um estágio inicial de desenvolvimento, com funcionalidades básicas implementadas. Futuramente, novas funcionalidades poderão ser adicionadas, conforme a necessidade, seguindo as melhores práticas de gestão de projetos e desenvolvimento de software.

## Requisitos Técnicos

- **Java**: A aplicação foi desenvolvida utilizando a linguagem de programação Java.
- **Maven**: Foi utilizado o Maven como ferramenta de gerenciamento de dependências e build.
- **Git**: O código-fonte é versionado utilizando Git.

## Como Executar o Projeto

1. Clone este repositório:

   ```bash
   git clone https://github.com/Contagiovaneines/Sistema-de-Gerenciamento-de-Estoque.git
   ```

2. Navegue até o diretório do projeto:

   ```bash
   cd Sistema-de-Gerenciamento-de-Estoque
   ```

3. Compile o projeto utilizando o Maven:

   ```bash
   mvn clean install
   ```

4. Execute a aplicação:

   ```bash
   mvn exec:java
   ```

## Contribuições

Contribuições são bem-vindas! Se você deseja contribuir, siga as etapas abaixo:

1. Faça um fork deste repositório.
2. Crie uma nova branch para suas alterações:
   ```bash
   git checkout -b minha-branch
   ```
3. Faça suas alterações e faça o commit:
   ```bash
   git commit -m "Descrição das minhas alterações"
   ```
4. Envie para o repositório remoto:
   ```bash
   git push origin minha-branch
   ```
5. Abra um Pull Request explicando suas alterações.

## Licença

Este projeto é licenciado sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## Contato

Desenvolvido por [Contagiovaneines](https://github.com/Contagiovaneines).
```

Esse modelo segue o padrão CMMI, com uma descrição detalhada de cada etapa do desenvolvimento e organização do processo de software. Além disso, ele deixa espaço para futuras melhorias e contribuições, o que é importante para o aprimoramento contínuo do projeto.
