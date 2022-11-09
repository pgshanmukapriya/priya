package com.mkj.gtest.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkj.gtest.entity.Profile;
import com.mkj.gtest.repository.ProfileRepository;

@Service
public class ProfileServiceImpl  implements Profileservice{

	@Autowired
	ProfileRepository profileRepository;

	@Override
	@Transactional
	public Profile addProfile(Profile profile) {
		// TODO Auto-generated method stub
		Profile savedProfile = profileRepository.save(profile);

		return savedProfile;
		
	}


}
