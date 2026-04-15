package com.boda.xy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SuppressWarnings(value={"deprecation"})
public class SuppressWarningDemo implements Serializable {
    void main() {
        Date d = new Date(2017,10,30);
        System.out.println(d.getMonth());
    }
}


