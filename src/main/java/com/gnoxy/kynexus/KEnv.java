/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gnoxy.kynexus;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;

import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 *
 * @author pmaher
 */
public class KEnv {

    private static String version;

    private static KEnv instance;

    private KEnv() {
        MavenXpp3Reader reader = new MavenXpp3Reader();
        Model model;
        try {
            if ((new File("pom.xml")).exists()) {
                model = reader.read(new FileReader("pom.xml"));
            } else {
                model = reader.read(
                        new InputStreamReader(
                                KEnv.class.getResourceAsStream(
                                        "/META-INF/maven/com.gnoxy/kynexus/pom.xml"
                                )
                        )
                );
            }
            version = model.getVersion();
        } catch (Exception e) {
            version = "unknown";
        }

    }

    public static KEnv getInstance() {
        if (instance == null) {
            instance = new KEnv();
        }
        return instance;
    }

    public String getVersion() {
        if (version == null) {
            return "null";
        } else {
            return version;
        }
    }
}
