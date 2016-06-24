package beerontrip

class Endereco {
    String rua
    Integer nro
    String bairro
    String complemento
    String cidade
    String estado


    static constraints = {
        complemento nullable: true;

    }
}
