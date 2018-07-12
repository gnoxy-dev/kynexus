/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gnoxy.kynexus;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author gnoxy <dev@gnoxy.com>
 */

@Provider  // @Provider tells the server that this is a REST class
@Path("services") // define the path for this class: [server]/services
public class KServer {
        
    @Path("getHostInfo")
    @GET
    @Produces("application/json")
    public List<JsonValue> getHostInfoJSONList(){
        KEnv kenv = KEnv.getInstance();
        InetAddress ip;
        String hostname = "Unknown";
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
        }
        catch (UnknownHostException e) {
            System.out.println("Caught exception:");
        }
        JsonArray array = Json.createArrayBuilder()
                .add(Json.createObjectBuilder()
                    .add("hostname", hostname)
                    .add("version", kenv.getVersion()))
                .build();

        return array; 
                
    }
}
