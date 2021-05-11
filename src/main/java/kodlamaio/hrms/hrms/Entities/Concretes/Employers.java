package kodlamaio.hrms.hrms.Entities.Concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employers")
public class Employers {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_address")
	private String webAddress;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="is_activated")
	private boolean isActivated;
	
	public Employers() {
		
	}
	
	public Employers(int id, String companyName, String webAddress, String phoneNumber, boolean isActivated) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.webAddress = webAddress;
		this.phoneNumber = phoneNumber;
		this.isActivated = isActivated;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getwebAddress() {
		return webAddress;
	}

	public void setwebAddress(String webAddress) {
		this.webAddress = webAddress;
	}

	public String getphoneNumber() {
		return phoneNumber;
	}

	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isActivated() {
		return isActivated;
	}

	public void setisActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}
	
	
}
