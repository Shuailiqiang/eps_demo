package palworldconfig.service;

import palworldconfig.model.EpsVo;

import java.io.IOException;
import java.util.List;

public interface IEPSHandlerService {

	void add() throws Exception;

	void update() throws IOException;

	void delete() throws Exception;

	List<EpsVo> query() throws Exception;
}
