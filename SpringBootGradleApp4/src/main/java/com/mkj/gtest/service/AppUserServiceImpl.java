package com.mkj.gtest.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkj.gtest.dao.AppUserDAO;
import com.mkj.gtest.entity.AppUser;
import com.mkj.gtest.entity.Post;
import com.mkj.gtest.entity.Profile;
import com.mkj.gtest.repository.AppUserRepository;

@Service
public class AppUserServiceImpl implements AppUserService {
	@Autowired
	AppUserRepository userRepository;

	@Override
	public List<AppUser> getAllUsers() throws Exception {

		List<AppUser> allUsers =  userRepository.findAll(); // Note : same as save
		return allUsers;
		// TODO Auto-generated method stub
	}

	@Override
	public List<AppUser> getAllUsers(String role) throws Exception {
		return null;
		// TODO Auto-generated method stub
	}

	@Override
	public AppUser getUserByUserName(String username) throws Exception {
		// TODO Auto-generated method stub
		return userRepository.getUsersByUsername(username);
	}

	@Override
	public List<AppUser> getUsersConnections(String username) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppUser getUserByUserNameAndRole(String username, String role) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AppUser> getUsersByRole(String role) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" ---->> Inside Servive Impl role "+role);
		return userRepository.getAllUsersByRole(role);
	}

	@Override
	public List<AppUser> getUsersBetweenIds(int range1, int range2) throws Exception {
		// TODO Auto-generated method stub
		return userRepository.getUsersBetweenIds(range1, range2);
	}

	@Override
	public String insertUser(AppUser user) throws Exception {
		AppUser savedUser =  userRepository.save(user);  // Note :  save() is already implemented by Spring Data JPA
		if(savedUser != null)
		{
			System.out.println("2. Inside insert user serviceImpl  "+ savedUser);
			return "App User Saved "+savedUser.getUserId()+" username :- "+savedUser.getUsername();
		}
		else return null;
		// TODO Auto-generated method stub
	}

	@Override
	public AppUser addHobbies(List<String> allHobbies, AppUser appUser) {
		// TODO Auto-generated method stub

		System.out.println(" --- 2> Inside UserService Impl ");
		System.out.println(appUser+" \n \n "+allHobbies);
		appUser.setHobbies(allHobbies);
		return appUser;
	}

	@Override
	@Transactional
	public AppUser linkProfile(Profile profile, AppUser appUser) {
		// TODO Auto-generated method stub
		appUser.setUserProfile(profile);
		return appUser;
		
	}

	@Override
	@Transactional
	public AppUser addPost(Post post, AppUser appUser) {
		// TODO Auto-generated method stubList<Post> allUserPost = appUser.getAllPosts();
		List<Post> allUserPost = appUser.getAllPosts();
		if(allUserPost == null)
		{
			allUserPost = new ArrayList<>();
			allUserPost.add(post);
		}
		else
		{
			allUserPost.add(post);
		}

		appUser.setAllPosts(allUserPost);


		return appUser;
	}

	@Override
	@Transactional
	public String insertUser1(AppUser user) throws Exception {
		//
		AppUser savedUser =  userRepository.save(user);
		if(savedUser != null)
		{
			return "App User Saved "+savedUser.getUserId()+" username :- "+savedUser.getUsername();
		}
		else return null;
	}

	@Override
	public AppUser getUserById(int searchedUserId) throws Exception {
		// TODO Auto-generated method stub
		 AppUser outputUser = userRepository.getReferenceById(searchedUserId);
		 return outputUser;
	}

}
