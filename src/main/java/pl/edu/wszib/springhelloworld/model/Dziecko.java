package pl.edu.wszib.springhelloworld.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dziecko {

    @Autowired
    private Ciastko ciastko;

    @Autowired
    private Kot kot;



    public void ugryz() {
        if(!this.ciastko.ugryzione()) {
            this.ciastko.ugryz();
            System.out.println("Yum");
        } else {
            System.out.println("Juz ugryzione");
        }
    }

}
