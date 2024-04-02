package palworldconfig.service.impl;

import palworldconfig.model.EpsVo;
import palworldconfig.service.IEPSHandlerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServerHandlerService implements IEPSHandlerService {

	private Logger logger = LoggerFactory.getLogger(getClass());


	@Override
	public void add() throws Exception {

	}

	@Override
	public void update() throws IOException {

	}

	@Override
	public void delete() throws Exception {

	}

	@Override
	public List<EpsVo> query() throws Exception {
		List<EpsVo> list = new ArrayList<>();
		EpsVo item1 = new EpsVo();
		item1.setEps_num("企业编码001");
		item1.setEps_nme("企业标准名称001");
		item1.setEps_lnm("企业长名称001");
		item1.setEps_cde("企业社会信用代码001");
		list.add(item1);

		EpsVo item2 = new EpsVo();
		item2.setEps_num("企业编码002");
		item2.setEps_nme("企业标准名称002");
		item2.setEps_lnm("企业长名称002");
		item2.setEps_cde("企业社会信用代码002");
		list.add(item2);

		EpsVo item3 = new EpsVo();
		item3.setEps_num("企业编码003");
		item3.setEps_nme("企业标准名称003");
		item3.setEps_lnm("企业长名称003");
		item3.setEps_cde("企业社会信用代码003");
		list.add(item3);

		EpsVo item4 = new EpsVo();
		item4.setEps_num("企业编码004");
		item4.setEps_nme("企业标准名称004");
		item4.setEps_lnm("企业长名称004");
		item4.setEps_cde("企业社会信用代码004");
		list.add(item4);
		return list;
	}
}
