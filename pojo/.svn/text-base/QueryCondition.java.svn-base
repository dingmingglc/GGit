/**
 * 
 */
package com.bd.mes.util.pojo;

import java.text.ParseException;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import com.bd.mes.util.Constant;
import com.wa.framework.util.DateUtils;

/**
 * @author dengjy
 *
 */
public class QueryCondition {

	private String name;
	private String operation;
	private String value;
	private String valueType;
	private Object valObj;
	private Criterion criterion;
	
	public QueryCondition() {}
	
	public QueryCondition(Criterion criterion) {
		this.criterion = criterion;
	}
	
	public QueryCondition(String name, String operation) {
		this(name, operation, null, null);
	}
	
	public QueryCondition(String name, String operation, String value) {
		this(name, operation, value, Constant.QUERYCON_VALUETYPE_STRING);
	}
	
	public QueryCondition(String name, String operation, Object valObj) {
		this.name = name;
		this.operation = operation;
		this.valObj = valObj;
	}
	
	public QueryCondition(String name, String operation, String value, String valueType) {
		this.name = name;
		this.operation = operation;
		this.value = value;
		this.valueType = valueType;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getValueType() {
		return valueType;
	}
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}
	
	public void setValObj() {
		if (valObj == null)
			if (valueType.equals(Constant.QUERYCON_VALUETYPE_STRING))
				valObj = value;
			else if (valueType.equals(Constant.QUERYCON_VALUETYPE_INT))
				valObj = new Integer(value);
			else if (valueType.equals(Constant.QUERYCON_VALUETYPE_LONG))
				valObj = new Long(value);
			else if (valueType.equals(Constant.QUERYCON_VALUETYPE_DATE))
				valObj = DateUtils.parseDate(value);
			else if (valueType.equals(Constant.QUERYCON_VALUETYPE_DATETIME))
				try {
					valObj = DateUtils.parseDate(value, DateUtils.PATTERN_DATETIME);
				} catch (ParseException e) {
					e.printStackTrace();
				}
		
	}
	
	public Criterion getRestrictions() {
		if (criterion != null)
			return criterion;
		
		if (value == null && valueType == null && valObj == null) {
			if (operation.equals("isNull"))
				return Restrictions.isNull(name);
			else if (operation.equals("isNotNull"))
				return Restrictions.isNotNull(name);
			else if (operation.equals("isEmpty"))
				return Restrictions.isEmpty(name);
			else if (operation.equals("isNotEmpty"))
				return Restrictions.isNotEmpty(name);
		}
		
		setValObj();
		
		if (valObj == null)
			return Restrictions.eq(name, valObj);
		
		if (operation.equals("="))
			return Restrictions.eq(name, valObj);
		else if (operation.equals("!=") || operation.equals("<>"))
			return Restrictions.ne(name, valObj);
		else if (operation.equals(">"))
			return Restrictions.gt(name, valObj);
		else if (operation.equals(">="))
			return Restrictions.ge(name, valObj);
		else if (operation.equals("<"))
			return Restrictions.lt(name, valObj);
		else if (operation.equals("<="))
			return Restrictions.le(name, valObj);
		else if (operation.equals("like"))
			return Restrictions.like(name, valObj.toString(), MatchMode.ANYWHERE);
		else if (operation.equals("in"))
			return Restrictions.in(name, (Object[]) valObj);
		else if (operation.equals("not in"))
			return Restrictions.not(Restrictions.in(name, (Object[]) valObj));
		
		return null;
	}
}
