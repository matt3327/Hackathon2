package com.spring.bean;

public class User {
	package com.spring.bean;

	public class Users {
		private int userID;
		private String userName;
		private String city;
		
		public Users() {
			super();
		}
		
		public Users(int userID, String userName, String city) {
			super();
			this.userID = userID;
			this.userName = userName;
			this.city = city;
			
		}
		
		public int getUserID() {
			return userID;
		}
		
		public void setUserID(int userID) {
			this.userID = userID;
		}
		
		public String getUserName() {
			return userName;
		}
		
		public void setUserName(String userName) {
			userName = userName;
		}
		
		public String getCity() {
			return city;
		}
		
		public void setCity(String city) {
			this.city = city;
		}
		
		@Override
		public String toString() {
			return "User [userID=" + userID + ", UserName=" + userName + ", city=" + city + "]";
		}
		
}


