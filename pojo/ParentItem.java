package com.bd.mes.util.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ParentItem {
	//暂时保存连接号
	private String ConnectionMark;
	//暂时保存slx表名
	private String SheetName;

	public String getSheetName() {
		return SheetName;
	}

	public void setSheetName(String sheetName) {
		SheetName = sheetName;
	}

	public String getConnectionMark() {
		return ConnectionMark;
	}

	public void setConnectionMark(String connectionMark) {
		ConnectionMark = connectionMark;
	}
	
	
	//暂存线种名称
	private String WireType;
	public String getWireType() {
		return WireType;
	}
	public void setWireType(String wireType) {
		WireType = wireType;
	}
	public String getMachine() {
		return Machine;
	}
	public void setMachine(String machine) {
		Machine = machine;
	}
	public String getOperName() {
		return operName;
	}
	public void setOperName(String operName) {
		this.operName = operName;
	}
	//暂存机器类型
	private String Machine;
	//暂存工序名称
	private String operName;
	
	//暂存工序控制中心
	private String Wc;

	public String getWc() {
		return Wc;
	}

	public void setWc(String wc) {
		Wc = wc;
	}

	
	//dengjy 针对 job
	private BigDecimal qtyReleased;
	private Date jobDate;

	public BigDecimal getQtyReleased() {
		return qtyReleased;
	}

	public void setQtyReleased(BigDecimal qtyReleased) {
		this.qtyReleased = qtyReleased;
	}

	public Date getJobDate() {
		return jobDate;
	}

	public void setJobDate(Date jobDate) {
		this.jobDate = jobDate;
	}
	
}
