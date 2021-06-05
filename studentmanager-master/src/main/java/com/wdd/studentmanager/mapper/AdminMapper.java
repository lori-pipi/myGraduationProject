package com.wdd.studentmanager.mapper;

import com.wdd.studentmanager.domain.Admin;
import org.springframework.stereotype.Repository;

/**
 * @Classname UserMapper
 * @Description None
 */
@Repository
public interface AdminMapper {

    Admin findByAdmin(Admin admin);


    int editPswdByAdmin(Admin admin);
}
