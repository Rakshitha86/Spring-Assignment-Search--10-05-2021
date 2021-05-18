package com.xworkz.postmapper.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.postmapper.dto.PressOrderDTO;
import com.xworkz.postmapper.service.PressOrderService;

@Component
@RequestMapping("/")
public class PressOrderComponent {

	@Autowired
	private PressOrderService service;

	public PressOrderComponent() {
		super();
		System.out.println(this.getClass().getSimpleName() + " Object created");
	}

	@PostMapping("/order.do")
	public String onOrder(PressOrderDTO dto, Model model) {
		System.out.println("invoked onOrder()" + dto);

		boolean saved = this.service.validateAndSave(dto);
		if (saved) {
			System.out.println("data saved successfully, will navigate to order successful");
			model.addAttribute("message1", "Order success!!");
			model.addAttribute("data", dto);
			return "OrderSuccessful";
		} else {
			model.addAttribute("message2", "order failed!!");
			System.out.println("data is not saved successfully, will navigate to Press order page");
		}
		return "PressOrder";
	}

	@GetMapping("/search.do")
	public String onSearchByOrderForm(PressOrderDTO dto, String orderForm, Model model) {
		System.out.println("invoked onSearchByOrderForm()" + dto);
		System.out.println("Form is " + orderForm);

		PressOrderDTO searchDTO = service.validateAndSearchByOrderForm(orderForm);
		if (searchDTO != null) {
			model.addAttribute("data", searchDTO);
			System.out.println("data searched successfully " + searchDTO);
			model.addAttribute("message1", "Searched data found!!");
		} else {
			model.addAttribute("message2", "No data found!!");
			System.out.println("data is not found , will navigate to Order Search page");

		}
		return "OrderSearch";
	}

	@PostMapping("/displayAll.do")
	public String onDisplayAll(PressOrderDTO dto, Model model) {
		System.out.println("invoked onDisplayAll()" + dto);

		List<PressOrderDTO> displatAllDTO = service.validateAndDisplayAll();
		if (displatAllDTO != null) {
			model.addAttribute("data", displatAllDTO);
			System.out.println("data searched successfully " + displatAllDTO);
			model.addAttribute("message1", "Displayied all the data!!");
		} else {
			model.addAttribute("message2", "No data found!!");
			System.out.println("data is not found , will navigate to Display All page");

		}
		return "DisplayAll";

	}
}
