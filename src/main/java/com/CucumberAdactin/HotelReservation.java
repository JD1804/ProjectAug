package com.CucumberAdactin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HotelReservation {
	public static WebDriver driver;
	public HotelReservation(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
	}
	public WebElement getFname() {
		return fname;
	}
	public void setFname(WebElement fname) {
		this.fname = fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public void setLname(WebElement lname) {
		this.lname = lname;
	}
	public WebElement getAddress() {
		return address;
	}
	public void setAddress(WebElement address) {
		this.address = address;
	}
	public WebElement getCredit() {
		return credit;
	}
	public void setCredit(WebElement credit) {
		this.credit = credit;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public void setCardtype(WebElement cardtype) {
		this.cardtype = cardtype;
	}
	public WebElement getCmonth() {
		return cmonth;
	}
	public void setCmonth(WebElement cmonth) {
		this.cmonth = cmonth;
	}
	public WebElement getCyear() {
		return cyear;
	}
	public void setCyear(WebElement cyear) {
		this.cyear = cyear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public void setCvv(WebElement cvv) {
		this.cvv = cvv;
	}
	public WebElement getBook() {
		return book;
	}
	public void setBook(WebElement book) {
		this.book = book;
	}
	public WebElement getLogout() {
		return logout;
	}
	public void setLogout(WebElement logout) {
		this.logout = logout;
	}
	public WebElement getClickhere() {
		return clickhere;
	}
	public void setClickhere(WebElement clickhere) {
		this.clickhere = clickhere;
	}
	@FindBy(id="first_name")
	private WebElement fname;
	
	@FindBy(id="last_name")
	private WebElement lname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement credit;
	
	@FindBy(id="cc_type")
	private WebElement cardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement cmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement cyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement book;
	
	@FindBy(xpath="//input[@value='Logout']")
	private WebElement logout;
	
	@FindBy(xpath="//a[@href='index.php']")
	private WebElement clickhere;
}



