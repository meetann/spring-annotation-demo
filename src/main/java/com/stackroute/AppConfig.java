package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration

public class AppConfig {

    @Bean
    public Actor actorBean(){
        Actor actor1 = new Actor("Chris Hemsworth", "Male" , 36);
        Actor actor = new Actor("Robert Downey Jr" , "Male" , 54);
        return actor;
    }

//    @Bean
//    public Actor actorBeanAgain(){
//        Actor actor = new Actor("Robert Downey Jr" , "Male" , 54);
//        return actor;
//    }

    @Bean
    @Scope("prototype")
    public Movie movieBean(){
        Movie movie = new Movie(actorBean());
        return movie;
    }


}
