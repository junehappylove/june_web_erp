/**   
* @Title: PublicDao.java 
* @Package com.erp.dao
* @Description: TODO
* @author chenguang 
* @date 2013-4-19 上午08:40:54
* @version V1.0   
*/
package com.erp.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 类功能说明 公用dao接口 
 * 
 * @author wjw.happy.love@163.com
 * @date 2013-4-19 上午08:40:54
 * @version V1.0
 */
public interface PublicDao<T> {
	/**
	 * 保存一个对象
	 * @param o
	 * @return
	 * @date 2016年9月20日 下午3:56:16
	 * @writer iscas
	 */
	public Serializable save(T o);

	/**
	 * 删除一个对象
	 * @param o
	 * @date 2016年9月20日 下午3:56:25
	 * @writer iscas
	 */
	public void delete(T o);

	/**
	 * 更新一个对象
	 * @param o
	 * @date 2016年9月20日 下午3:56:32
	 * @writer iscas
	 */
	public void update(T o);

	/**
	 * 保存或更新对象
	 * @param o
	 * @date 2016年9月20日 下午3:56:39
	 * @writer iscas
	 */
	public void saveOrUpdate(T o);

	/**
	 * 查询
	 * @param hql
	 * @return
	 * @date 2016年9月20日 下午3:56:45
	 * @writer iscas
	 */
	public List<T> find(String hql);

	/**
	 * 获得一个对象
	 * @param c
	 * @param id
	 * @return
	 * @date 2016年9月20日 下午3:56:51
	 * @writer iscas
	 */
	public T get(Class<T> c, Serializable id);

	/**
	 * select count(*) from 类
	 * @param hql
	 * @return
	 * @date 2016年9月20日 下午3:57:08
	 * @writer iscas
	 */
	public Long count(String hql);

	/**
	 *  执行HQL语句
	 * @param hql
	 * @return
	 * @date 2016年9月20日 下午3:57:15
	 * @writer iscas
	 */
	public Integer executeHql(String hql);

	/**
	 * 查询集合
	 * @param hql
	 * @param params
	 * @return
	 * @date 2016年9月20日 下午3:57:21
	 * @writer iscas
	 */
	List<T> find(String hql, Map<String, Object> params);

	/**
	 * 查询分页集合 
	 * @param hql
	 * @param params
	 * @param page
	 * @param rows
	 * @return
	 * @date 2016年9月20日 下午3:57:27
	 * @writer iscas
	 */
	List<T> find(String hql, Map<String, Object> params, Integer page, Integer rows);

	/**
	 * 根据参数查询实体类
	 * @param hql
	 * @param param
	 * @return
	 * @date 2016年9月20日 下午3:57:34
	 * @writer iscas
	 */
	T get(String hql, Map<String, Object> param);

	/**
	 * 根据参数查询集合条数
	 * @param hql
	 * @param params
	 * @return
	 * @date 2016年9月20日 下午3:57:46
	 * @writer iscas
	 */
	Long count(String hql, Map<String, Object> params);

	/**
	 * 批量执行HQL (更新) 响应数目
	 * @param hql
	 * @param params
	 * @return
	 * @date 2016年9月20日 下午3:57:58
	 * @writer iscas
	 */
	Integer executeHql(String hql, Map<String, Object> params);

	/**
	 * 根据sql语句查询集合
	 * @param sql
	 * @return
	 * @date 2016年9月20日 下午3:58:35
	 * @writer iscas
	 */
	List<?> findBySQL(String sql);

	void deleteToUpdate(T o);

}
