package com.njxzc.springcloud.service.impl;

import com.njxzc.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.service.impl
 * date: 2022-07-05 22:15
 * copyright(c) 2020 南晓18卓工 邱依良
 *
 * @author 邱依良
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {
    @Resource
    private MessageChannel output;

    @Override
    public String send()
    {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("***serial: "+serial);

        return serial;
    }
}
