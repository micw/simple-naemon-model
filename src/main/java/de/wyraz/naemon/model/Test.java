package de.wyraz.naemon.model;

import java.io.File;
import java.io.FileInputStream;

import org.yaml.snakeyaml.Yaml;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        Yaml yaml=new Yaml();
        for (File file:new File("data/conf.d").listFiles())
        {
            if (file.isDirectory()||!file.getName().endsWith(".yml")) continue;
            
            try (FileInputStream in=new FileInputStream(file))
            {
                Fragment fragment=yaml.loadAs(in, Fragment.class);
                System.err.println(fragment);
            }
        }
        
    }
}
