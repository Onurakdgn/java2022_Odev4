package kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "Python"));
		languages.add(new Language(2, "C++"));
		languages.add(new Language(3, "C#"));
		languages.add(new Language(4, "Java"));
		languages.add(new Language(5, "PHP"));
	}

	@Override
	public List<Language> getAll() {
		return languages;
	}

	@Override
	public Language getId(int id) {
		languages.get(id);
		return null;
	}

	@Override
	public void add(Language language) {
		languages.add(language);
	}

	@Override
	public void delete(int id) {
		languages.remove(id);
	}

	@Override
	public void update(Language language) {
		languages.get(language.getId());

	}
}