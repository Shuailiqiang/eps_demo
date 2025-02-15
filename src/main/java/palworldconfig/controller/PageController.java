package palworldconfig.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import palworldconfig.model.EpsVo;

@RequestMapping({""})
@Controller
public class PageController {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@GetMapping("/page/update")
	public String updatePage(@RequestParam String eps_num, RedirectAttributes attribdatautes) {
		EpsVo epsVO = new EpsVo();
		epsVO.setEps_nme(eps_num);
		attribdatautes.addAttribute(epsVO);
		return "pages/update";
	}

	@GetMapping("/serverConfig")
	public String config() {
		return "pages/config";
	}
	@GetMapping("/serverSaved")
	public String saved() {
		return "pages/saved";
	}

}
