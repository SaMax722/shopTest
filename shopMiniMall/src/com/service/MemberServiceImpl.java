package com.service;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.MemberDAO;
import com.dto.MemberDTO;

public class MemberServiceImpl implements MemberService {

	@Override
	public MemberDTO idCheck(String userid) {
		MemberDTO dto = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			// DAO 연동
			MemberDAO dao = new MemberDAO();
			dto = dao.idCheck(session, userid);
		}finally {
			session.close();
		}
		return dto;
	}

}




/*
SqlSession session = MySqlSessionFactory.getSession();
		try {
			
		}finally {
			session.close();
			
		}
 */
