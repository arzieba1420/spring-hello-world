package pl.edu.wszib.springhelloworld.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.edu.wszib.springhelloworld.model.*;

@Configuration
public class MainConfiguration {

    @Bean("Klocki")
    public Zabawka zabawka1(){
        return new Klocki();
    }
    @Bean("Mis")
    public Zabawka zabawka2(){
        return new Mis();
    }
    @Bean("Samochodzik")
    public Zabawka zabawka3(){
        return new Samochodzik();
    }

    @Bean
    public Dziecko jas(@Qualifier("Klocki") Zabawka zabawka) {
        Dziecko jas = new Jas(zabawka);
        jas.odpakuj();
        return jas;
    }

    @Bean
    public Dziecko malgosia(@Qualifier("Mis") Zabawka zabawka) {
        Dziecko malgosia = new Malgosia(zabawka);
        malgosia.odpakuj();
        return malgosia;
    }

    @Bean
    public Dziecko grzes(@Qualifier("Samochodzik") Zabawka zabawka) {
        Dziecko grzes = new Grzes(zabawka);
        grzes.odpakuj();
        return grzes;
    }

}
