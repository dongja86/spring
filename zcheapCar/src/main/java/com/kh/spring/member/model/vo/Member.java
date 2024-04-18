package com.kh.spring.member.model.vo;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


	/*
	 * 
	 * Lombok(롬복)
	 * 
	 * - 자동 코드 생성 라이브러리 => 코드 다이어트
	 * 
	 * :: 설치방법
	 * 1. 라이브러리를 다운로드
	 * 2. 다운로드 된 jar파일을 찾아서 설치(작업할 IDE 체크)
	 * 3. IDE 재실행
	 * 
	 * @Getter
	 * @Setter
	 * @ToString
	 * @NoArgsConstructor
	 * ------------------------
	 * @Builder
	 * @AllArgsConstructor
	 * ------------------------
	 * @Data
	 * ------------------------
	 * 
	 *  - Lombok 사용 시 주의사항 ~!
	 *  
	 *  ex) - pName이라는 필드를 선언했을 경우
	 *  Lombok의 명명 규칙 == setPName() / getPName()
	 *  
	 *  jsp단
	 *  => EL표기법을 이용한 내부적 getter메소드 호출 식
	 *  
	 *  ${ pName } ==> getpName을 찾음
	 *  외자로된 변수명은 지양!!!!
	 *  
	 * 
	 * 
	 * 
	 */


@Getter @Setter @ToString @NoArgsConstructor
//@Data
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
