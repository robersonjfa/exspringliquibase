package br.edu.unoesc.bdii.exspringliquibase.domain;

import java.util.stream.Stream;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class EmploymentTypeConverter implements AttributeConverter<EmploymentType, String> {
	@Override
	public String convertToDatabaseColumn(EmploymentType employmentType) {
		return employmentType == null ? null : employmentType.getLabel();
	}

	@Override
	public EmploymentType convertToEntityAttribute(String label) {
		return label == null ? null
				: Stream.of(EmploymentType.values()).filter(c -> c.getLabel().equals(label)).findFirst()
						.orElseThrow(IllegalArgumentException::new);
	}
}
