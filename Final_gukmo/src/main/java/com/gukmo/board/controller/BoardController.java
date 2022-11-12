package com.gukmo.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


// 페이지 잘 나오나 확인용. 나중에 잘 연결되면 없애고 사용하면 됨.
@Controller
public class BoardController {
	@RequestMapping(value="index.do")
	public String index_test(HttpServletRequest request) {
		return "index";
	}
}



