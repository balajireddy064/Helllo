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
	private int Admin_Id=1;
	private String admin_Name="name";
	private String admin_Last_Name="LastName";
	private long admin_Mobile_numbe"+91";
	private String gender="male";
	private String email="balajireddy064@gmail.com;
	private String password="8549850878";
	

}
