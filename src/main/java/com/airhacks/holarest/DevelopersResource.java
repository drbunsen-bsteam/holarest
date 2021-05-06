package com.airhacks.holarest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("developers")
public class DevelopersResource {

    @GET
    public String developers(){
        return "duchess, duke";
    }

    @GET
    @Path("{first}-{last}")
    public Developer developer(@PathParam("first") String first, @PathParam("last") String last){
//        return new Developer(first, last);
        return new Developer("easy", "peasy");
    }
}
