package kr.ac.kopo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapTestController {
	
	@GetMapping("/maptest")
	String maptest() {
		return "MapTest";
	}
}
