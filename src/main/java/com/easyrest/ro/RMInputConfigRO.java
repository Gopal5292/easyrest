package com.easyrest.ro;

import com.easyrest.enm.RequestTypeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by thomas31 on 7/31/2018.
 */
@Data
public class RMInputConfigRO implements Serializable {
    private static final long serialVersionUID = 1958031117544702158L;

    private String name;
    private RequestTypeEnum requestType;
    private Object defaultValue;
}
