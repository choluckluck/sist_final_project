package com.gukmo.board.model;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

//=== #32. DAO 선언 === 
@Repository
public class BoardDAO implements InterBoardDAO {

	@Resource
	private SqlSessionTemplate sqlsession;  // 로컬DB final_orauser3 에 연결
	// Type 및 빈이름이 동일한 것을 찾아서 주입시켜준다.


}
