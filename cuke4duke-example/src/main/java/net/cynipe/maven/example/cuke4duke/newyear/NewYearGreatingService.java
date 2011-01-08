package net.cynipe.maven.example.cuke4duke.newyear;

import net.cynipe.maven.example.cuke4duke.GreetingService;
import net.cynipe.maven.example.cuke4duke.PersonKind;

public class NewYearGreatingService implements GreetingService {

    @Override
    public String greetingFor(PersonKind kind) {
        switch (kind) {
            case FRIEND:
                return "あけおめー！";
            case ACQUAINTANCE:
                return "明けましておめでとうございます。";
            case STRANGER:
                return "え、誰？";
            default:
                throw new AssertionError();
        }
    }

}
