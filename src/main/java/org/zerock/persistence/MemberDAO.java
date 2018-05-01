package org.zerock.persistence;

import org.zerock.domain.MemberVO;

public interface MemberDAO  {

	String getTime();

	void insertMember(MemberVO vo);
	
	public MemberVO readMember(String userid)throws Exception;
	
	public MemberVO readWithPW(String userid, String userpw)throws Exception;
	
}
