package model;

import java.util.Random;

public class Gateway {
    public boolean cobrar(float valor) {

        Boolean[] respostas = new Boolean[2];
        respostas[0] = true;
        respostas[1] = false;

        Random gerador = new Random();
        int random = gerador.nextInt(2);

        return respostas[random];
    }
}