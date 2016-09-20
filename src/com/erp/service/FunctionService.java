package com.erp.service;

import java.util.List;

import com.erp.model.Permission;
import com.erp.viewModel.TreeGridModel;
import com.erp.viewModel.TreeModel;

/**
 * 类功能说明 程式管理service接口 
 * 
 * @author wjw.happy.love@163.com
 * @date 2013-5-9 下午1:46:41
 * @version V1.0
 */

public interface FunctionService {

	List<TreeGridModel> findAllFunctionList(Integer pid);

	boolean delFunction(Integer id);

	boolean persistenceFunction(List<Permission> list);

	List<TreeModel> findAllFunctionList();

	boolean persistenceFunction(Permission permission);

}
