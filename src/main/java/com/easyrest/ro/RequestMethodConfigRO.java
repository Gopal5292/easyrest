package com.easyrest.ro;

import com.easyrest.enm.RequestMethodEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by thomas31 on 7/31/2018.
 */
@Data
public class RequestMethodConfigRO implements Serializable {

    private static final long serialVersionUID = -3817954244229382716L;

    private String name;
    private String url;

    private RequestMethodEnum requestMethod;

    private List<RMInputConfigRO> inputConfig;
    private RMOutputConfigRO outputConfig;
}
