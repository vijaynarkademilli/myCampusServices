package com.mycampus.services.repository;

import com.mycampus.services.models.AppRoles;
import com.mycampus.services.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by vijay on 04-04-2020.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

    Optional<Role> findByName(AppRoles name);

}
