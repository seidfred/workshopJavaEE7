package de.seidfred.myaktion.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.seidfred.myaktion.model.Campaign;

@Named
@SessionScoped
public class ListCampaignsController implements Serializable {
	private static final long serialVersionUID = 6702028418414064959L;
	private static final Logger LOGGER = LoggerFactory.getLogger(ListCampaignsController.class);

	public String doAddCampaing() {
		LOGGER.debug("Add Campaign");
		return Pages.EDIT_CAMPAIGN;
	}

	public String doEditCampaing(Campaign aCampaign) {
		LOGGER.debug("Edit Campaign " + aCampaign);
		return Pages.EDIT_CAMPAIGN;
	}

	public String doEditDonationForm(Campaign aCampaign) {
		LOGGER.debug("Edit Donation Form of Campaign " + aCampaign);
		return Pages.EDIT_DONATION_FORM;
	}

	public String doListDonations(Campaign aCampaign) {
		LOGGER.debug("List Donations of campaign " + aCampaign);
		return Pages.LIST_DONATIONS;
	}

	public void doDeleteCampaign(Campaign aCampaign) {
		LOGGER.debug("Deletion not implemented yet");
	}

}
