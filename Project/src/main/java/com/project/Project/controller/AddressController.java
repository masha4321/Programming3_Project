package com.project.Project.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.Project.dto.addressDTO.AddressInput;
import com.project.Project.model.Address;
import com.project.Project.service.AddressService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AddressController {

    final AddressService service;

    private final ObjectMapper mapper = new ObjectMapper();

    public AddressController(AddressService service) {
        this.service = service;
    }

    @GetMapping("/registration")
    public String registrer(Model model){
        AddressInput address = new AddressInput();
        model.addAttribute("address", address);
        return "registration";
    }

    @PostMapping("/saveAddress")
    public String saveAddress(@ModelAttribute("address") AddressInput saveAddress, BindingResult result) {
        Address a = mapper.convertValue(saveAddress, Address.class);
        service.saveAddress(a);
        return "redirect:/";
    }
}
