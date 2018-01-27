/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gnoxy.kynexus;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author gnoxy <dev@gnoxy.com>
 */
@ApplicationPath("rest") // the 'rest' address is mapped to the REST services
public class RestApp extends Application{ // a javax.ws.rs.core.Application must be extended
    
}



