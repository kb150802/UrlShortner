package com.app.UrlShortener.controller;


import com.app.UrlShortener.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/shortenedUrls")
    public ResponseEntity<?> getAllUrls(@AuthenticationPrincipal UserDetails userDetails) {
        return userService.getAllUrls(userDetails.getUsername());
    }
}
