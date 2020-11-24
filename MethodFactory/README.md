# Markdown

## Pattern Name and Classification
  ###### Method Factory
  - É um padrão criacional.
## Intent
 Definir uma interface para criar um objeto, mas deixa que as subclasses decidam qual classe instanciar.
Facilitar quando a criação envolve uma serie de objetos (hierarquia).
## Motivition
  Quando se tem uma estrutura complexa de classes que demanda dependencia com varios tipos 
  e quando se deseja reduzir o acoplamento entre as classes, com um unico ponto de responsabilidade.
    
## Applicability
 Podemos usar o factory method quando não sabemos de antemão os tipos e dependencias do objeto que o código deve trabalhar.

## Structure  
 Imagem pesquisada no google:
![alt text](https://miro.medium.com/max/985/1*Fvyhz4KX0zSJB1ldvbnk3A.jpeg)
## Participants
 ###### Component:
    - Client: É quem tem dependência com IProduct.

    - Creator: Define o Factory Method para retornar instância do ConcreteProduct.

    - IProduct: Define a interface de objetos que o factory cria.

    - ProductA:, ProductB: implementa a interface product.


###### Sample Code
  ###### - Pastas no repositório
