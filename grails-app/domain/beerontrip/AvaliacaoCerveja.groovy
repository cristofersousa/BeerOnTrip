package beerontrip

class AvaliacaoCerveja {

    Pessoa pessoa
    Estabelecimento estabelecimento
    Integer nota
    String avaliacao

    static constraints = {
        estabelecimento nullable: true

    }
}
