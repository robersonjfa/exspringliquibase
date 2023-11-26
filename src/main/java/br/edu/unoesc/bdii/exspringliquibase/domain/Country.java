package br.edu.unoesc.bdii.exspringliquibase.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "country")
@Data
// Getter, Setter, ToString, Construtores, Equals
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String code;

	@Column(name = "iso_code")
	private String isoCode;

	@Column(name = "iso_code_test")
	private String isoCodeTest;

	// Define uma FK
	@ManyToOne
	@JoinColumn(name = "region_id", updatable = true
	)
	private Region region;
}
