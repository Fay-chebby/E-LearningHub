package com.redstevo.code.Repositories;

import com.redstevo.code.Tables.UserProfile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ProfileRepository extends CrudRepository<UserProfile, String> {

    Optional<Integer> countByEmail(String email);

    Optional<UserProfile> findByUsername(String username);

}
