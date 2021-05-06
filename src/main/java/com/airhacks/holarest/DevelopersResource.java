package com.airhacks.holarest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("developers")
public class DevelopersResource {

    @GET
    public String developer(){
        return "duchess, duke";
    }
}
