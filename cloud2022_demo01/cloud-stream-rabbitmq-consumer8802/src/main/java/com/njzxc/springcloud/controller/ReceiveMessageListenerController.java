package com.njzxc.springcloud.controller;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

/**
 * @author qyl
 * @program ReceiveMessageListenerController.java
 * @Description TODO
 * @createTime 2022-07-05 13:59
 */
@Component
@EnableBinding(Sink.class)
public class ReceiveMessageListenerController {

}
