# Markdown

## Pattern Name and Classification
  ###### Method Strategy
  - É um padrão de design comportamental
## Intent
   Permitir a defininição de uma família de algoritmos, colocar cada um deles em uma classe separada e tornar seus objetos intercambiáveis.
## Motivition
 O contexto não é responsável por selecionar um algoritmo apropriado para o trabalho. Em vez disso, o cliente passa a estratégia desejada para o contexto. Na verdade, o contexto não sabe muito sobre estratégias. Funciona com todas as estratégias por meio da mesma interface genérica, que expõe apenas um único método para acionar o algoritmo encapsulado na estratégia selecionada.
## Applicability
   O padrão Strategy permite alterar indiretamente o comportamento do objeto em tempo de execução, associando-o a diferentes sub-objetos que podem realizar subtarefas específicas de maneiras diferentes.
## Structure  
  A classe original, chamada de contexto , deve ter um campo para armazenar uma referência a uma das estratégias. O contexto delega o trabalho a um objeto de estratégia vinculado em vez de executá-lo sozinho.
  ![alt text](https://i2.wp.com/www.e4developer.com/wp-content/uploads/2018/10/strategy-pattern.png?w=669&ssl=1)
## Participants
 ###### Component:
  - Contexto:  mantém uma referência a uma das estratégias concretas e se comunica com esse objeto apenas por meio da interface da estratégia.
  - Cliente:  cria um objeto de estratégia específico e o passa para o contexto. O contexto expõe um setter que permite aos clientes substituir a estratégia associada ao contexto em tempo de execução.
  - Strategy:  A interface de estratégia é comum a todas as estratégias concretas. Ele declara um método que o contexto usa para executar uma estratégia.
  - ConcreteStrategies A/B: implementam diferentes variações de um algoritmo que o contexto usa.




###### Sample Code
  ###### - Pastas no repositório

