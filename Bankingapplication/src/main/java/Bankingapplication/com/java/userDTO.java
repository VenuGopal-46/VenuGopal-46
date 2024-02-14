package Bankingapplication.com.java;

	public class userDTO {
		
		private String userfullname;
		private String username;
		private String Password;
		private String email;
		private String contactNo;
		private String useraddress;
		private int userId;
		
	       
	    public userDTO() {
	        super();
	      
	    }
	    
	    public userDTO(String userfullname, String username, String Password, String email, String contactNo, String useraddress, int userId  ) {
	        this.userfullname=userfullname;
	        this.username=username;
	        this.Password=Password;
	        this.email=email;
	        this.contactNo=contactNo;
	        this.useraddress=useraddress;
	        this.userId=userId;
	      
	    }
	    
	    public String getUserfullname() {
	    	return userfullname;
	    }
	    
	    public void setUserfullname(String userfullname) {
	    	this.userfullname = userfullname;
	    }

	    public String getUsername() {
	    	return username;
	    }
	    
	    public void setUsername(String username) {
	    	this.username = username;
	    }
	    
	    public String getPassword() {
	    	return Password;
	    }
	    
	    public void setPassword(String Password) {
	    	this.Password = Password;
	    }
	    
	    public String getEmail() {
	    	return email;
	    }
	    
	    public void setEmail(String email) {
	    	this.email = email;
	    }
	    
	    public String getContactNo() {
	    	return contactNo;
	    }
	    
	    public void setContactNo(String contactNo) {
	    	this.contactNo = contactNo;
	    }
	    
	    public String getUseraddress() {
	    	return useraddress;
	    }
	    
	    public void setUseraddress(String useraddress) {
	    	this.useraddress = useraddress;
	    }
	    public int getUserId() {
	    	return userId;
	    }
	    
	    public void setUserId(int userId) {
	    	this.userId = userId;
	    }
	}

