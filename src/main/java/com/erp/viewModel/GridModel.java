package com.erp.viewModel;

import java.util.ArrayList;
import java.util.List;

/**
 * 类功能说明 Exception工具类 
 * 
 * @author wjw.happy.love@163.com
 * @date 2013-4-19 下午03:18:05
 * @version V1.0
 */
@SuppressWarnings("rawtypes")
public class GridModel {
	private List rows = new ArrayList();
	private Long total = 0L;

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
}
