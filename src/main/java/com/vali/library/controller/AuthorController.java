package com.vali.library.controller;

import com.vali.library.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorController {

    @Autowired
    AuthorRepository authorRepository;

}
