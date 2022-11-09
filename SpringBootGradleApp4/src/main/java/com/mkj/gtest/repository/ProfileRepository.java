package com.mkj.gtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mkj.gtest.entity.Profile;

@Repository
public interface ProfileRepository  extends JpaRepository<Profile, Integer> {

}
