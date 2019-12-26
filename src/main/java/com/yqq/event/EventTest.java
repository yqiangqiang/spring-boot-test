package com.yqq.event;

import com.yqq.entity.User;
import org.springframework.context.ApplicationEvent;

public class EventTest extends ApplicationEvent {

    public EventTest(User user) {
        super(user);
    }

}
