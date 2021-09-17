package com.pereira.pcs.order;

import org.joda.time.DateTime;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/todaysdate")
@Produces(MediaType.APPLICATION_JSON)
public class OrderResource {

    @GET
    public String todaysDate() {
        System.out.println("Serving current date... ");
        return "{\"todaysdate\": " + new DateTime().toString("dd/MM/yyyy") + "}";
    }

}

