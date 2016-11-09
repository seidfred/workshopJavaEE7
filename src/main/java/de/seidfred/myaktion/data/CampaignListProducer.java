package de.seidfred.myaktion.data;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import de.seidfred.myaktion.model.Account;
import de.seidfred.myaktion.model.Campaign;
import de.seidfred.myaktion.model.Donation;
import de.seidfred.myaktion.model.enums.DonationStatus;

@Named
@SessionScoped
public class CampaignListProducer implements Serializable {
	private static final long serialVersionUID = 3632900647116673932L;

	private List<Campaign> campaigns;

	public CampaignListProducer() {
		campaigns = createMockCampaigns();
	}

	public List<Campaign> getCampaigns() {
		return campaigns;
	}

	public void setCampaigns(List<Campaign> aCampaigns) {
		campaigns = aCampaigns;
	}

	private List<Campaign> createMockCampaigns() {
		Donation tempDonation1 = new Donation();
		tempDonation1.setDonorName("Heinz Schmidt");
		tempDonation1.setAmount(20d);
		tempDonation1.setReceiptRequested(true);
		tempDonation1.setStatus(DonationStatus.TRANSFERRED);
		tempDonation1.setAccount(new Account(tempDonation1.getDonorName(), "XXX Bank", "DE44876543210000123456"));
		Donation tempDonation2 = new Donation();
		tempDonation2.setDonorName("Karl Meier");
		tempDonation2.setAmount(30d);
		tempDonation2.setReceiptRequested(false);
		tempDonation2.setStatus(DonationStatus.IN_PROCESS);
		tempDonation2.setAccount(new Account(tempDonation2.getDonorName(), "YYY Bank", "DE44864275310000654321"));
		List<Donation> spenden = new LinkedList<>();
		spenden.add(tempDonation1);
		spenden.add(tempDonation2);

		Campaign tempCampaign1 = new Campaign();
		tempCampaign1.setName("Trikots für A-Jugend");
		tempCampaign1.setTargetAmount(1000d);
		tempCampaign1.setAmountDonatedSoFar(258d);
		tempCampaign1.setDonationMinimum(20d);
		tempCampaign1.setId(1L);
		tempCampaign1.setAccount(new Account("Max Mustermann", "ABC Bank", "DE44123456780100200300"));
		tempCampaign1.setDonations(spenden);

		Campaign tempCampaign2 = new Campaign();
		tempCampaign2.setName("Rollstuhl für Maria");
		tempCampaign2.setTargetAmount(2500d);
		tempCampaign2.setAmountDonatedSoFar(742d);
		tempCampaign2.setDonationMinimum(25d);
		tempCampaign2.setId(2L);
		tempCampaign2.setAccount(tempCampaign1.getAccount());
		tempCampaign2.setDonations(spenden);

		List<Campaign> tempReturn = new LinkedList<Campaign>();
		tempReturn.add(tempCampaign1);
		tempReturn.add(tempCampaign2);
		return tempReturn;
	}
}
