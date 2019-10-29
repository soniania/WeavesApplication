package com.sonia.org.factory;

import com.sonia.org.domain.Admin;

public class AdminFactory
{
    public static Admin getAdmin(String name, String surname, String Id)
    {
        return new Admin.Builder()
                .name(name)
                .surname(surname)
                .Id(Id)
                .build();


    }

}

