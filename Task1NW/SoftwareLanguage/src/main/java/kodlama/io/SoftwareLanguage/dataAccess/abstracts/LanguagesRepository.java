package kodlama.io.SoftwareLanguage.dataAccess.abstracts;

import java.util.List;

import kodlama.io.SoftwareLanguage.enities.SoftwareLanguages;

public interface LanguagesRepository {
	List<SoftwareLanguages> getAll();
	void create(SoftwareLanguages language);
	void update(SoftwareLanguages language);
	void delete(SoftwareLanguages language);
	SoftwareLanguages getById(int id);
}
