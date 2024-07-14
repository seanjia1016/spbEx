package com.example.demo.service;

import com.example.demo.service.impl.*;
import com.example.demo.model.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MemberServiceImplTest {
	@Autowired
	MemberServiceImpl msi;

	@Test
	public void addMemberTest()
	{
		msi.addMember(new Member("ww","uu","00","taipei","456"));
		System.out.println("add success");
	}

	//@Test
	public void LoginMemberTest()
	{
		System.out.println(msi.LoginMember("uu", "000"));
	}

	//@Test
	public void selectUsernameTest()
	{
		System.out.println(msi.selectUsername("uuyyy"));
	}

	@Test
	public void updateMemberTest()
	{
		msi.updateMember(30, "teacher", "¥x¥_");
	}

}