package de.seidfred.myaktion.data;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import de.seidfred.myaktion.model.Campaign;

@Named
@SessionScoped
public class CampaignProducer implements Serializable {
	private static final long serialVersionUID = -448459161853366408L;

	private enum Mode {
		EDIT, ADD;
	}

	Campaign campaign;
	Mode mode;

	public Campaign getSelectedCampaign() {
		return campaign;
	}

	public void setSelectedCampaign(Campaign aCampaign) {
		campaign = aCampaign;
	}

	public Boolean isAddMode() {
		return mode == Mode.ADD;
	}

	public void prepareAddCAmpaing() {
		campaign = new Campaign();
		mode = Mode.ADD;
	}

	public void prepareEditCampaign(Campaign aCampaign) {
		campaign = aCampaign;
		mode = Mode.EDIT;
	}
}
