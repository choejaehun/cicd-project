package com.cicd.author.controller;

import com.cicd.author.dto.AuthorAll;
import com.cicd.author.mapper.MapStructMapper;
import com.cicd.author.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * packageName : com.cicd.author.controller
 * fileName    : AuthorController
 * author      : jaejun
 * date        : 2024-10-25
 * description :
 * ===================================================
 * DATE             AUTHOR              NOTE
 * ---------------------------------------------------
 * 2024-10-25         jaejun
 */

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final MapStructMapper mapStructMapper;

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorController(
       MapStructMapper mapStructMapper,
       AuthorRepository authorRepository
    ) {
        this.mapStructMapper = mapStructMapper;
        this.authorRepository = authorRepository;
    }

    @GetMapping()
    public ResponseEntity<List<AuthorAll>> getAll() {
        return new ResponseEntity<>(
                mapStructMapper.authorsToAuthorAllList(
                        authorRepository.findAll()
                ),
                HttpStatus.OK
        );
    }
}
