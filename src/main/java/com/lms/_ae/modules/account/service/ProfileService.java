package com.lms._ae.modules.account.service;

import com.lms._ae.modules.account.entity.Profile;

import java.util.List;

public interface ProfileService {
    List<Profile> getAllProfile();
    Profile getProfileById(Integer id);
    Profile createProfile(Profile Profile);
    Profile updateProfile(Integer id, Profile Profile);
    void deleteProfile(Integer id);
}
