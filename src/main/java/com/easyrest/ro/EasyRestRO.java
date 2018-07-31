package com.easyrest.ro;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by thomas31 on 7/31/2018.
 */
@Data
public class EasyRestRO implements Serializable {

    private static final long serialVersionUID = -1449215427225741299L;

    private static String outLocation;
    private static String inLocation;

    private DBConfigDetailsRO dbConfig;


}
