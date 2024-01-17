package com.vali.library.services;

import com.vali.library.entity.Author;
import com.vali.library.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public List getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    public Optional<Author> getAuthor(Long id) {
        return authorRepository.findById(id);
    }

    public void deleteAuthor(Author author) {
        authorRepository.delete(author);
    }
}
