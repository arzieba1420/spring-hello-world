package pl.edu.wszib.springhelloworld.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Zawieszenie {

    @Autowired
    private Silnik silnik ;

    @Autowired
    private SkrzyniaBiegow skrzyniaBiegow ;

    @Autowired
    private UkladSterowania ukladSterowania;

}
