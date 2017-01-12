package com.mvc.entityReport;

/**
 * 员工工作量饱和度分析
 * 
 * @author zjn
 * @date 2016年12月7日
 */
public class WorkLoadLevel {

	private String orderNum;// 序号
	private String staffName;// 员工姓名
	private String staffNo;// 员工编号
	// private String ratedLoad;// 额定工作量
	private String actualLoad;// 实际工作量
	private String beyondLoad;// 超出工作量
	private String outOfRang;// 超出幅度

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffNo() {
		return staffNo;
	}

	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}

	// public String getRatedLoad() {
	// return ratedLoad;
	// }
	//
	// public void setRatedLoad(String ratedLoad) {
	// this.ratedLoad = ratedLoad;
	// }

	public String getActualLoad() {
		return actualLoad;
	}

	public void setActualLoad(String actualLoad) {
		this.actualLoad = actualLoad;
	}

	public String getBeyondLoad() {
		return beyondLoad;
	}

	public void setBeyondLoad(String beyondLoad) {
		this.beyondLoad = beyondLoad;
	}

	public String getOutOfRang() {
		return outOfRang;
	}

	public void setOutOfRang(String outOfRang) {
		this.outOfRang = outOfRang;
	}
}
