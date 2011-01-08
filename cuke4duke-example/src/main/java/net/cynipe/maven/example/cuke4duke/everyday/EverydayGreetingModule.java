package net.cynipe.maven.example.cuke4duke.everyday;

import net.cynipe.maven.example.cuke4duke.GreetingService;

import com.google.inject.AbstractModule;

public class EverydayGreetingModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(GreetingService.class).to(EverydayGreatingService.class);
    }

}
