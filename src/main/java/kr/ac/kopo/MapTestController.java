package kr.ac.kopo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.kopo.service.MapTestService;
import kr.ac.kopo.vo.RoomVO;

@Controller
public class MapTestController {
	@Autowired
	MapTestService service;
	
	@GetMapping("/map")
	String map(RoomVO roomVO, Model model) {		
		return "MapTests";
	}
	@PostMapping("/map")
	String map(@RequestParam("keyword") String keyword, Model model) {
		List<RoomVO> list = service.selectRoom(keyword);
		model.addAttribute("list",list);
		return "redirect:/map";
	}
}
	
