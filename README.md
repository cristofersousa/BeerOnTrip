![TripOnBeer](https://github.com/cristofersousa/TripOnBeer/blob/master/beerontrip1.png)

#Beer on Trip
Projeto baseado na proposta do TripAdvisor porém sobre Cervejas e Gastronomia, o BeerOnTrip tem como objetivo principal a integração entre consumidores e produtores de cervejas. O sistema proverá informações para consumidores, de leigos a experts, de apreciação e de como encontrar uma boa cerveja.

### Proposta:
O sistema permitirá a criação de usuários em diversos níveis, que poderão cadastrar cervejas, bares, opniões e calssificar tais itens. O sistema também vai permtir que o proprietário de uma marca de cerveja ou de um estabelecimento responda comentários sobre seu produto/estabelecimento.

O sitema tem como principais funcionalidasdes:
  - 	Cadastro e manutenção de usuários;
  - 	Cadastro e manutenção de cervejas;
  - 	Cadastro e manutenção de estabelecimentos;
  - 	Listagem de cervejas com melhores/piores avaliações;
  - 	Listagem de estabelecimentos com melhores/piores avaliações;
  -  O sistema não abrange a área de venda de cervejas, bem como a comercialização de produtos.

#### Back-end da aplicação deve ser construída adotado a JVM, adotando os seguintes critérios:

* Grails
* MySQL
* Container TomCat

#### Front-end da aplicação, pode ter os seguintes critérios:

* Bootstrap 3.3.6
* HTML5
* CSS3
* JavaScript
* jQuery

#### Funcionalidades:

* Usuário deverá ter um cadastro ( nome, e-mail, foto, interesses)
* Usuário poderá cadastrar cervejas não existentes somente se possuir conta no sistema.
* Home terá uma notícia padrão sobre cervejas, alguma curiosidade(Isso o ADM vai colocar)
* Buscar por cervejas via (nome, país, tipo)
* Estabelecimentos terá informações sobre bares que pode ser atualizada por um admin;
* Establecimentos também deve conter um campo de busca tipo da página início;
* Estabelecimentos podem ter um filtro de pesquisa por tipo de estabelecimento;
* About é uma pagina mais simples, só com um histórico e afins;
* Contact e Access são respectivamente para enviar uma mensagem e para logar/cadastrar.

#### Roles/Permissão

- 1	Administrador: Super usuário do sistema, capaz de cadastrar usuários, bares, cervejas, bem como apagar e editar tais items. Possui privilégio total no site
- 2	Usuário: Capaz de solicitar o cadastro de novas cervejas/estabelecimentos mediante aprovação dos administradores, pode avaliar estabelecimentos e cervejas.
- 3	ProprietárioEstabelecimento: Pode realizar alterações em seu estabelecimento, cadastrar ou retirar cervejas em seu estabelecimento, solicitar relatório de avaliações.
- 4	ProprietárioCerveja: Pode realizar alterações na sua marca de cerveja, solicitar relatório de avaliações e responder a eventuais dúvidas dos demais usuários.


#### Dúvidas do Cliente:

- Somente usuários logados podem adicionar cervejas;
- Opção de cadastrar usuário caso ainda não exista;
- Rodar aplicação no Heroku ou na Openshift
- Criar o CRUD da app

### License

MIT @cristofersousa
