package kr.ac.kopo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.ac.kopo.service.MapTestService;
import kr.ac.kopo.vo.RoomVO;

@Controller
public class MapTestController {
	@Autowired
	MapTestService service;
	
	@GetMapping("/maptest")
	String maptest(RoomVO roomVO, Model model) {
		List<RoomVO> list = service.selectRoom();
		model.addAttribute("list",list);
		return "MapTest";
	}
	
	@GetMapping("/map")
	String map(RoomVO roomVO, Model model) {
		List<RoomVO> list = service.selectRoom();
		model.addAttribute("list",list);
		return "MapTests";
	}
	
	
}
