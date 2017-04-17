package com.AitWebPojo;

import java.awt.Image;
import java.sql.Blob;
import java.util.Date;

public class PromotionObj {
	
	private int    promotionID, promotionfrequency,promotiondisplaytimeframe;
	private String promotionSponsorName, promotionSponsoremail, promotionAddress, promotionType,promotionGuestName,promotionHostName, 
				   promotionHostEmail,promotionRating,promotionAgentName, promotionUrl,ratedBy;
	private Blob   promotionDescription;
	private Date   promotionDate;
	private Double promotionCost,promotionDonation,promotionMaintenanceFees;
	private float  promotionDiscounts;
	private Image  promotionPictures, promtionVideo;
	/**
	 * @return the promotionID
	 */
	public int getPromotionID() {
		return promotionID;
	}
	/**
	 * @param promotionID the promotionID to set
	 */
	public void setPromotionID(int promotionID) {
		this.promotionID = promotionID;
	}
	/**
	 * @return the promotionfrequency
	 */
	public int getPromotionfrequency() {
		return promotionfrequency;
	}
	/**
	 * @param promotionfrequency the promotionfrequency to set
	 */
	public void setPromotionfrequency(int promotionfrequency) {
		this.promotionfrequency = promotionfrequency;
	}
	/**
	 * @return the promotiondisplaytimeframe
	 */
	public int getPromotiondisplaytimeframe() {
		return promotiondisplaytimeframe;
	}
	/**
	 * @param promotiondisplaytimeframe the promotiondisplaytimeframe to set
	 */
	public void setPromotiondisplaytimeframe(int promotiondisplaytimeframe) {
		this.promotiondisplaytimeframe = promotiondisplaytimeframe;
	}
	/**
	 * @return the promotionSponsorName
	 */
	public String getPromotionSponsorName() {
		return promotionSponsorName;
	}
	/**
	 * @param promotionSponsorName the promotionSponsorName to set
	 */
	public void setPromotionSponsorName(String promotionSponsorName) {
		this.promotionSponsorName = promotionSponsorName;
	}
	/**
	 * @return the promotionSponsoremail
	 */
	public String getPromotionSponsoremail() {
		return promotionSponsoremail;
	}
	/**
	 * @param promotionSponsoremail the promotionSponsoremail to set
	 */
	public void setPromotionSponsoremail(String promotionSponsoremail) {
		this.promotionSponsoremail = promotionSponsoremail;
	}
	/**
	 * @return the promotionAddress
	 */
	public String getPromotionAddress() {
		return promotionAddress;
	}
	/**
	 * @param promotionAddress the promotionAddress to set
	 */
	public void setPromotionAddress(String promotionAddress) {
		this.promotionAddress = promotionAddress;
	}
	/**
	 * @return the promotionType
	 */
	public String getPromotionType() {
		return promotionType;
	}
	/**
	 * @param promotionType the promotionType to set
	 */
	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}
	/**
	 * @return the promotionGuestName
	 */
	public String getPromotionGuestName() {
		return promotionGuestName;
	}
	/**
	 * @param promotionGuestName the promotionGuestName to set
	 */
	public void setPromotionGuestName(String promotionGuestName) {
		this.promotionGuestName = promotionGuestName;
	}
	/**
	 * @return the promotionHostName
	 */
	public String getPromotionHostName() {
		return promotionHostName;
	}
	/**
	 * @param promotionHostName the promotionHostName to set
	 */
	public void setPromotionHostName(String promotionHostName) {
		this.promotionHostName = promotionHostName;
	}
	/**
	 * @return the promotionHostEmail
	 */
	public String getPromotionHostEmail() {
		return promotionHostEmail;
	}
	/**
	 * @param promotionHostEmail the promotionHostEmail to set
	 */
	public void setPromotionHostEmail(String promotionHostEmail) {
		this.promotionHostEmail = promotionHostEmail;
	}
	/**
	 * @return the promotionRating
	 */
	public String getPromotionRating() {
		return promotionRating;
	}
	/**
	 * @param promotionRating the promotionRating to set
	 */
	public void setPromotionRating(String promotionRating) {
		this.promotionRating = promotionRating;
	}
	/**
	 * @return the promotionAgentName
	 */
	public String getPromotionAgentName() {
		return promotionAgentName;
	}
	/**
	 * @param promotionAgentName the promotionAgentName to set
	 */
	public void setPromotionAgentName(String promotionAgentName) {
		this.promotionAgentName = promotionAgentName;
	}
	/**
	 * @return the promotionUrl
	 */
	public String getPromotionUrl() {
		return promotionUrl;
	}
	/**
	 * @param promotionUrl the promotionUrl to set
	 */
	public void setPromotionUrl(String promotionUrl) {
		this.promotionUrl = promotionUrl;
	}
	/**
	 * @return the ratedBy
	 */
	public String getRatedBy() {
		return ratedBy;
	}
	/**
	 * @param ratedBy the ratedBy to set
	 */
	public void setRatedBy(String ratedBy) {
		this.ratedBy = ratedBy;
	}
	/**
	 * @return the promotionDescription
	 */
	public Blob getPromotionDescription() {
		return promotionDescription;
	}
	/**
	 * @param promotionDescription the promotionDescription to set
	 */
	public void setPromotionDescription(Blob promotionDescription) {
		this.promotionDescription = promotionDescription;
	}
	/**
	 * @return the promotionDate
	 */
	public Date getPromotionDate() {
		return promotionDate;
	}
	/**
	 * @param promotionDate the promotionDate to set
	 */
	public void setPromotionDate(Date promotionDate) {
		this.promotionDate = promotionDate;
	}
	/**
	 * @return the promotionCost
	 */
	public Double getPromotionCost() {
		return promotionCost;
	}
	/**
	 * @param promotionCost the promotionCost to set
	 */
	public void setPromotionCost(Double promotionCost) {
		this.promotionCost = promotionCost;
	}
	/**
	 * @return the promotionDonation
	 */
	public Double getPromotionDonation() {
		return promotionDonation;
	}
	/**
	 * @param promotionDonation the promotionDonation to set
	 */
	public void setPromotionDonation(Double promotionDonation) {
		this.promotionDonation = promotionDonation;
	}
	/**
	 * @return the promotionMaintenanceFees
	 */
	public Double getPromotionMaintenanceFees() {
		return promotionMaintenanceFees;
	}
	/**
	 * @param promotionMaintenanceFees the promotionMaintenanceFees to set
	 */
	public void setPromotionMaintenanceFees(Double promotionMaintenanceFees) {
		this.promotionMaintenanceFees = promotionMaintenanceFees;
	}
	/**
	 * @return the promotionDiscounts
	 */
	public float getPromotionDiscounts() {
		return promotionDiscounts;
	}
	/**
	 * @param promotionDiscounts the promotionDiscounts to set
	 */
	public void setPromotionDiscounts(float promotionDiscounts) {
		this.promotionDiscounts = promotionDiscounts;
	}
	/**
	 * @return the promotionPictures
	 */
	public Image getPromotionPictures() {
		return promotionPictures;
	}
	/**
	 * @param promotionPictures the promotionPictures to set
	 */
	public void setPromotionPictures(Image promotionPictures) {
		this.promotionPictures = promotionPictures;
	}
	/**
	 * @return the promtionVideo
	 */
	public Image getPromtionVideo() {
		return promtionVideo;
	}
	/**
	 * @param promtionVideo the promtionVideo to set
	 */
	public void setPromtionVideo(Image promtionVideo) {
		this.promtionVideo = promtionVideo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PromotionObject [promotionID=" + promotionID
				+ ", promotionfrequency=" + promotionfrequency
				+ ", promotiondisplaytimeframe=" + promotiondisplaytimeframe
				+ ", promotionSponsorName=" + promotionSponsorName
				+ ", promotionSponsoremail=" + promotionSponsoremail
				+ ", promotionAddress=" + promotionAddress + ", promotionType="
				+ promotionType + ", promotionGuestName=" + promotionGuestName
				+ ", promotionHostName=" + promotionHostName
				+ ", promotionHostEmail=" + promotionHostEmail
				+ ", promotionRating=" + promotionRating
				+ ", promotionAgentName=" + promotionAgentName
				+ ", promotionUrl=" + promotionUrl + ", ratedBy=" + ratedBy
				+ ", promotionDescription=" + promotionDescription
				+ ", promotionDate=" + promotionDate + ", promotionCost="
				+ promotionCost + ", promotionDonation=" + promotionDonation
				+ ", promotionMaintenanceFees=" + promotionMaintenanceFees
				+ ", promotionDiscounts=" + promotionDiscounts
				+ ", promotionPictures=" + promotionPictures
				+ ", promtionVideo=" + promtionVideo + "]";
	}
	
	
	
}