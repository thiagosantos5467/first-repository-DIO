package com.curso.project.poo.veiculos;

public class Veiculo {

    String cor, marca, modelo;
    int capacidadeTanque;


    /* construtores */
    public Veiculo() {
    }

    /*
    public Veiculo(String cor, String marca, int capacidadeTanque, String modelo) {
        this.cor = cor;
        this.marca = marca;
        this.capacidadeTanque = capacidadeTanque;
        this.modelo = modelo;
    }
    */

    /* getters and setters */
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    /* métodos */
    double valorTanque(double preçoGasolina) {
        return capacidadeTanque * preçoGasolina;
    }
}
