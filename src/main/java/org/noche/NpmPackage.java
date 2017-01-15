package org.noche;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by artiom.petrov
 */
public class NpmPackage {

    @SerializedName("dist")
    private HashMap<String, String> dist = new HashMap<String, String>();

    @SerializedName("version")
    private String version;

    @SerializedName("name")
    private String name;

    public HashMap<String, String> getDist() {
        return dist;
    }

    public void setDist(HashMap<String, String> dist) {
        this.dist = dist;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
