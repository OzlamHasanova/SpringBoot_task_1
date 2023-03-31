package kodlama.io.SoftwareLanguage.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.SoftwareLanguage.business.abstracts.LanguageService;
import kodlama.io.SoftwareLanguage.dataAccess.abstracts.LanguagesRepository;
import kodlama.io.SoftwareLanguage.enities.SoftwareLanguages;

@Service
public class LanguageManager implements LanguageService{
	private LanguagesRepository repository;
	
	@Autowired
	public LanguageManager(LanguagesRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<SoftwareLanguages> getAll() {
		// TODO Auto-generated method stub
		return repository.getAll();
	}

	@Override
	public void create(SoftwareLanguages language) throws Exception {
		List<SoftwareLanguages> livingLanguages;
		livingLanguages=repository.getAll();
		
		for(SoftwareLanguages newlanguage:livingLanguages) {
			if(newlanguage.getName().equalsIgnoreCase(language.getName())) {
				throw new Exception("If you don't mind, write a name that is not received in the system");
				
			}
			if(language.getName().isEmpty()) {
				throw new Exception("Software language should not be left empty");
			}
		}
		repository.create(language);
	}

	@Override
	public void update(SoftwareLanguages language) throws Exception {
		if(language.getName().isEmpty()) {
			throw new Exception("Software language should not be left empty");
			
		}
		repository.update(language);
	}

	@Override
	public void delete(SoftwareLanguages language) {
		// TODO Auto-generated method stub
		repository.delete(language);
	}

	@Override
	public SoftwareLanguages getById(int id) {
		// TODO Auto-generated method stub
		return repository.getById(id-1);
	}

}
