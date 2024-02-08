package kr.ac.kopo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.service.MyTableService;
import kr.ac.kopo.vo.MyTableVO;

@Controller
public class MyTableController {
	
	@Autowired
	MyTableService mytableService;
	
	@RequestMapping(value = "index.do")
	String index (ModelMap model, MyTableVO mtVO) throws Exception {
		List<MyTableVO> list = mytableService.list(mtVO);
		model.addAttribute("list", list);
		return "home";
	}
}
