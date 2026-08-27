package com.example.shareholder_management.shareholder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShareholderController {

    @GetMapping("/shareholders/new")
    public String showShareholderForm() {
        return "shareholder/form";
    }
}
