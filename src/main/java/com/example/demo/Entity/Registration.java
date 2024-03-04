package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Registration 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long u_id;
	private String email;
	private String ans;
	private String password;
	private String confirm_password;

	@Enumerated(EnumType.STRING)
	private S_questions securityQuestion;

	@Enumerated(EnumType.STRING)
	private U_type userType;

	public long getU_id() {
		return u_id;
	}

	public void setU_id(long u_id) {
		this.u_id = u_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirm_password() {
		return confirm_password;
	}

	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}

	public S_questions getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(S_questions securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public U_type getUserType() {
		return userType;
	}

	public void setUserType(U_type userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "Registration [u_id=" + u_id + ", email=" + email + ", ans=" + ans + ", password=" + password
				+ ", confirm_password=" + confirm_password + ", securityQuestion=" + securityQuestion + ", userType="
				+ userType + "]";
	}

	public Registration(long u_id, String email, String ans, String password, String confirm_password,
			S_questions securityQuestion, U_type userType) {
		super();
		this.u_id = u_id;
		this.email = email;
		this.ans = ans;
		this.password = password;
		this.confirm_password = confirm_password;
		this.securityQuestion = securityQuestion;
		this.userType = userType;
	}

	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	

}
