package com.AitWebPojo;

public class Donation {

	private String donorName, donorEmail, donorPhoneNumber, donationType, paymentType;
	private double donationAmount,totalDonation;
	private char Confirmation;
	/**
	 * @return the donorName
	 */
	public String getDonorName() {
		return donorName;
	}
	/**
	 * @param donorName the donorName to set
	 */
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	/**
	 * @return the donorEmail
	 */
	public String getDonorEmail() {
		return donorEmail;
	}
	/**
	 * @param donorEmail the donorEmail to set
	 */
	public void setDonorEmail(String donorEmail) {
		this.donorEmail = donorEmail;
	}
	/**
	 * @return the donorPhoneNumber
	 */
	public String getDonorPhoneNumber() {
		return donorPhoneNumber;
	}
	/**
	 * @param donorPhoneNumber the donorPhoneNumber to set
	 */
	public void setDonorPhoneNumber(String donorPhoneNumber) {
		this.donorPhoneNumber = donorPhoneNumber;
	}
	/**
	 * @return the donationType
	 */
	public String getDonationType() {
		return donationType;
	}
	/**
	 * @param donationType the donationType to set
	 */
	public void setDonationType(String donationType) {
		this.donationType = donationType;
	}
	/**
	 * @return the paymentType
	 */
	public String getPaymentType() {
		return paymentType;
	}
	/**
	 * @param paymentType the paymentType to set
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	/**
	 * @return the donationAmount
	 */
	public double getDonationAmount() {
		return donationAmount;
	}
	/**
	 * @param donationAmount the donationAmount to set
	 */
	public void setDonationAmount(double donationAmount) {
		this.donationAmount = donationAmount;
	}
	/**
	 * @return the totalDonation
	 */
	public double getTotalDonation() {
		return totalDonation;
	}
	/**
	 * @param totalDonation the totalDonation to set
	 */
	public void setTotalDonation(double totalDonation) {
		this.totalDonation = totalDonation;
	}
	/**
	 * @return the confirmation
	 */
	public char getConfirmation() {
		return Confirmation;
	}
	/**
	 * @param confirmation the confirmation to set
	 */
	public void setConfirmation(char confirmation) {
		Confirmation = confirmation;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DonationObject [donorName=" + donorName + ", donorEmail="
				+ donorEmail + ", donorPhoneNumber=" + donorPhoneNumber
				+ ", donationType=" + donationType + ", paymentType="
				+ paymentType + ", donationAmount=" + donationAmount
				+ ", totalDonation=" + totalDonation + ", Confirmation="
				+ Confirmation + "]";
	}
	
	
	
	
	
}
