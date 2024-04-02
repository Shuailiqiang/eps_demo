package palworldconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import palworldconfig.service.IEPSHandlerService;
import palworldconfig.util.FileUtil;

import java.io.IOException;

@SpringBootTest
class PalWorldConfigApplicationTests {

	@Autowired
	private IEPSHandlerService service;

	@Test
	void contextLoads() {

	}
}
