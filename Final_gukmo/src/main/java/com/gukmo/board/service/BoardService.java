package com.gukmo.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gukmo.board.model.InterBoardDAO;
import com.gukmo.common.AES256;
import com.gukmo.common.FileManager;
import com.gukmo.common.GoogleMail;

//트랜잭션 처리를 담당하는곳 , 업무를 처리하는 곳, 비지니스(Business)단
@Service
public class BoardService implements InterBoardService {
	
	// === #34. 의존객체 주입하기(DI: Dependency Injection) ===
	@Autowired     // Type 에 따라 알아서 Bean 을 주입해준다.
	private InterBoardDAO dao;
	
	// === #45. 양방향 암호화 알고리즘인 AES256 를 사용하여 복호화 하기 위한 클래스 의존객체 주입하기(DI: Dependency Injection) ===
	@Autowired
	private AES256 aes;
	
	@Autowired   // Type 에 따라 알아서 Bean 을 주입해준다.
	private FileManager fileManager;
	
	@Autowired 
	private GoogleMail mail;

}
