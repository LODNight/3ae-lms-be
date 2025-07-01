package com.lms._ae.service.impl;

import com.lms._ae.models.Profile;
import com.lms._ae.repository.ProfileRepository;
import com.lms._ae.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

public class ProfileServiceImpl implements ProfileService {
    @Autowired
    private ProfileRepository repository;

    @Override
    public List<Profile> getAllProfile() {
        return repository.findAll();
    }

    @Override
    public Profile getProfileById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Profile createProfile(Profile profile) {
        profile.setCreatedAt(LocalDateTime.now());
        return repository.save(profile);
    }

    @Override
    public Profile updateProfile(Integer id, Profile profile) {
        Profile existing = repository.findById(id).orElse(null);
        if(existing != null){
            existing.setFirst_name(profile.getFirst_name());
            existing.setLast_name(profile.getLast_name());
            existing.setEmail(profile.getEmail());
            existing.setGender(profile.getGender());
            existing.setStatus(profile.getStatus());
            existing.setAccounts(profile.getAccounts());

            // Created and Updated
            existing.setCreatedBy(profile.getCreatedBy() == null ? existing.getCreatedBy() : profile.getCreatedBy());
            existing.setCreatedAt(profile.getCreatedAt() == null ? existing.getCreatedAt() : profile.getCreatedAt());
            existing.setUpdatedAt(LocalDateTime.now());
            existing.setUpdatedBy(profile.getUpdatedBy());

            return repository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteProfile(Integer id) {
        repository.deleteById(id);
    }
}

