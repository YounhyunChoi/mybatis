package ch03.domain;

import java.time.LocalDate;

import org.apache.ibatis.type.Alias;

@Alias("myUser")
public class User {
	private int userId;
	private String userName;
	private LocalDate regDate;
	private Address address;
	
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format("%d %s %s %s", userId, userName, regDate, address);
	}
}
