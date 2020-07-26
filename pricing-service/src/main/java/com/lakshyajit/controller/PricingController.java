package com.lakshyajit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(value="pricing-service/api/v1")
public class PricingController {

    HashMap<String, String> response;

    @GetMapping("/pricing")
    public ResponseEntity<HashMap<String, String>> DashboardResponse() {
         String res = "Hi There! I am coming from Pricing Service. This is some dummy text "+
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras eu mollis leo. " +
                "Pellentesque sit amet lacus id quam commodo egestas sit amet ac ante. Nam pellentesque " +
                "leo a ligula ornare volutpat. Praesent velit elit, auctor eu porta non, feugiat sit amet diam. " +
                "Proin eu turpis maximus, luctus est sed, venenatis ante. ";

         response = new HashMap<>();
         response.put("res", res);

         return new ResponseEntity<HashMap<String, String>>(response, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<HashMap<String, String>> hello() {
        String res = "Hello world";
        response = new HashMap<>();
        response.put("res", res);

        return new ResponseEntity<HashMap<String, String>>(response, HttpStatus.OK);
    }
}
