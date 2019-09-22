package com.example.demo.repository.dao;

import com.example.demo.repository.domain.Word;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public interface WordDao {
    public ArrayList<Word> getAll();
    public int deleteArray(String ids);
}
