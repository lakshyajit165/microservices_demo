package com.lakshyajit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="pricing-service/api/v1")
public class PricingController {

    @GetMapping("/pricing")
    public String DashboardResponse() {
        return "Hi There! I am coming from Pricing Service. This is some dummy text "+
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras eu mollis leo. " +
                "Pellentesque sit amet lacus id quam commodo egestas sit amet ac ante. Nam pellentesque " +
                "leo a ligula ornare volutpat. Praesent velit elit, auctor eu porta non, feugiat sit amet diam. " +
                "Proin eu turpis maximus, luctus est sed, venenatis ante. ";
    }

    @GetMapping("/")
    public String hello() {
        return "Hello world";
    }
}
