package com.boda.xy;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class ParseURL{
    void main(){
        try{
            var aURL = new URI("http://docs.oracle.com/javase/tutorial/"
                    + "/index.html?name=networking#DOWNLOADING").toURL();
            IO.println("protocol = " + aURL.getProtocol());
            IO.println("authority = " + aURL.getAuthority());
            IO.println("host = " + aURL.getHost());
            IO.println("port = " + aURL.getPort());
            IO.println("path = " + aURL.getPath());
            IO.println("query = " + aURL.getQuery());
            IO.println("filename = " + aURL.getFile());
            IO.println("ref = " + aURL.getRef());
        }catch(MalformedURLException | URISyntaxException e){
            IO.println("URL不合法");
        }
    }
}


