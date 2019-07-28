package com.monolog7.icecream;

import com.monolog7.icecream.dao.IRolePermissionDao;
import com.monolog7.icecream.service.UserServiceTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IcecreamApplicationTests {

    @Autowired
    private UserServiceTest userServiceTest;

    @Autowired
    private IRolePermissionDao iRolePermissionDao;

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {
        /*RolePermission rolePermission = new RolePermission();
        rolePermission.setRole(1);
        rolePermission.setRoleName("user");
        rolePermission.setPermission("common");
        iRolePermissionDao.addRole(rolePermission);*/
        userServiceTest.setUserRole();
    }
}
