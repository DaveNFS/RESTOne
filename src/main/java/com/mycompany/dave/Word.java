package com.mycompany.dave;

import javax.xml.bind.annotation.XmlRootElement;
import com.mycompany.dave.*;


/**
 * A simple word object that contains a name and some definitions.
 * 
 * 
 */



@XmlRootElement
public class Word {
    private String name;
    private String definition;

    public Word() {

    }

    public Word(String name) {
        this.name = name;
    }

    public Word(String name, String definition) {
        this.name = name;
        this.definition = definition;
    }

    public String getName() {
        return name;
    }

    public Word setName(String name) {
        this.name = name;
        return this;
    }

    public String getDefinition() {
        return definition;
    }

    public Word setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
}
