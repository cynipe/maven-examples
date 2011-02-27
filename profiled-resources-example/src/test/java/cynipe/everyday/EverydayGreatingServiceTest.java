package cynipe.everyday;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import cynipe.PersonKind;


public class EverydayGreatingServiceTest {

	@Test
	public void test01() throws Exception {
		EverydayGreatingService service = new EverydayGreatingService();
		String greeting = service.greetingFor(PersonKind.FRIEND);
		assertThat(greeting, is("おいすー！"));
	}
	
	@Test
	public void test02() throws Exception {
		EverydayGreatingService service = new EverydayGreatingService();
		String greeting = service.greetingFor(PersonKind.ACQUAINTANCE);
		assertThat(greeting, is("どうも。"));
	}
}
