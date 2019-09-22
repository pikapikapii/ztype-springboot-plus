package com.example.demo.Service.ServerImpl;

import com.example.demo.Service.WordService;
import com.example.demo.repository.dao.WordDao;
import com.example.demo.repository.domain.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class WordServiceImpl implements WordService {
    @Autowired
    private WordDao wordDao;

    @Override
    public ArrayList<Word> getWord() {
        return wordDao.getAll();
    }

    @Override
    public int deleteArray(String ids) {
        return wordDao.deleteArray(ids);
    }
}
