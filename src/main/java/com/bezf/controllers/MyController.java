package com.bezf.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;

@RestController
public class MyController {
    @GetMapping("/")
    public String hello() {
        return "Hello, user!";
    }

    @Secured({"ROLE_READ"})
    @GetMapping("/read")
    public String read() {
        return "You have the read role";
    }

    @RolesAllowed("ROLE_WRITE")
    @GetMapping("/write")
    public String write() {
        return "You have the write role";
    }

    @PreAuthorize("#username==authentication.principal.username")
    @GetMapping("/goodbye")
    public String goodbye(@RequestParam("username") String username) {
        return "Goodbye, " + username;
    }

    @PreAuthorize("hasRole('WRITE') or hasRole('DELETE')")
    @GetMapping("/delete")
    public String delete() {
        return "You have the delete role";
    }
}
