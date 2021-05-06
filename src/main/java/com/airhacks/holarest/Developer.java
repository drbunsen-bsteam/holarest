package com.airhacks.holarest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Developer {
    private String firstname;
    private String lastname;

    public Developer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }


}
