package de.seidfred.myaktion.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

import de.seidfred.myaktion.data.CampaignProducer;

@Named
@SessionScoped
public class EditDonationFormController implements Serializable {
	private static final long serialVersionUID = 235759363221732644L;

	private String textColor = "000000";
	private String bgColor = "ffffff";

	@Inject
	private CampaignProducer campaignProducer;

	private List<SelectItem> selectOneColors;

	public String doOk() {
		return Pages.LIST_CAMPAIGNS;
	}

	public String getUrl() {
		return getAppUrl() + "/pages/" + Pages.DONATE_MONEY + ".jsf" + "?bgColor=" + getBgColor() + "&textColor="
				+ getTextColor() + "&campaignId=" + campaignProducer.getSelectedCampaign().getId().toString();
	}

	public String getTextColor() {
		return textColor;
	}

	public void setTextColor(String aTextColor) {
		textColor = aTextColor;
	}

	public String getBgColor() {
		return bgColor;
	}

	public void setBgColor(String aBgColor) {
		bgColor = aBgColor;
	}

	public List<SelectItem> getSelectOneColors() {
		if (selectOneColors == null) {
			selectOneColors = new ArrayList<SelectItem>();

			SelectItem temp = new SelectItem();
			temp.setLabel("#FFFFFF");
			temp.setValue("FFFFFF");

			selectOneColors.add(temp);

			temp = new SelectItem();
			temp.setLabel("#000000");
			temp.setValue("000000");

			selectOneColors.add(temp);

			temp = new SelectItem();
			temp.setLabel("#FF0000");
			temp.setValue("FF0000");

			selectOneColors.add(temp);
		}
		return selectOneColors;
	}

	private String getAppUrl() {
		HttpServletRequest tempRequest = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
				.getRequest();
		String tempScheme = tempRequest.getScheme();
		String tempServerName = tempRequest.getServerName();
		Integer tempServerPort = tempRequest.getServerPort();
		String tempContextPath = tempRequest.getContextPath();

		return tempScheme + "://" + tempServerName + ":" + tempServerPort + tempContextPath;
	}
}
