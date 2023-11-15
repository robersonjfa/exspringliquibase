package br.edu.unoesc.bdii.exspringliquibase.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoesc.bdii.exspringliquibase.domain.Region;

public interface RegionRepository extends JpaRepository<Region, Long> {
	Optional<Region> findByNameLike(String name);
}
