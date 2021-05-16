package at.Engelmailer.SLM.Demo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Locale;

@Path("/api/rot13/")
public class Controller {
    public static int delta = 13;

    @GET
    @Path("/{sourceString}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getRot13StringFromSourceString(@PathParam("sourceString") String sourceString){
        StringBuffer returnValue = new StringBuffer(sourceString);
        for(int i = 0; i<returnValue.length();i++) {
            int c = returnValue.charAt(i);
            if(c >= 'A' && c <= 'Z') {
                returnValue.setCharAt(i, (char)(remove26IfHigher(c - 'A' + delta) + 'A'));
            } else if(c >= 'a' && c <= 'z') {
                returnValue.setCharAt(i, (char)(remove26IfHigher(c - 'a' + delta) + 'a'));
            }
        }
        return returnValue.toString();
    }

    @POST
    @Path("/change/{newDelta}")
    @Produces(MediaType.TEXT_PLAIN)
    public int setDelta(@PathParam("newDelta") int i){
        delta = i;

        return delta;
    }


    @DELETE
    public static int reset() {
        delta=13;
        return delta;
    }


    private int remove26IfHigher(int c) {
        if(c > 26) {
            c = c - 26;
        }
        return c;
    }
}
