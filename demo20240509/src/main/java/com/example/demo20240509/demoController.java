package com.example.demo20240509;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class demoController {

	@Autowired
	MyService service;
	@Autowired
	PersonRepository personRepository;

	@GetMapping("/")
	public String getIndex(Model model) {

		final String descSp = "Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can \"just run\".";
		final String descMt = "A modern responsive front-end framework based on Material Design";

		model.addAttribute("greeting", "Hello!");
		model.addAttribute("title_Sp", "Spring Boot");
		model.addAttribute("title_Mt", "Materialize");
		model.addAttribute("description_Sp", descSp);
		model.addAttribute("description_Mt", descMt);

		return "/index";
	}

	@GetMapping("/demo")
	public String getDemo() {
		return "demo";
	}

	@GetMapping("/aboutme")
	public String getAbout(Model model) {

		Person p = new Person();
		p.setName("斉藤由宇");
		p.setAge(24);

		model.addAttribute("person", p);

		return "aboutme";

	}

	@GetMapping("/users/{name}")
	public String getUsers(@PathVariable String name, Model model) {
		System.out.println("name=" + name);
		model.addAttribute("message", name + "さん、こんにちは！");
		return "users";
	}

	//getメソッドによる処理の例　送信側
	@GetMapping("/sample_inputForm")
	public String sample_InputForm(Model model) {
		model.addAttribute("title", "入力画面1です。");
		return "sample_inputForm";
	}

	//getメソッドによる処理の例　受信側
	@GetMapping("/sample_result")
	public String sample_result(@RequestParam String paramA, @RequestParam String paramB, @RequestParam String paramC,
			Model model) {

		model.addAttribute("paramA", paramA);
		model.addAttribute("paramB", paramB);
		model.addAttribute("paramC", paramC);
		return "sample_result";
	}

	//getメソッドによる処理の例　送信側
	@GetMapping("/sample_postForm")
	public String sample_postForm(Model model) {
		model.addAttribute("title", "Postメソッド版入力画面です。");
		return "sample_postForm";
	}

	//Postメソッドによる処理の例　送信側
	@PostMapping("/sample_result2")
	public String sample_result(ThreeTextForm form, Model model) {
		System.out.println("paramA : " + form.getParamA());
		System.out.println("paramB : " + form.getParamB());
		System.out.println("paramC : " + form.getParamC());
		model.addAttribute("form", form);

		return "sample_result2";
	}

	@GetMapping("/validation")
	public String validation(Model model) {
		model.addAttribute("title", "入力画面 - Validation Test");
		model.addAttribute("form", new ThreeTextForm_Validated());
		return "validation";
	}

	@PostMapping("/valid_result")
	public String valid_result(@Validated @ModelAttribute("form") ThreeTextForm_Validated form,
			BindingResult bindingResult, Model model) {

		System.out.println("paramA : " + form.getParamA());
		System.out.println("paramB : " + form.getParamB());
		System.out.println("paramC : " + form.getParamC());

		if (bindingResult.hasErrors()) {
			model.addAttribute("title", "Validation Testの再入力です。");
			model.addAttribute("form", form);
			return "validation";
		}

		model.addAttribute("form", form);

		return "valid_result";

	}

	@GetMapping("/myvalidation")
	public String myvalidation(Model model) {
		model.addAttribute("title", "入力画面 - Validation Test");
		model.addAttribute("myValidation", new MyValidation());
		return "myvalidation";
	}

	@PostMapping("/myvalid_result")
	public String myvalid_result(@Validated MyValidation myValidation, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("title", "正しく入力してください。");
			model.addAttribute("myValidation", myValidation);
			return "myvalidation";
		}
		model.addAttribute("myValidation", myValidation);
		return "myvalid_result";

	}

	@GetMapping("/person_list")
	public String personList(Model model) {

		//PersonRipositoryの依存性注入ver
		model.addAttribute("people", service.getPersonByFindAll());

		return "person_list";

	}

	@GetMapping("/database")
	public String database(Model model) {

		//PersonRipositoryを直接依存性注入
		//		model.addAttribute("people",personRepository.findAll());

		//MySerVice内にPersonRepの依存性注入→メソッド呼び出し
		model.addAttribute("people", service.getPersonByFindAll());

		return "database";
	}

	@PostMapping("/database")
	public String databaseSearched(@RequestParam(value="name", required=false) String name,
			@RequestParam(value="address", required=false) String address,
			@RequestParam(value="age", required=false) String age,
			@RequestParam(value="id", required=false) String id,
			Model model) {
		
		model.addAttribute("people", service.getPersonByAnyOption(name,address,age,id));
				
		return "database";
	}

}
