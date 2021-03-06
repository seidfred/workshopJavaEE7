package de.seidfred.myaktion.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.seidfred.myaktion.data.CampaignProducer;
import de.seidfred.myaktion.model.Campaign;

@Named
@SessionScoped
public class ListCampaignsController implements Serializable {
	private static final long serialVersionUID = 6702028418414064959L;
	private static final Logger LOGGER = LoggerFactory.getLogger(ListCampaignsController.class);

	@Inject
	private CampaignProducer campaignProducer;

	public String doAddCampaing() {
		campaignProducer.prepareAddCAmpaing();

		return Pages.EDIT_CAMPAIGN;
	}

	public String doEditCampaing(Campaign aCampaign) {
		campaignProducer.prepareEditCampaign(aCampaign);
		return Pages.EDIT_CAMPAIGN;
	}

	public String doEditDonationForm(Campaign aCampaign) {
		campaignProducer.setSelectedCampaign(aCampaign);
		return Pages.EDIT_DONATION_FORM;
	}

	public String doListDonations(Campaign aCampaign) {
		campaignProducer.setSelectedCampaign(aCampaign);
		return Pages.LIST_DONATIONS;
	}

	public void doDeleteCampaign(Campaign aCampaign) {
		LOGGER.info("Deletion not implemented yet");
	}

}
