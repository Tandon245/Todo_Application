package com.example.todo.service;

import com.example.todo.model.Todo;

import java.util.List;

public interface ITodoService {
    public List<Todo> findAll();
    public  void addTodo(Todo todo);
    public Todo findByTitle(String title);



    public  void deleteById(int id);


    public  Todo findById  (int id);
    public void updateTodoById(int id,Todo newtodo);
}
