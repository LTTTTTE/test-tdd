package com.juyeong.resttodo.model;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TodoTest {
    @Test
    public void todoCreated(){
        Todo todo = Todo.builder()
                .name("할일")
                .desc("내용")
                .status(Status.READY)
                .build();
        assertThat(todo).isNotNull();
    }
}