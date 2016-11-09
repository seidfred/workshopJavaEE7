package de.seidfred.myaktion.model;

import java.util.List;

public class Campaign {

	private String name;
	private Double targetAmount;
	private Double donationMinimum;
	private Double amountDonatedSoFar;
	private Account account;
	private Long id;
	private List<Donation> donations;

	public Campaign() {
		setAccount(new Account());
	}

	public String getName() {
		return name;
	}

	public void setName(String aName) {
		name = aName;
	}

	public Double getTargetAmount() {
		return targetAmount;
	}

	public void setTargetAmount(Double aTargetAmount) {
		targetAmount = aTargetAmount;
	}

	public Double getDonationMinimum() {
		return donationMinimum;
	}

	public void setDonationMinimum(Double aDonationMinimum) {
		donationMinimum = aDonationMinimum;
	}

	public Double getAmountDonatedSoFar() {
		return amountDonatedSoFar;
	}

	public void setAmountDonatedSoFar(Double aAmountDonatedSoFar) {
		amountDonatedSoFar = aAmountDonatedSoFar;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account aAccount) {
		account = aAccount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long aId) {
		id = aId;
	}

	public List<Donation> getDonations() {
		return donations;
	}

	public void setDonations(List<Donation> aDonations) {
		donations = aDonations;
	}

	@Override
	public String toString() {
		return "Campaign [name=" + name + ", targetAmount=" + targetAmount + ", donationMinimum=" + donationMinimum
				+ ", amountDonatedSoFar=" + amountDonatedSoFar + ", account=" + account + ", id=" + id + ", donations="
				+ donations + "]";
	}

}
