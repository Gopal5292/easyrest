package com.easyrest.ro;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by thomas31 on 7/31/2018.
 */
@Data
public class ControllerConfigRO implements Serializable {
    private static final long serialVersionUID = 7109717933585119489L;

    private String className;
    private String context;

    private List<RequestMethodConfigRO>  requestMethodConfig;
}
