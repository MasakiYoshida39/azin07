package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//↓コントロールと認識させるためのアノテーション
@Controller
public class ParamController {

	@GetMapping("/get-param")
	//リクエストをstringに入れる 引数ぎゃくでもOK 
	public String getParam(@RequestParam String greeting,
//	public String getParam(@RequestParam(name="g") String greeting,
//	public String getParam(@RequestParam(required=false) String greeting,
//	public String getParam(@RequestParam(defaultValue="(未設定)") String greeting,
			Model model) {
	
		model.addAttribute("mGreeting", greeting);
		
		return "display";
	}
}
