package com.xworkz.postmapper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.postmapper.dao.PressOrderDAO;
import com.xworkz.postmapper.dto.PressOrderDTO;

@Component
public class PressOrderServiceImpl implements PressOrderService {

	@Autowired
	private PressOrderDAO dao;

	public PressOrderServiceImpl() {
		super();
		System.out.println(this.getClass().getSimpleName() + "object created");
	}

	@Override
	public boolean validateAndSave(PressOrderDTO dto) {
		System.out.println("invoked validateAndSave()");
		boolean valid = false;
		if (dto != null) {
			String orderForm = dto.getOrderForm();
			if (orderForm != null && orderForm.length() >= 4) {
				System.out.println("order form is valid");
				valid = true;
			} else {
				System.out.println("order form is not valid");
				valid = false;
			}
		}
		if (valid) {
			int noOfCopies = dto.getNoOfCopies();
			if (noOfCopies > 50 && noOfCopies != 0) {
				System.out.println("noOfCopies is valid");
				valid = true;
			} else {
				System.out.println("noOfCopies is not valid");
				valid = false;
			}
		}
		if (valid) {
			long phoneNo = dto.getPhoneNo();
			if (phoneNo > 0 && phoneNo != 0) {
				System.out.println("phoneNo is valid");
				valid = true;
			} else {
				System.out.println("phoneNo is not valid");
				valid = false;
			}
		}
		if (valid) {
			String cardType = dto.getCardType();
			if (cardType != null && !cardType.isEmpty() && !cardType.contentEquals(" ")) {
				System.out.println("cardType is valid");
				valid = true;
			} else {
				System.out.println("cardType is not valid");
				valid = false;
			}
		}
		if (valid) {
			String content = dto.getContent();
			if (content != null && !content.isEmpty() && !content.contentEquals(" ")) {
				System.out.println("content is valid");
				valid = true;
			} else {
				System.out.println("content is not valid");
				valid = false;
			}
		}
		if (valid) {
			this.dao.savePressOrder(dto);
		} else {
			System.out.println("dto is null, invalid data");
		}
		return valid;
	}

	@Override
	public PressOrderDTO validateAndSearchByOrderForm(String orderForm) {
		return this.dao.fetchByOrderForm(orderForm);
	}

	@Override
	public List<PressOrderDTO> validateAndDisplayAll() {
		return this.dao.displayAll();
	}

}
