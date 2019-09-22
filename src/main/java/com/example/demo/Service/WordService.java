package com.example.demo.Service;

import com.example.demo.repository.domain.Word;

import java.util.ArrayList;

public interface WordService {
    public ArrayList<Word> getWord();
    public int deleteArray(String ids);
}
