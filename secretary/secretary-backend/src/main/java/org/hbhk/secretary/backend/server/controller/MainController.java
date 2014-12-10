package org.hbhk.secretary.backend.server.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hbhk.aili.core.server.web.BaseController;
import org.hbhk.aili.core.share.util.RandomValidateCodeUtil;
import org.hbhk.secretary.backend.shared.consts.SecretaryConstans;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/backend")
public class MainController extends BaseController {

	@RequestMapping("/getValidatecode")
	public void getValidatecode(HttpServletRequest request,
			HttpServletResponse response) {
		RandomValidateCodeUtil.getRandcode(request, response,
				SecretaryConstans.VALIDATECODEKEY);
	}

	@RequestMapping("/index")
	public String index(HttpServletRequest request, HttpServletResponse response) {
		return "index";
	}

	@RequestMapping("/menu")
	public String menu() {
		return "menu";
	}

	@RequestMapping("/top")
	public String top() {
		return "top";
	}

	@RequestMapping("/loginpage")
	public String loginpage() {
		return "loginpage";
	}

	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}

}