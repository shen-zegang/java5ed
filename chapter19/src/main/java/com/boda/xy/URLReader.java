package com.boda.xy;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

public class URLReader{
    void main() {
        try {
            var url = new URI("http://www.baidu.com").toURL();

            var in = new BufferedReader(
                    new InputStreamReader(url.openStream()));
            var out = new FileWriter("index.html");
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                out.write(inputLine);
            }
            in.close();
            out.close();
        } catch (URISyntaxException | IOException e) {
            IO.println(e);
        }
    }
}


