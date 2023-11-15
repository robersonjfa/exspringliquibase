package br.edu.unoesc.bdii.exspringliquibase.domain;

public enum EmploymentType {
	CONTRACTOR("contractor"), EMPLOYEE("employee");

	private final String label;

	EmploymentType(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}