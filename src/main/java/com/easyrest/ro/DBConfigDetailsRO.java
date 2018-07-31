package com.easyrest.ro;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by thomas31 on 7/31/2018.
 */

@Data
public class DBConfigDetailsRO implements Serializable{

    private static final long serialVersionUID = -1216227282635164049L;

    private String url;
    private String uName;
    private String password;
}
