package org.noche;

import com.eclipsesource.v8.NodeJS;
import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by artiom.petrov
 */
public class Main {

    public static void main(String[] args) throws IOException {
//        URL url = new URL("http://registry.npmjs.org/mime/%3E1.0.0%20%3C1.2.10");
//        InputStreamReader reader = new InputStreamReader(url.openStream());
//        NpmPackage npmPackage = new Gson().fromJson(reader, NpmPackage.class);
//        System.out.println(npmPackage.getDist().get("shasum"));
        String token = "https://cve.mitre|http://nvd.com/CVE-2013-1834";
        String replace = token.replace("|", "--");
        System.out.println(replace);
    }

}
