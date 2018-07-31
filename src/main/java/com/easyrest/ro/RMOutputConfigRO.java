package com.easyrest.ro;

import com.easyrest.enm.RequestTypeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by thomas31 on 7/31/2018.
 */
@Data
public class RMOutputConfigRO implements Serializable {
    private static final long serialVersionUID = 8899314223528206854L;

    private RequestTypeEnum requestType;
}
