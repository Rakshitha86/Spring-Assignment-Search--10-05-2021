package com.xworkz.postmapper.dao;

import java.util.List;

import com.xworkz.postmapper.dto.PressOrderDTO;

public interface PressOrderDAO {

	public boolean savePressOrder(PressOrderDTO dto);
	
	public PressOrderDTO fetchByOrderForm(String name);
	
	public List<PressOrderDTO> displayAll();

}
