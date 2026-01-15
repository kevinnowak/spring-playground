package com.github.kevinnowak.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(HelloController.class)
class HelloControllerMockMVCTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void autowiringWorked() {
        assertNotNull(mvc);
    }

    @Test
    void testHelloWithoutName() throws Exception {
        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(view().name("welcome"))
                .andExpect(model().attribute("user", "world"));
    }

    @Test
    void testHelloWithName() throws Exception {
        mvc.perform(get("/hello?name={name}", "Dolly"))
                .andExpect(status().isOk())
                .andExpect(view().name("welcome"))
                .andExpect(model().attribute("user", "Dolly"));
    }
}
