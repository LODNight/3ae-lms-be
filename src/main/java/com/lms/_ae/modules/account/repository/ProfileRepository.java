package com.lms._ae.modules.account.repository;

import com.lms._ae.modules.account.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {
}
