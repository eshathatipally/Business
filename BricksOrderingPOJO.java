package business;

public class BricksOrderingPOJO {

	private String customerName;
	private String msg;
	private String dispatchStatus;
	private int brickCount;
	private int orderId;
	
	public String getDispatchStatus() {
		return dispatchStatus;
	}

	public void setDispatchStatus(String dispatchStatus) {
		this.dispatchStatus = dispatchStatus;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getBrickCount() {
		return brickCount;
	}

	public void setBrickCount(int brickCount) {
		this.brickCount = brickCount;
	}

}
