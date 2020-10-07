package com.coursecube.bookstoreweb.dto;

public class OrderDTO {
	private Integer orderId;
	private String orderDate;
	private String userId;
	private int totalQty;
	private double totalPrice;
	private String status;
	
	public OrderDTO(String orderDate, String userId, int totalQty, double totalPrice, String status) {
		super();
		this.orderDate = orderDate;
		this.userId = userId;
		this.totalQty = totalQty;
		this.totalPrice = totalPrice;
		this.status = status;
	}

	public OrderDTO() {
		super();
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getTotalQty() {
		return totalQty;
	}
	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "OrderDTO [orderId=" + orderId + ", orderDate=" + orderDate + ", userId=" + userId + ", totalQty="
				+ totalQty + ", status=" + status + "]";
	}
	
}
