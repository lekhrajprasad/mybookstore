package com.coursecube.bookstoreweb.dto;

import java.util.List;

public class OrderInfoDTO {
	private OrderDTO order;
	private List<OrderItemDTO> itemList;
	public OrderInfoDTO() {
		super();
	}
	public OrderInfoDTO(OrderDTO order, List<OrderItemDTO> itemList) {
		super();
		this.order = order;
		this.itemList = itemList;
	}
	public OrderDTO getOrder() {
		return order;
	}
	public void setOrder(OrderDTO order) {
		this.order = order;
	}
	public List<OrderItemDTO> getItemList() {
		return itemList;
	}
	public void setItemList(List<OrderItemDTO> itemList) {
		this.itemList = itemList;
	}
	
	
}
