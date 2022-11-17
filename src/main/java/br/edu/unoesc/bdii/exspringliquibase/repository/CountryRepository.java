package br.edu.unoesc.bdii.exspringliquibase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoesc.bdii.exspringliquibase.domain.Country;

// Reduziu o DAO a isso(só tem a interface)
// IOC - DI
// Singleton
public interface CountryRepository extends JpaRepository<Country, Long>
{
}
