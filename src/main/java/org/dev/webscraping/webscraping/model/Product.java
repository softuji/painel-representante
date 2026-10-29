package org.dev.webscraping.webscraping.model;

public class Product {
    private String descricao;
    private String dadosValores;

    public Product(String descricao, String dadosValores) {
        super();
        this.descricao = descricao;
        this.dadosValores = dadosValores;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDadosValores() {
        return dadosValores;
    }

    public void setDadosValores(String dadosValores) {
        this.dadosValores = dadosValores;
    }


    @Override
    public String toString() {
        return "Produto [descricao=" + descricao + ", dadosValores=" + dadosValores + "]";
    }

}

