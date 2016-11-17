package de.seidfred.myaktion.controller;

import java.io.Serializable;
import java.util.ResourceBundle;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import de.seidfred.myaktion.model.Donation;

@Named
@SessionScoped
public class DonateMoneyController implements Serializable {
	private static final long serialVersionUID = -7667482575583870404L;

	private String textColor = "000000";
	private String bgColor = "ffffff";
	private Long campaignId;
	private Donation donation;

	public DonateMoneyController() {
		donation = new Donation();
	}

	public String doDonation() {
		final FacesContext tempFacesContext = FacesContext.getCurrentInstance();
		final ResourceBundle tempResourceBundle = tempFacesContext.getApplication().getResourceBundle(tempFacesContext,
				"msg");
		final String tempMsg = tempResourceBundle.getString("donateMoney.thank_you");
		tempFacesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, tempMsg, null));
		donation = new Donation();
		return Pages.DONATE_MONEY;
	}

	public Long getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(Long aCampaignId) {
		campaignId = aCampaignId;
	}

	public Donation getDonation() {
		return donation;
	}

	public void setDonation(Donation aDonation) {
		donation = aDonation;
	}

	public String getTextColor() {
		return textColor;
	}

	public void setTextColor(String textColor) {
		this.textColor = textColor;
	}

	public String getBgColor() {
		return bgColor;
	}

	public void setBgColor(String aBgColor) {
		bgColor = aBgColor;
	}

}
