package com.codurance;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AppShould {

    @Test
    public void
    return_hello_message() {
        App app = new App();
        assertThat(app.hello(), is("hello"));
    }
}
