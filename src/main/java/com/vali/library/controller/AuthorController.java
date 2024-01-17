package com.vali.library.controller;

import com.vali.library.entity.Author;
import com.vali.library.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @GetMapping
    public List getAllAuthors() {
        authorService.getAllAuthors();
    }

    @GetMapping()
    public Author getAuthor() {
        authorService.getAuthor()
    }


}
