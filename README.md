# hexagonal-integration-base

Este projeto é um exemplo de implementação da Arquitetura Hexagonal (ou Ports and Adapters) para a integração com uma API externa. A Arquitetura Hexagonal promove a separação clara entre o núcleo da aplicação e as dependências externas, facilitando a manutenção e testes do sistema.

## Objetivos:
- Demonstrar a aplicação da Arquitetura Hexagonal em um projeto real.
- Prover uma base modular e testável para integrações com APIs externas.
- Facilitar a substituição ou adição de novas APIs com mínima alteração no núcleo da aplicação.

## Estrutura do Projeto:
- **Core:** Contém a lógica de negócios, entidades e interfaces (ports).
- **Adapters:** Implementações concretas das interfaces definidas no core, responsáveis pela integração com a API externa.
- **Application:** Orquestradores e casos de uso que interagem com o core e os adapters.

## Tecnologias Utilizadas:
- [Nome da linguagem/framework]
- [Biblioteca para testes]
- [Outras ferramentas e bibliotecas]

## Como Executar:
Instruções para clonar o repositório, instalar dependências e executar a aplicação.

## Contribuição:
Sinta-se à vontade para abrir issues e pull requests. Todos os tipos de contribuições são bem-vindos!



Dolar BC:
https://dadosabertos.bcb.gov.br/dataset/dolar-americano-usd-todos-os-boletins-diarios/resource/ae69aa94-4194-45a6-8bae-12904af7e176
https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/odata/CotacaoDolarDia(dataCotacao=@dataCotacao)?@dataCotacao='06-28-2024'&$top=100&$format=json
