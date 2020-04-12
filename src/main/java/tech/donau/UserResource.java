package tech.donau;

import io.quarkus.security.identity.SecurityIdentity;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("api")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    @Inject
    SecurityIdentity identity;

    @GET
    @Path("/users")
    public SecurityIdentity getUserInfo() {
        return identity;
    }


    @GET
    @Path("/admin")
    public String getAdminSecret() {
        return "ADMIN IS GOD";
    }
}
