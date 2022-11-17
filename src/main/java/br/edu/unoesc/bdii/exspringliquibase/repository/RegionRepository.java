package br.edu.unoesc.bdii.exspringliquibase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoesc.bdii.exspringliquibase.domain.Region;

import java.util.Optional;

public interface RegionRepository extends JpaRepository<Region, Long>
{
    Optional<Region> findByNameLike(String name);
}
