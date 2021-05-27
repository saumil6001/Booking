package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.CustomerDao;
import com.entity.Customer;
import com.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/list")
	public String customerlist(Model model) {
		List<Customer> customer = customerService.getCustomers();
		model.addAttribute("customer", customer);
		return "customerlist";
	}

	@GetMapping("/addcustomer")
	public String addCustomer(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "addcustomer";
	}

	@GetMapping("/savecustomer")
	public String addCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.addCustomer(customer);
		return "redirect:/customer/list";
	}

	@GetMapping("/update")
	public String updateCustomer(@RequestParam("update") int id, Model model) {

		Customer customer = customerService.getCustomer(id);

		model.addAttribute("customer", customer);

		return "updatecutomer";
	}

}
