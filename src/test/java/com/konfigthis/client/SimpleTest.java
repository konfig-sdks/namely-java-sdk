package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://your-company.namely.com/api/v1";
        
        configuration.authorization  = "YOUR API KEY";
        Namely client = new Namely(configuration);
        assertNotNull(client);
    }
}
