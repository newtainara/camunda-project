package com.example.workflow.call;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.springframework.stereotype.Service;

@Service
public class SendMessageCall {

  public void sendMessage() {
      try {
        URL url = new URL("https://sms.comtele.com.br/api/v2/send");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("auth-key", "1a8702fd-80f0-4b28-a2bd-9387356a089e");
        connection.setRequestProperty("content-type", "application/json");
        connection.setDoOutput(true);

        String data = "{\"Sender\":\"12\",\"Receivers\":\"5585988325636\",\"Content\":\"BORA garçon q o cae chegou\"}";

        try (OutputStream os = connection.getOutputStream()) {
          byte[] input = data.getBytes("utf-8");
          os.write(input, 0, input.length);
        }

        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);

        connection.disconnect();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
