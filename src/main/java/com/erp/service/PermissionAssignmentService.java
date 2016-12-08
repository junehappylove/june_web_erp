package com.erp.service;

import java.util.List;
import java.util.Map;

import com.erp.model.Permission;
import com.erp.model.Role;
import com.erp.viewModel.TreeGrid;

/**
 * 类功能说明  
 * 
 * @author wjw.happy.love@163.com
 * @date 2013-5-17 下午2:49:38
 * @version V1.0
 */

public interface PermissionAssignmentService {

	List<TreeGrid> findAllFunctionsList(Integer pid);

	Long getCount(Map<String, Object> param);

	boolean savePermission(Integer roleId, String checkedIds);

	List<Permission> getRolePermission(Integer roleId);

	boolean persistenceRole(Map<String, List<Role>> map);

	List<Role> findAllRoleList(Map<String, Object> param, Integer page, Integer rows, boolean isPage);

	boolean persistenceRole(Role r);

	boolean persistenceRole(Integer roleId);

}
