package de.seidfred.myaktion.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import de.seidfred.myaktion.data.CampaignListProducer;
import de.seidfred.myaktion.data.CampaignProducer;

@Named
@SessionScoped
public class EditCampaignController implements Serializable {
	private static final long serialVersionUID = -5930313930579298819L;

	@Inject
	CampaignListProducer campaignListProducer;

	@Inject
	CampaignProducer campaignProducer;

	public String doSave() {
		if (campaignProducer.isAddMode()) {
			campaignListProducer.getCampaigns().add(campaignProducer.getSelectedCampaign());
		}
		return Pages.LIST_CAMPAIGNS;
	}

	public String doCancel() {
		return Pages.LIST_CAMPAIGNS;
	}
}
