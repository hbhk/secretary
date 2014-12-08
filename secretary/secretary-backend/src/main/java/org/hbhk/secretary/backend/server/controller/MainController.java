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

	@RequestMapping("/getRandcode")
	public void getRandcode(HttpServletRequest request,
			HttpServletResponse response) {
		RandomValidateCodeUtil.getRandcode(request, response,
				SecretaryConstans.VALIDATECODEKEY);
	}

	@RequestMapping("/index")
	public String index(HttpServletRequest request, HttpServletResponse response) {
		return "index";

	}
}