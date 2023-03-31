package kodlama.io.SoftwareLanguage.business.abstracts;

import java.util.List;

import kodlama.io.SoftwareLanguage.enities.SoftwareLanguages;

public interface LanguageService {
	List<SoftwareLanguages> getAll();
	void create(SoftwareLanguages language) throws Exception;
	void update(SoftwareLanguages language) throws Exception;
	void delete(SoftwareLanguages language);
	SoftwareLanguages getById(int id);
}
