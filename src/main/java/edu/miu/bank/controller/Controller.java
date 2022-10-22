package edu.miu.bank.controller;

import edu.miu.bank.model.PaymentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bank")
public class Controller {

    @PostMapping("/payment")
    public String payment(@RequestBody PaymentRequest paymentRequest){
        return "Successfully Transferred $"+paymentRequest.getPrice()+" From your Bank account";
    }
}
