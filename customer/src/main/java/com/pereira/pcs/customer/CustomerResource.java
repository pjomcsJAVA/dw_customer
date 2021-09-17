package com.pereira.pcs.customer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customer")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {

    ObjectMapper MAPPER = new ObjectMapper();

    @GET
    @Path("{id}")
    public String getCustomerById(@PathParam("id") final String id) {
        System.out.println("Serving customer with id: " + id);
        try {
            return MAPPER.writeValueAsString(CustomerDatabase.CUSTOMERS.get(id)) ;
        } catch (JsonProcessingException e) {
            return StringUtils.EMPTY;
        }
    }
}

