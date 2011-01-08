package net.cynipe.maven.example.cuke4duke.everyday;

import net.cynipe.maven.example.cuke4duke.GreetingService;
import net.cynipe.maven.example.cuke4duke.PersonKind;

public class EverydayGreatingService implements GreetingService {

    @Override
    public String greetingFor(PersonKind kind) {
        switch (kind) {
            case FRIEND:
                return "おいすー！";
            case ACQUAINTANCE:
                return "どうも。";
            case STRANGER:
                return "え、誰？";
            default:
                throw new AssertionError();
        }
    }

}
