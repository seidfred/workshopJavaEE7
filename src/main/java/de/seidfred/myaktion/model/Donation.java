package de.seidfred.myaktion.model;

import de.seidfred.myaktion.model.enums.DonationStatus;

public class Donation {

	private Double amount;
	private String donorName;
	private Boolean receiptRequested;
	private DonationStatus status;
	private Account account;

	public Donation() {
		setAccount(new Account());
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double aAmount) {
		amount = aAmount;
	}

	public String getDonorName() {
		return donorName;
	}

	public void setDonorName(String aDonorName) {
		donorName = aDonorName;
	}

	public Boolean getReceiptRequested() {
		return receiptRequested;
	}

	public void setReceiptRequested(Boolean aReceiptRequested) {
		receiptRequested = aReceiptRequested;
	}

	public DonationStatus getStatus() {
		return status;
	}

	public void setStatus(DonationStatus aStatus) {
		status = aStatus;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account aAccount) {
		account = aAccount;
	}

}
