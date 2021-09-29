package com.michaelm.languages.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.michaelm.languages.models.Language;
import com.michaelm.languages.services.LanguageService;

@Controller
public class languageController {
	private final LanguageService lService;
	public languageController(LanguageService service) {
		 this.lService = service;
	}
	@GetMapping("/")
	public String index(Model model, @ModelAttribute("Language")Language language) {
		model.addAttribute("allLanguages", this.lService.allLanguages());
		return "index.jsp";
	}
	@PostMapping("/")
	public String addLanguage(@Valid @ModelAttribute("language") Language language, BindingResult res, Model model) {
		if (res.hasErrors()) {
			model.addAttribute("allLanguages", this.lService.allLanguages());
			return "index.jsp";
		}
		return "redirect:/";
	}
	@GetMapping("/show/{id}")
	public String showLang(Model model, @PathVariable("id") Long id) {
		model.addAttribute("thisLang", this.lService.findOneLanguage(id));
		return "show.jsp";
	}
	@GetMapping("/show/{id}")
	public String editLang(Model model, @PathVariable("id") Long id) {
		model.addAttribute("Language", this.lService.findOneLanguage(id));
		return "edit.jsp";
	}
	@PutMapping("/edit/{id}")
	public String editLang(@Valid, @ModelAttribute("language")Language lang, BindingResult result, Model model, @PathVariable("id") Long id) {
		if(result.hasErrors()) {
			model.addAttribute("language", this.lService.findOneLanguage(id));
			return "edit.jsp"
				}
		this.lService.updateLanguage(lang);
		return "redirect:/show/{id}";
	}
	@DeleteMapping("/delete/{id}")
	public String deleteLang(@PathVariable("id")) {
		this.lService.deleteLanguage(id);
	}

