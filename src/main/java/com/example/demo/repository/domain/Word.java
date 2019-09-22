package com.example.demo.repository.domain;


public class Word {
    private int id;
    private String word;
    private String en;
    private String cn;

    @Override
    public String toString() {
        return "Word{" +
                "id=" + id +
                ", word='" + word + '\'' +
                ", en='" + en + '\'' +
                ", cn='" + cn + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public Word(int id, String word, String en, String cn) {
        this.id = id;
        this.word = word;
        this.en = en;
        this.cn = cn;
    }

    public Word() {
    }
}
