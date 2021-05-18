package com.xworkz.postmapper.service;

import java.util.List;

import com.xworkz.postmapper.dto.PressOrderDTO;

public interface PressOrderService {
	
	boolean validateAndSave(PressOrderDTO dto);
	
	PressOrderDTO validateAndSearchByOrderForm(String orderForm);
	
	List<PressOrderDTO> validateAndDisplayAll();
}
