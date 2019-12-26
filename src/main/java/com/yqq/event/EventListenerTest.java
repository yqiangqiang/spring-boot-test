package com.yqq.event;

import com.yqq.entity.User;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class EventListenerTest implements ApplicationListener<EventTest> {
    @Override
    public void onApplicationEvent(EventTest eventTest) {
        User user = (User) eventTest.getSource();
        System.out.println("监听到事件，，得到source----Id:"+user.getUserId()+"  name:"+user.getUserName());
    }
}
