package com.example.demodomev2

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {
    @GetMapping(
        value = [""]
    )
    fun getProduct(): String {
        return "AK"
    }
}