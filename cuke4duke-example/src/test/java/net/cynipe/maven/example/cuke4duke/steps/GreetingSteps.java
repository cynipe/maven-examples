package net.cynipe.maven.example.cuke4duke.steps;

import static net.cynipe.maven.example.cuke4duke.PersonKind.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import net.cynipe.maven.example.cuke4duke.GreetingService;
import net.cynipe.maven.example.cuke4duke.PersonKind;
import net.cynipe.maven.example.cuke4duke.everyday.EverydayGreetingModule;
import net.cynipe.maven.example.cuke4duke.newyear.NewYearGreatingModule;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;

import cuke4duke.StepMother;
import cuke4duke.Steps;
import cuke4duke.annotation.I18n.JA.ならば;
import cuke4duke.annotation.I18n.JA.もし;
import cuke4duke.annotation.I18n.JA.前提;

public class GreetingSteps extends Steps {

    private PersonKind personKind;
    private String actual;

    public GreetingSteps(StepMother stepMother) {
        super(stepMother);
    }

    @前提("^挨拶する相手が(.+)の場合$")
    public void 挨拶する相手が(String personKind) {
        final PersonKind kind = StringToPersonKind.convert(personKind);
        assertThat("指定出来るタイプではありません", kind, is(not(nullValue())));
        this.personKind = kind;
    }

    @もし("^(.+)の挨拶を返す$")
    public void 挨拶を返す(String type) {
        final AbstractModule module = StringToModule.convert(type);
        assertThat("指定できるタイプではありません", module, is(not(nullValue())));
        final GreetingService greetingService = Guice.createInjector(module).getInstance(GreetingService.class);
        actual = greetingService.greetingFor(personKind);
    }

    @ならば("^挨拶は「(.+)」が返される$")
    public void 挨拶は(String expected) {
        assertThat(actual, is(expected));
    }

    static class StringToPersonKind {
        private static final Map<String, PersonKind> DICTIONARY = new HashMap<String, PersonKind>();

        static {
            DICTIONARY.put("友人", FRIEND);
            DICTIONARY.put("知人", ACQUAINTANCE);
            DICTIONARY.put("変な人", STRANGER);
        }

        public static PersonKind convert(String personKind) {
            return DICTIONARY.get(personKind);
        }
    }

    static class StringToModule {
        private static final Map<String, AbstractModule> DICTIONARY = new HashMap<String, AbstractModule>();

        static {
            DICTIONARY.put("正月", new NewYearGreatingModule());
            DICTIONARY.put("普段", new EverydayGreetingModule());
        }

        public static AbstractModule convert(String type) {
            return DICTIONARY.get(type);
        }
    }
}
