package com.curso.project.poo.veiculos;

public class Caminhao extends Veiculo {

    int capacidadePeso;

    /* construtores */
    public Caminhao() {
    }

    /*
    public Caminhao(int capacidadePeso) {
        this.capacidadePeso = capacidadePeso;
    }
     */

    /* gettes and setters */
    public int getCapacidadePeso() {
        return capacidadePeso;
    }

    public void setCapacidadePeso(int capacidadePeso) {
        this.capacidadePeso = capacidadePeso;
    }
}
