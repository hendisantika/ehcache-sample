package com.hendisantika.ehcache;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 8/14/17
 * Time: 8:41 AM
 * To change this template use File | Settings | File Templates.
 */
@Data
public class SimpleDto implements Serializable{
    private static final long serialVersionUID = 5347971302107348535L;

    private String name;

    private String mail;
}
