package com.company.summativeproject.Model;

public class Definition {
    private int id;
    private String word;
    private String definition;



    public Definition( int id,String word, String definition) {
        this.id = id;
        setWord(word);
        setDefinition(definition);
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

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
