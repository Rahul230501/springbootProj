package com.resumeBuilder.template;

import com.resumeBuilder.model.User;

public interface ResumeTemplate {
    String generate(User user);
}
