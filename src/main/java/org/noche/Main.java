package org.noche;

import java.io.IOException;

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
