package cynipe.everyday;

import cynipe.GreetingService;
import cynipe.PersonKind;

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
