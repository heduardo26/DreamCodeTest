package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Category {
    private String name;
    private List<String>keyWords;
    private List<Category> children;
    private Category parent;

    public String getName() {
        return name;
    }

    public List<Category> getChildren() {
        return children;
    }

    public Category getParent() {
        return parent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKeyWords(List<String> keyWords) {
        this.keyWords = keyWords;
    }

    public void setChildren(List<Category> children) {
        this.children = children;
    }

    public void addChild(Category child){
        children.add(child);
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    /** Constructors */
    public Category(String name, List<String> keyWords, List<Category> children, Category parent) {
        this.name = name;
        this.keyWords = keyWords;
        this.children = children;
        this.parent = parent;
    }

    public Category(String name, Category parent) {
        this.name = name;
        this.parent = parent;
        this.keyWords = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    /**
     * Get the keywords of a node
     * @return
     */
    public List<String> getKeyWords() {
        if(keyWords.isEmpty() && !Objects.isNull(parent)){
            return parent .getKeyWords();
        }
        return keyWords;
    }

    /**
     * Get the level of a node
     * @return level
     */
    public int getLevel(){
        if(Objects.isNull(parent)){// is the root
            return 0;
        }
        return parent.getLevel() +1;
    }





}


