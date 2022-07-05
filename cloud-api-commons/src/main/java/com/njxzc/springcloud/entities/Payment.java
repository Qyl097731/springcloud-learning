package com.njxzc.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * projectName:  cloud2022_demo01
 * packageName: com.njxzc.springcloud.entities
 * date: 2022-05-29 23:50
 * copyright(c) 2020 南晓18卓工 邱依良
 *
 * @author 邱依良
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
