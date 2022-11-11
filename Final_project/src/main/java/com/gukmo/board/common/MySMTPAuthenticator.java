package com.sist.fproj.common;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

// ==== #187. Spring Scheduler(스프링스케줄러6) ==== //
// ==== Spring Scheduler(스프링스케줄러)를 사용한 email 발송하기 ====
// ==== email 을 보내주는 클래스 생성하기 ====
public class MySMTPAuthenticator extends Authenticator {

	@Override
	public PasswordAuthentication getPasswordAuthentication() {

		return new PasswordAuthentication("forclass077","sistaclass123");
	
	}
	
}
