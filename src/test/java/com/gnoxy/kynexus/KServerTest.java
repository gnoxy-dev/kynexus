/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gnoxy.kynexus;

import java.util.List;
import javax.json.JsonValue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gnoxy <dev@gnoxy.com>
 */
public class KServerTest {
    
    public KServerTest() {
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
        System.out.println("Testing: getHostInfoJSONList");
        KServer instance = new KServer();
        List<JsonValue> hostInfoJSON = instance.getHostInfoJSONList();
        
        String expResult = "hostname";
        String rawResult = hostInfoJSON.toString();
        System.out.println("Raw Result: " + rawResult);
        String result = rawResult.substring(3, 11);
        assertEquals(expResult, result);
    }
    
}
