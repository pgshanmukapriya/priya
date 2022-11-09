package com.mkj.gtest.service;

import org.springframework.stereotype.Service;

import com.mkj.gtest.entity.Profile;

@Service
public interface Profileservice {
	public Profile addProfile(Profile profile);

}
