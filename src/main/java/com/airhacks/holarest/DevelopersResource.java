package com.airhacks.holarest;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;

@Path("developers")
public class DevelopersResource {

    @GET
    public JsonArray developers(){
        JsonObject jsonObject = Json.createObjectBuilder().add("firstname", "dutches").build();
        return Json.createArrayBuilder().add(jsonObject).build();
    }

    @GET
    @Path("{first}-{last}")
    public Developer developer(@PathParam("first") String first, @PathParam("last") String last){
        return new Developer(first, last);
    }
}
