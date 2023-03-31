package kodlama.io.SoftwareLanguage.webApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.SoftwareLanguage.business.abstracts.LanguageService;
import kodlama.io.SoftwareLanguage.enities.SoftwareLanguages;

@RestController
@RequestMapping("/api")
public class SoftwareLanguagesController {
	private LanguageService languagesService;
	
	@Autowired
	public SoftwareLanguagesController(LanguageService languagesService) {
		super();
		this.languagesService = languagesService;
	}
	
	@GetMapping("/getall")
	public List<SoftwareLanguages> getAll() {
		
		return languagesService.getAll();
	}

	@PostMapping("/create")
	public void create(@RequestBody SoftwareLanguages language) throws Exception {
		languagesService.create(language);
		
	}

	@PostMapping("/update")
	public void update(@RequestBody SoftwareLanguages language) throws Exception{
		languagesService.update(language);
		
	}

	@PostMapping("/delete")
	public void delete(@RequestBody SoftwareLanguages language) {
		languagesService.delete(language);
		
	}

	@GetMapping("/languages{id}")
	public SoftwareLanguages getById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return languagesService.getById(id);
	}
	
}
