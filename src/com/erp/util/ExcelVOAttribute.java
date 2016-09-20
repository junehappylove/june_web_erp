package com.erp.util;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ java.lang.annotation.ElementType.FIELD })
public @interface ExcelVOAttribute {

	/**
	 * 函数功能说明 Administrator修改者名字 2013-6-28修改日期 修改内容 @Title: name @Description:
	 * 列名 @param @return 设定文件 @return String 返回类型 @throws
	 */
	public abstract String name();

	/**
	 * 函数功能说明 Administrator修改者名字 2013-6-28修改日期 修改内容 @Title: column @Description:
	 * 列号 @param @return 设定文件 @return String 返回类型 @throws
	 */
	public abstract String column();

	/**
	 * 函数功能说明 Administrator修改者名字 2013-6-28修改日期 修改内容 @Title: prompt @Description:
	 * 提示信息默认空 @param @return 设定文件 @return String 返回类型 @throws
	 */
	public abstract String prompt() default "";

	/**
	 * 函数功能说明 Administrator修改者名字 2013-6-28修改日期 修改内容 @Title: combo @Description:
	 * 限定下拉框 @param @return 设定文件 @return String[] 返回类型 @throws
	 */
	public abstract String[] combo() default {};

	/**
	 * 函数功能说明 Administrator修改者名字 2013-6-28修改日期 修改内容 @Title:
	 * isExport @Description: 是否导出默认true @param @return 设定文件 @return
	 * boolean 返回类型 @throws
	 */
	public abstract boolean isExport() default true;

}
