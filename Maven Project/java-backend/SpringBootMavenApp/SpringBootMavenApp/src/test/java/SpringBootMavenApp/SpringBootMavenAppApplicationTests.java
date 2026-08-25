package SpringBootMavenApp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(TeluskoController.class)
class SpringBootMavenAppApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void greetReturnsTheJspViewAndModel() throws Exception {
		mockMvc.perform(get("/greet"))
				.andExpect(status().isOk())
				.andExpect(view().name("greet"))
				.andExpect(model().attribute("wish", "Good Morning!"));
	}

}
