package restservices.com.java.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="example")
public class banking {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer userid;

@Column
private String username;

@Column
private String userpassword;

@Column
private String userfullname;

@Column
private String useremailid;

@Column
private String userphno;

@Column
private String useraddress;

	
}
