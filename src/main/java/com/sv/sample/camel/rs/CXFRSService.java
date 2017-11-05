package com.sv.sample.camel.rs;

import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by shaiverm on 05-Nov-2017
 * Activates one Builder at a time to test app
 * Access as http://localhost:8080/services/svc/ok
 * CXF Servlet by default mapped with 'services' path
 */
@Path("/svc/")
@Component
@Produces(MediaType.TEXT_PLAIN)
public class CXFRSService {

    @Path("/say")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return "Hello World";
    }

    @Path("/ok")
    @GET
    public Response sayOk() {
        return Response.status(200).entity("ok").build();
    }
}
