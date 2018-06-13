package com.community.controller.account.dto;

import org.broadleafcommerce.profile.web.core.form.RegisterCustomerForm;

public class HCRegisterCustomerForm extends RegisterCustomerForm {

    private String referralCode;

	public String getReferralCode() {
		return referralCode;
	}

	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
	}

   

}