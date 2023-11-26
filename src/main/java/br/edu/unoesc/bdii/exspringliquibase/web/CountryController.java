package br.edu.unoesc.bdii.exspringliquibase.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unoesc.bdii.exspringliquibase.domain.Country;
import br.edu.unoesc.bdii.exspringliquibase.domain.Region;
import br.edu.unoesc.bdii.exspringliquibase.repository.CountryRepository;
import br.edu.unoesc.bdii.exspringliquibase.repository.RegionRepository;

@RestController
@RequestMapping("/api/v1/country")
public class CountryController {
	@Autowired
	private CountryRepository countryRepository;
	
	@Autowired
	private RegionRepository regionRepository;
//
//	public CountryController(CountryRepository countryRepository) {
//		this.countryRepository = countryRepository;
//	}

	@GetMapping(path = "/list")
	public List<Country> findAllCountries() {
		return countryRepository.findAll();
	}

	@GetMapping(path = "/create")
	public Country createCountry() {
		Country country = new Country();
		country.setCode("USD");
		country.setIsoCode("USD");
		country.setName("United States Dollar");

		return countryRepository.saveAndFlush(country);
	}

	@PostMapping(path = "/save")
	public Long createCountry(Country country) {
		Country c = countryRepository.saveAndFlush(country);
		return c.getId();
	}
	
	@GetMapping(path = "/region")
	public void createRegion() {
		Region r = new Region();
		r.setName("teste");
		
		List<Country> countries = new ArrayList<Country>();
		Country c1 = new Country();
		c1.setCode("C1");
		c1.setIsoCode("C1");
		c1.setName("C1");
		//c1.setRegion(r);
		
		Country c2 = new Country();
		c2.setCode("C2");
		c2.setIsoCode("C2");
		c2.setName("C2");
		//c2.setRegion(r);
		
		countries.add(c1);
		countries.add(c2);
		
		countries.forEach(c -> c.setRegion(r));
		
		r.setCountries(countries);
		
		regionRepository.saveAndFlush(r);
		
	}
}