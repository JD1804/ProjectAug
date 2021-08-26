package com.CucumberAdactin;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ReservationDetails {	
	
public static WebDriver driver;
	public ReservationDetails(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getLocation() {
		return location;
	}
	public void setLocation(WebElement location) {
		this.location = location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public void setHotels(WebElement hotels) {
		this.hotels = hotels;
	}
	public WebElement getRoom() {
		return room;
	}
	public void setRoom(WebElement room) {
		this.room = room;
	}
	public WebElement getNos() {
		return nos;
	}
	public void setNos(WebElement nos) {
		this.nos = nos;
	}
	public WebElement getCheckin() {
		return checkin;
	}
	public void setCheckin(WebElement checkin) {
		this.checkin = checkin;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public void setCheckout(WebElement checkout) {
		this.checkout = checkout;
	}
	public WebElement getAdult() {
		return adult;
	}
	public void setAdult(WebElement adult) {
		this.adult = adult;
	}
	public WebElement getChild() {
		return child;
	}
	public void setChild(WebElement child) {
		this.child = child;
	}
	public WebElement getSearch() {
		return search;
	}
	public void setSearch(WebElement search) {
		this.search = search;
	}
	public WebElement getAccept() {
		return accept;
	}
	public void setAccept(WebElement accept) {
		this.accept = accept;
	}
	public WebElement getCont() {
		return cont;
	}
	public void setCont(WebElement cont) {
		this.cont = cont;
	}
	@FindBy(id="location")
	private WebElement location;

	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement room;
	
	@FindBy(id="room_nos")
	private WebElement nos;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement checkin;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement checkout;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adult;
	
	@FindBy(id="child_room")
	private WebElement child;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement search;

	@FindBy(xpath="//input[@type='radio']")	
	private WebElement accept;

	@FindBy(xpath="//input[@value='Continue']")
	private WebElement cont;
	}
