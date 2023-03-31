package kodlama.io.SoftwareLanguage.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.SoftwareLanguage.dataAccess.abstracts.LanguagesRepository;
import kodlama.io.SoftwareLanguage.enities.SoftwareLanguages;

@Repository
public class InMemoryRepository implements LanguagesRepository {
	private List<SoftwareLanguages> languages;
	
	public InMemoryRepository() {
		languages=new ArrayList<SoftwareLanguages>();
		languages.add(new SoftwareLanguages(1,"C"));
		languages.add(new SoftwareLanguages(2,"C++"));
		languages.add(new SoftwareLanguages(3,"C#"));
		languages.add(new SoftwareLanguages(4,"Java"));
		languages.add(new SoftwareLanguages(5,"Python"));

		
	}
	

	@Override
	public List<SoftwareLanguages> getAll() {
		
		return languages;
	}

	@Override
	public void create(SoftwareLanguages language) {
		languages.add(language);
		
	}

	@Override
	public void update(SoftwareLanguages language) {
		languages.set(language.getId(), language);
		
	}

	@Override
	public void delete(SoftwareLanguages language) {
		languages.remove(language.getId());
		
	}

	@Override
	public SoftwareLanguages getById(int id) {
		// TODO Auto-generated method stub
		return languages.get(id);
	}

}
