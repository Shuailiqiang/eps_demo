package palworldconfig.controller;


import palworldconfig.model.EpsVo;
import palworldconfig.model.LayTableVo;
import palworldconfig.model.ResponseCommonVo;
import palworldconfig.service.IEPSHandlerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import palworldconfig.util.ListUtil;

import java.io.IOException;
import java.util.List;

@RequestMapping("/eps")
@RestController
public class EpsController {

	private IEPSHandlerService epsHandlerService;

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	public EpsController(IEPSHandlerService serverHandlerService) {
		this.epsHandlerService = serverHandlerService;
	}

	@PostMapping("/add")
	public ResponseCommonVo add(@RequestBody EpsVo epsVo) throws Exception {
		logger.info("add ===> " + epsVo);
		epsHandlerService.add();

		ResponseCommonVo resVo = new ResponseCommonVo();
		resVo.setCode(0);
		return  resVo;
	}

	@GetMapping("/delete")
	public void delete() throws Exception {
		logger.info("delete ===> ");
		epsHandlerService.delete();
	}

	@GetMapping("/update")
	public void update() throws IOException {
		epsHandlerService.update();
	}

	@GetMapping("/query")
	public LayTableVo query() throws Exception {
		LayTableVo resVO = new LayTableVo();

		List<EpsVo> epsVoList = epsHandlerService.query();
		if (ListUtil.isEmpty(epsVoList)){
			resVO.setCode(-1);
			resVO.setMsg("未能获取企业信息");
		} else {
			resVO.setCode(0);
			resVO.setMsg("成功");
			resVO.setData(epsVoList);
			resVO.setCount(epsVoList.size());
		}

		return resVO;
	}

}
