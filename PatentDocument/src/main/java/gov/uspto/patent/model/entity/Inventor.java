package gov.uspto.patent.model.entity;

import gov.uspto.patent.model.CountryCode;

public class Inventor extends Entity {

	private String sequence;
	private CountryCode residency;
	private CountryCode nationality;

	public Inventor(Name name, Address address) {
		super(EntityType.INVENTOR, name, address);
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public CountryCode getNationality() {
		return nationality;
	}

	public void setNationality(CountryCode nationality) {
		this.nationality = nationality;
	}

	public CountryCode getResidency() {
		return residency;
	}

	public void setResidency(CountryCode residency) {
		this.residency = residency;
	}

	public Boolean validate() {
		return null;
	}

	@Override
	public String toString() {
		return "Inventor[ name=" + getName() + ", sequence=" + sequence + ", address=" + getAddress() + ", residency="
				+ residency + ", nationality=" + nationality + "]";
	}
}
