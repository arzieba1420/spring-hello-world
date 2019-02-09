package pl.edu.wszib.springhelloworld.model;

import org.springframework.context.annotation.Bean;

import java.util.Random;

public class Wyborca {

    private KartaDoGlosowania kartaDoGlosowania;

    public Wyborca(KartaDoGlosowania kartaDoGlosowania) {
        this.kartaDoGlosowania = kartaDoGlosowania;
    }

    public void oddajGlos(Urna urna) {
        Glos random = Glos.values()[new Random().nextInt(Glos.values().length)];
        kartaDoGlosowania.zaznacz(random);
        urna.wrzuc(kartaDoGlosowania);
    }




}
