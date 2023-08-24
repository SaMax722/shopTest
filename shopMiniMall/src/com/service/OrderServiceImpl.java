package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.CartDAO;
import com.dao.GoodsDAO;
import com.dao.OrderDAO;
import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.MemberDTO;

public class OrderServiceImpl implements OrderService {

	@Override
	public CartDTO cartByNum(int num) {
		CartDTO cartDTO = null;
		 SqlSession session = MySqlSessionFactory.getSession();
			try {
			   //DAO 연동
				OrderDAO dao = new OrderDAO();
				cartDTO = dao.cartByNum(session, num);
			}finally {
				session.close();
			}
		return cartDTO;
	}
	@Override
	public MemberDTO memberByUserid(String userid) {
		MemberDTO memberDTO = null;
		 SqlSession session = MySqlSessionFactory.getSession();
			try {
				 //DAO 연동
				OrderDAO dao = new OrderDAO();
				memberDTO = dao.memberByUserid(session, userid);
			}finally {
				session.close();
			}
		return memberDTO;
	}

	/*
    SqlSession session = MySqlSessionFactory.getSession();
		try {
		
		
		}finally {
			session.close();
		}
*/	
	
}
