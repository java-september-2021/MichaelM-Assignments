package com.michaelm.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.michaelm.languages.models.Language;
import com.michaelm.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository lRepo;
	
	public LanguageService(LanguageRepository repo) {
		this.lRepo = repo;
	}
	//List all Languages
	public List<Language> allLanguages(){
		return this.lRepo.findall();
	}
	//List one Language
	public Language findOneLanguage(Long id){
		return this.lRepo.findById(id).orElse(null);
	}
	//Make New Language
	public Language createLanguage(Language newLang) {
		return this.lRepo.save(newLang);
	}
	public Language updateLanguage(Language updateLang) {
		return this.lRepo.save(updateLang);
	}
	//delete
	public void deletLanguage(Long id) {
		this.lRepo.deleteById(id);
	}
}
