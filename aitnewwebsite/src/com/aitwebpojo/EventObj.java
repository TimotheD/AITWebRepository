package com.AitWebPojo;

import java.awt.Image;
import java.util.Date;

public class EventObj {

	private String eventOwner, eventHostName, eventHostEmail, location, address, eventSponsor, ratingGivenBy, eventUrl;
	
	private Date   eventDate;
	private int galleryID;
	private String eventType;
	private int eventSequence, eventRating;
	private String eventGuestEmail;
	private double eventCost, eventattendanceFees;
	private double eventDonation;
	private Date eventNotificationFrequency;
	private Image  eventPictures, eventVideo;
	/**
	 * @return the eventOwner
	 */
	public String getEventOwner() {
		return eventOwner;
	}
	/**
	 * @param eventOwner the eventOwner to set
	 */
	public void setEventOwner(String eventOwner) {
		this.eventOwner = eventOwner;
	}
	/**
	 * @return the eventHostName
	 */
	public String getEventHostName() {
		return eventHostName;
	}
	/**
	 * @param eventHostName the eventHostName to set
	 */
	public void setEventHostName(String eventHostName) {
		this.eventHostName = eventHostName;
	}
	/**
	 * @return the eventHostEmail
	 */
	public String getEventHostEmail() {
		return eventHostEmail;
	}
	/**
	 * @param eventHostEmail the eventHostEmail to set
	 */
	public void setEventHostEmail(String eventHostEmail) {
		this.eventHostEmail = eventHostEmail;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the eventSponsor
	 */
	public String getEventSponsor() {
		return eventSponsor;
	}
	/**
	 * @param eventSponsor the eventSponsor to set
	 */
	public void setEventSponsor(String eventSponsor) {
		this.eventSponsor = eventSponsor;
	}
	/**
	 * @return the ratingGivenBy
	 */
	public String getRatingGivenBy() {
		return ratingGivenBy;
	}
	/**
	 * @param ratingGivenBy the ratingGivenBy to set
	 */
	public void setRatingGivenBy(String ratingGivenBy) {
		this.ratingGivenBy = ratingGivenBy;
	}
	/**
	 * @return the eventUrl
	 */
	public String getEventUrl() {
		return eventUrl;
	}
	/**
	 * @param eventUrl the eventUrl to set
	 */
	public void setEventUrl(String eventUrl) {
		this.eventUrl = eventUrl;
	}
	/**
	 * @return the eventDate
	 */
	public Date getEventDate() {
		return eventDate;
	}
	/**
	 * @param eventDate the eventDate to set
	 */
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	/**
	 * @return the galleryID
	 */
	public int getGalleryID() {
		return galleryID;
	}
	/**
	 * @param galleryID the galleryID to set
	 */
	public void setGalleryID(int galleryID) {
		this.galleryID = galleryID;
	}
	/**
	 * @return the eventType
	 */
	public String getEventType() {
		return eventType;
	}
	/**
	 * @param eventType the eventType to set
	 */
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	/**
	 * @return the eventSequence
	 */
	public int getEventSequence() {
		return eventSequence;
	}
	/**
	 * @param eventSequence the eventSequence to set
	 */
	public void setEventSequence(int eventSequence) {
		this.eventSequence = eventSequence;
	}
	/**
	 * @return the eventRating
	 */
	public int getEventRating() {
		return eventRating;
	}
	/**
	 * @param eventRating the eventRating to set
	 */
	public void setEventRating(int eventRating) {
		this.eventRating = eventRating;
	}
	/**
	 * @return the eventGuestEmail
	 */
	public String getEventGuestEmail() {
		return eventGuestEmail;
	}
	/**
	 * @param eventGuestEmail the eventGuestEmail to set
	 */
	public void setEventGuestEmail(String eventGuestEmail) {
		this.eventGuestEmail = eventGuestEmail;
	}
	/**
	 * @return the eventCost
	 */
	public double getEventCost() {
		return eventCost;
	}
	/**
	 * @param eventCost the eventCost to set
	 */
	public void setEventCost(double eventCost) {
		this.eventCost = eventCost;
	}
	/**
	 * @return the eventattendanceFees
	 */
	public double getEventattendanceFees() {
		return eventattendanceFees;
	}
	/**
	 * @param eventattendanceFees the eventattendanceFees to set
	 */
	public void setEventattendanceFees(double eventattendanceFees) {
		this.eventattendanceFees = eventattendanceFees;
	}
	/**
	 * @return the eventDonation
	 */
	public double getEventDonation() {
		return eventDonation;
	}
	/**
	 * @param eventDonation the eventDonation to set
	 */
	public void setEventDonation(double eventDonation) {
		this.eventDonation = eventDonation;
	}
	/**
	 * @return the eventNotificationFrequency
	 */
	public Date getEventNotificationFrequency() {
		return eventNotificationFrequency;
	}
	/**
	 * @param eventNotificationFrequency the eventNotificationFrequency to set
	 */
	public void setEventNotificationFrequency(Date eventNotificationFrequency) {
		this.eventNotificationFrequency = eventNotificationFrequency;
	}
	/**
	 * @return the eventPictures
	 */
	public Image getEventPictures() {
		return eventPictures;
	}
	/**
	 * @param eventPictures the eventPictures to set
	 */
	public void setEventPictures(Image eventPictures) {
		this.eventPictures = eventPictures;
	}
	/**
	 * @return the eventVideo
	 */
	public Image getEventVideo() {
		return eventVideo;
	}
	/**
	 * @param eventVideo the eventVideo to set
	 */
	public void setEventVideo(Image eventVideo) {
		this.eventVideo = eventVideo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EventObject [eventOwner=" + eventOwner + ", eventHostName="
				+ eventHostName + ", eventHostEmail=" + eventHostEmail
				+ ", location=" + location + ", address=" + address
				+ ", eventSponsor=" + eventSponsor + ", ratingGivenBy="
				+ ratingGivenBy + ", eventUrl=" + eventUrl + ", eventDate="
				+ eventDate + ", galleryID=" + galleryID + ", eventType="
				+ eventType + ", eventSequence=" + eventSequence
				+ ", eventRating=" + eventRating + ", eventGuestEmail="
				+ eventGuestEmail + ", eventCost=" + eventCost
				+ ", eventattendanceFees=" + eventattendanceFees
				+ ", eventDonation=" + eventDonation
				+ ", eventNotificationFrequency=" + eventNotificationFrequency
				+ ", eventPictures=" + eventPictures + ", eventVideo="
				+ eventVideo + "]";
	}
 
	
	

}
