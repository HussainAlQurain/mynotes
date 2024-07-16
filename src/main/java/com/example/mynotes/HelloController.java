package com.example.mynotes;
import com.example.mynotes.domain.NoteEntity;
import com.example.mynotes.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    NoteRepository noteRepository;

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @PostMapping("/notes")
    public NoteEntity addNote(@RequestBody NoteEntity noteEntity){
        return noteRepository.save(noteEntity);
    }
    @GetMapping("/notes")
    public List<NoteEntity> getNotes(){
        return noteRepository.findAll();
    }
}
