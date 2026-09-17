package com.example.demo.note;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/notes")
@RequiredArgsConstructor
public class NoteController {

    private final NoteRepository noteRepository;

    @RequestMapping
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

}
