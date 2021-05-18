package com.xworkz.postmapper.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "details")
@NamedQueries({
		@NamedQuery(query = "select order from PressOrderDTO order where order.orderForm=:orderform", name = "fetchByOrderForm") })
public class PressOrderDTO implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "ORDERFORM")
	private String orderForm;

	@Column(name = "NOOFCOPIES")
	private int noOfCopies;

	@Column(name = "PHONENO")
	private long phoneNo;

	@Column(name = "CARDTYPE")
	private String cardType;

	@Column(name = "CONTENT")
	private String content;

	public PressOrderDTO() {
		super();
		System.out.println(this.getClass().getSimpleName() + " Object created");
	}

	public PressOrderDTO(String orderForm, int noOfCopies, long phoneNo, String cardType, String content) {
		super();
		this.orderForm = orderForm;
		this.noOfCopies = noOfCopies;
		this.phoneNo = phoneNo;
		this.cardType = cardType;
		this.content = content;
	}

	public String getOrderForm() {
		return orderForm;
	}

	public void setOrderForm(String orderForm) {
		this.orderForm = orderForm;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "PressOrderDTO [orderForm=" + orderForm + ", noOfCopies=" + noOfCopies + ", phoneNo=" + phoneNo
				+ ", cardType=" + cardType + ", content=" + content + "]";
	}

}
