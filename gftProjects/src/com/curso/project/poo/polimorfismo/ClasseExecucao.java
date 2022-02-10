package com.curso.project.poo.polimorfismo;

public class ClasseExecucao {
    public static void main(String[] args) {

        ClasseMae[] classesVetor = new ClasseMae[]{new ClasseMae(), new ClasseFilha1(), new ClasseFilha2()};

        //polimorfismo

        for(ClasseMae classe : classesVetor){
            classe.metodo1();
        }

        System.out.println("");

        for(ClasseMae classe : classesVetor){
            classe.metodo2();
        }

        System.out.println("");

        //sobrescrita
        ClasseFilha2 classefilha2 = new ClasseFilha2();
        classefilha2.metodo1();
        classefilha2.metodo2();

    }
}
