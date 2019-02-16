package br.eti.cvm.l10n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping({ "", "/", "/index.html" })
	public String gotoIndexPage() {
		return "index";
	}
}
