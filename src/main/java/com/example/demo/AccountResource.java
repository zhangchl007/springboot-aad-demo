package com.example.demo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AccountResource {

    @GetMapping("/approle")
    @ResponseBody
    @PreAuthorize("hasRole('APPROLE_HR')")
    public Authentication getAccount() {
        return SecurityContextHolder.getContext().getAuthentication();
    }
}
