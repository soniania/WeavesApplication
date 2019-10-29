package com.sonia.org.factory;

import com.sonia.org.domain.ResponseObject;

public class ResponseObjectFactory
{
    public static ResponseObject buildGenericResponseObject(String responseCode, String responseDescription)
    {
        return new ResponseObject(responseCode,responseDescription);
    }
}
