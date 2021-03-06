package com.jk.mapper.user;

import com.jk.model.dept.DeptBean;
import com.jk.model.job.JobBean;
import com.jk.model.role.RoleBean;
import com.jk.model.user.UserBean;
import com.jk.model.userRole.UserRoleBean;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

public interface UserBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserBean record);

    int insertSelective(UserBean record);

    UserBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserBean record);

    int updateByPrimaryKey(UserBean record);

    UserBean queryUserInfoByLoginNumber(@Param("username") String username);

    List<String> queryUserPowerByUserId(@Param("userBean") UserBean userBean);

    void updateUserPassword(@Param("userBean") UserBean userBean);

    int queryUserCount(@Param("userBean") UserBean userBean);

    List<UserBean> queryUserList(@Param("userBean") UserBean userBean);

    List<JobBean> queryJobAll();

    List<DeptBean> queryDeptAll();

    List<JobBean> queryJobByDeptId(@Param("jobBean") JobBean jobBean);

    void saveUser(UserBean userBean);

    UserBean queryUserInfoById(@Param("userBean") UserBean userBean);

    void updateUser(@Param("userBean") UserBean userBean);

    UserBean queryUserInfoAndDeptNameByUserId(UserBean userInfo);

    List<RoleBean> queryRoleAll();

    void saveUserRole(@Param("arrayList") ArrayList<UserRoleBean> arrayList);

    void deleteUserRoleByUserId(UserBean userBean);
}