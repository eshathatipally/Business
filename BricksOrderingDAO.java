package business;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class BricksOrderingDAO {

	Map<Integer, BricksOrderingPOJO> allOrders = new LinkedHashMap<Integer, BricksOrderingPOJO>();
	int orderIdSeq = 0;
	private int generateOrderId() {
		return ++orderIdSeq;
	}
	

	public BricksOrderingPOJO insertOrder(BricksOrderingPOJO order) {

		int orderId = this.generateOrderId();

		order.setOrderId(orderIdSeq);
		order.setMsg("Inserted Successfully");
		order.setDispatchStatus("Under Process");
		allOrders.put(orderId, order);
		return order;
	}

	public BricksOrderingPOJO getOrder(int orderId) {
		if(allOrders.containsKey(orderId)){
		BricksOrderingPOJO order = allOrders.get(orderId);
		order.setMsg("");
		return order;
		}else{
		BricksOrderingPOJO order = new BricksOrderingPOJO();
		order.setMsg("Invalid Order id ,Please Enter correct order id");
		order.setDispatchStatus("");
		order.setOrderId(0);
		order.setCustomerName("");
		order.setBrickCount(0);
		return order;
		}
	}

	
	public BricksOrderingPOJO updateOrder(BricksOrderingPOJO order) {
		if(allOrders.containsKey(order.getOrderId())){
			BricksOrderingPOJO existingOrder = allOrders.get(order.getOrderId());
			if(existingOrder.getDispatchStatus().equals("Dispatched")){
				order.setMsg("Order already Dispatched..Can't be updated.");
				order.setDispatchStatus("Dispatched");
				order.setCustomerName(existingOrder.getCustomerName());
				order.setBrickCount(existingOrder.getBrickCount());
			}else{
			allOrders.put(order.getOrderId(), order);	
			order.setMsg("Updated Successfully");
			order.setDispatchStatus("Under Process");
			}
		}else{
			order.setMsg("Invalid Order id ,Please Enter correct order id");
			order.setDispatchStatus("");
			order.setOrderId(0);
			order.setCustomerName("");
			order.setBrickCount(0);
		}
		

		return order;
	}
	
	public BricksOrderingPOJO updateOrderDispatch(BricksOrderingPOJO order) {
		if(allOrders.containsKey(order.getOrderId())){
			BricksOrderingPOJO existingOrder = allOrders.get(order.getOrderId());
			if(existingOrder.getDispatchStatus().equals("Dispatched")){
				order.setMsg("Order already Dispatched..Can't be updated.");
				order.setDispatchStatus("Dispatched");
				order.setCustomerName(existingOrder.getCustomerName());
				order.setBrickCount(existingOrder.getBrickCount());
				order.setDispatchStatus(existingOrder.getDispatchStatus());
			}else{
				allOrders.put(order.getOrderId(), order);	
				order.setMsg("Updated Successfully");
			}
		}else{
			order.setMsg("Invalid Order id ,Please Enter correct order id");
			order.setDispatchStatus("");
			order.setOrderId(0);
			order.setCustomerName("");
			order.setBrickCount(0);
		}
		

		return order;

}
	}
