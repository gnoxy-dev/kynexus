/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gnoxy.kynexus;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.json.JsonValue;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author gnoxy <dev@gnoxy.com>
 */
public class KGatewayIT {
    
    String urlBase;
    
    public KGatewayIT() throws IOException {
        InputStream url = getClass().getClassLoader().getResourceAsStream("targetURL.txt");
        urlBase = IOUtils.toString(url).trim();
        System.out.println("Integration Test: urlBase: " + urlBase);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getHostInfoJSONList method, of class KServer.
     */
    @Test
    public void testGetHostInfoJSONList() {
        System.out.println("Integration Test: gateway/getHostInfoJSONList");
        Client client = ClientBuilder.newClient();
        List<JsonValue> hostInfoJSON = client.target(urlBase+"gateway/getHostInfo")
                 .request()
                 .get(ArrayList.class);
        String expResult = "gateway-hostname";
        String rawResult = hostInfoJSON.toString();
        System.out.println("Raw Result: " + rawResult);
        String result = rawResult.substring(2, 18);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
