package com.francescosala.cursomc.domain.enums;


public enum EstadoPagamento {

    PENDENTE(1, "Pedido Pendente"),
    QUITADO(2, "Pedido Quitado"),
    CANCELADO(3, "Pedido Cancelado");


    private Integer codigo;
    private String descricao;

    private EstadoPagamento(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static EstadoPagamento toEnum(Integer codigo) {

        if (codigo == null)
            return null;

        for (EstadoPagamento tipo : EstadoPagamento.values()) {
            if (codigo.equals(tipo.getCodigo())) {
                return tipo;
            }
        }

        throw new IllegalArgumentException("Id inválido: " + codigo);

    }

}