package com.dangjogvara.todoapp.model;


import javax.persistence.*;
import java.util.Objects;

@Entity
public class Todo {
    @Id
    @GeneratedValue
    private Long id;
    private String text;
    @ManyToOne
    private Author author;

    public Todo() {
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return Objects.equals(id, todo.id) && Objects.equals(text, todo.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text);
    }

    @Override
    public String toString() {
        return "Todo{" +
                "text='" + text + '\'' +
                '}';
    }
}
