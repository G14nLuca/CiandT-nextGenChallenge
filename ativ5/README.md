# Atividade 5

## Descrição

Uma famosa empresa de streams de jogos quer fornecer para seus streamers um mecanismo para que eles possam realizar sorteios nas suas lives de formas a dar mais chances para seus fãs mais fiéis. Você foi contratado com a missão de ajudar a automatizar esse sorteio, sendo que ele deve seguir as seguintes regras:

- A chance de uma pessoa ser sorteada é diretamente proporcional às horas de conteúdo que ela assistiu naquele canal. Assim sendo, uma pessoa que ficou 20 horas acompanhando esse streamer tem o dobro de chances de ser sorteado do que uma pessoa que o assistiu durante 10 horas, se ambas não forem assinantes pagos. O número de horas é recebido em minutos e é sempre arredondado para cima, ou seja:
    - 181 minutos = 4 horas
    - 180 minutos = 3 horas
    - 179 minutos = 3 horas
- Se você possui uma assinatura paga da plataforma, suas chances são dobradas. Assim, no caso acima, se a pessoa que assistiu 10 horas for assinante premium e a que assistiu 20 horas não, ambos terão a mesa chance no sorteio.

## Exemplo e explicação
- assinante = [True, False]
- horas_assistidas = [60, 120]
- output: [50, 50]

Ambas as pessoas do exemplo acima possuem 50% de chance de ganhar o sorteio.
A pessoa 1, embora tenha assistido apenas 1 hora de conteúdo, por ser assinante, acaba tendo 2 chances.
A pessoa 2 não é assinante mas, por ter assistido 2 horas de conteúdo, também possui 2 chances.