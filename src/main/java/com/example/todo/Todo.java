package com.example.todo;

public record Todo(Integer userId, Integer id, String title, Boolean completed) {
}
