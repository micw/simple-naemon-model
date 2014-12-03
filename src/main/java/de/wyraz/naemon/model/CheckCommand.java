package de.wyraz.naemon.model;

import java.util.List;

public class CheckCommand
{
    public String name;
    public List<Arg> args;
    
    public enum ArgType
    {
        flag,
        string,
        integer,
    }
    
    public static class Arg
    {
        public String name;
        public boolean required;
        public String defaultValue;
        public String expand;
        public ArgType type;
    }

}
