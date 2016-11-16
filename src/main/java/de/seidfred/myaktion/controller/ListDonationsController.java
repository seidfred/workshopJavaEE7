package de.seidfred.myaktion.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class ListDonationsController implements Serializable {
	private static final long serialVersionUID = -8636294730188010048L;

	public String doOk() {
		return Pages.LIST_CAMPAIGNS;
	}

}
