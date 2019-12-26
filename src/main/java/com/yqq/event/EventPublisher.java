package com.yqq.event;

import com.yqq.entity.User;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service
public class EventPublisher  implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    public void nodify() {
        System.out.println("事件发布");
        User user = new User();
        user.setUserId("1111");
        user.setUserName("abc");
        applicationEventPublisher.publishEvent(new EventTest(user));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

}
