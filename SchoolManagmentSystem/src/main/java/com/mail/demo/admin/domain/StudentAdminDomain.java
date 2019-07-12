package com.mail.demo.admin.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "STUDENT_ADMIN")
@Setter
@Getter
public class StudentAdminDomain {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Admin_Id;
	private String admin_Name;
	private String admin_Last_Name;
	private long admin_Mobile_number;
	private String gender;
	private String email;
	private String password;

}
