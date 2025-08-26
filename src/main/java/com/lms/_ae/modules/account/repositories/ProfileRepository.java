package com.lms._ae.modules.account.repositories;

import com.lms._ae.modules.account.entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {
}
