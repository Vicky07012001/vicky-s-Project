package org.mvn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PomProject extends Apple {
	Select sel;

	public PomProject() {
		PageFactory.initElements(driver, this);
	}


	@FindAll({ @FindBy(id = "username"), @FindBy(name = "username") })
	private WebElement search;
	@FindAll({ @FindBy(xpath = "password"), @FindBy(name = "password") })
	private WebElement as;
	@FindAll({ @FindBy(name = "login"), @FindBy(xpath = "login") })
	private WebElement loc;
	@FindAll({ @FindBy(id = "location"), @FindBy(name = "location") })
	private WebElement place;
	@FindAll({ @FindBy(id = "hotels"), @FindBy(name = "login") })
	private WebElement hotel;
	@FindAll({ @FindBy(name = "room_nos"), @FindBy(xpath = "login") })
	private WebElement room;
	@FindAll({ @FindBy(id = "adult_room"), @FindBy(xpath = "login") })
	private WebElement adultroom;
	@FindAll({ @FindBy(id = "Submit"), @FindBy(xpath = "login") })
	private WebElement clickbtn;
	@FindAll({ @FindBy(id = "radiobutton_3"), @FindBy(xpath = "login") })
	private WebElement radiobtn;
	@FindAll({ @FindBy(id = "continue"), @FindBy(xpath = "login") })
	private WebElement cntinue;
	@FindAll({ @FindBy(name = "first_name"), @FindBy(xpath = "login") })
	private WebElement fname;
	@FindAll({ @FindBy(name = "last_name"), @FindBy(xpath = "login") })
	private WebElement lname;
	@FindAll({ @FindBy(name = "address"), @FindBy(xpath = "login") })
	private WebElement address;
	@FindAll({ @FindBy(name = "cc_num"), @FindBy(xpath = "login") })
	private WebElement cnmber;
	@FindAll({ @FindBy(id = "cc_type"), @FindBy(name = "username") })
	private WebElement cctype;
	@FindAll({ @FindBy(id = "cc_exp_month"), @FindBy(name = "password") })
	private WebElement month;
	@FindAll({ @FindBy(id = "cc_exp_year"), @FindBy(xpath = "login") })
	private WebElement year;
	@FindAll({ @FindBy(name = "cc_cvv"), @FindBy(name = "location") })
	private WebElement ccvv;
	@FindAll({ @FindBy(id = "book_now"), @FindBy(name = "login") })
	private WebElement finish;

	public WebElement getSearch() {
		return search;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getAs() {
		return as;
	}

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getPlace() {
		return place;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getClickbtn() {
		return clickbtn;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getCntinue() {
		return cntinue;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCnmber() {
		return cnmber;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCcvv() {
		return ccvv;
	}

	public WebElement getFinish() {
		return finish;
	}

}
