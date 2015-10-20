package com.bd.mes.util.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ParentJobroute implements java.io.Serializable {
	
	private String job;
	private short suffix;
	private int operNum;
	private String wc;
	private String iitem;
	private String idescription;
	private String wdescription;
	public String getRowPointer() {
		return rowPointer;
	}
	public void setRowPointer(String rowPointer) {
		this.rowPointer = rowPointer;
	}

	private String rowPointer;
	
	
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public short getSuffix() {
		return suffix;
	}
	public void setSuffix(short suffix) {
		this.suffix = suffix;
	}
	public int getOperNum() {
		return operNum;
	}
	public void setOperNum(int operNum) {
		this.operNum = operNum;
	}
	public String getWc() {
		return wc;
	}
	public void setWc(String wc) {
		this.wc = wc;
	}
	public String getIitem() {
		return iitem;
	}
	public void setIitem(String iitem) {
		this.iitem = iitem;
	}
	public String getIdescription() {
		return idescription;
	}
	public void setIdescription(String idescription) {
		this.idescription = idescription;
	}
	public String getWdescription() {
		return wdescription;
	}
	public void setWdescription(String wdescription) {
		this.wdescription = wdescription;
	}
	public ParentJobroute() {
	}

	public ParentJobroute(String job, short suffix, int operNum, String wc,
			String iitem, String idescription, String wdescription) {
		super();
		this.job = job;
		this.suffix = suffix;
		this.operNum = operNum;
		this.wc = wc;
		this.iitem = iitem;
		this.idescription = idescription;
		this.wdescription = wdescription;
	}

	
}
