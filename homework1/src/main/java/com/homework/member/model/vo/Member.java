package com.homework.member.model.vo;


	import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Member {
		
		private String userId;
		private String userPwd;
		private String userName;
		private String email;
		private String gender;
		private String age;
		private String phone;
		private String address;
		private Date enrollDate;
		private Date modifyDate;
		private String status;
	}

