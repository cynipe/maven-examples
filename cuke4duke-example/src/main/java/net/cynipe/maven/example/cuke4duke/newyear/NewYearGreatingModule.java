package net.cynipe.maven.example.cuke4duke.newyear;


import net.cynipe.maven.example.cuke4duke.GreetingService;

import com.google.inject.AbstractModule;

public class NewYearGreatingModule extends AbstractModule{

    @Override
    protected void configure() {
        bind(GreetingService.class).to(NewYearGreatingService.class);
    }

}
