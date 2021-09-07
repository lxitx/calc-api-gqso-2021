package app;

import io.jooby.annotations.*;

public class Soma{

        @Path("/soma/{a}/{b}")
        @GET
        public String s(@PathParam String a, @PathParam String b){
            double s = Double.parseDouble(a) + Double.parseDouble (b);
            return String.valueOf(s);
        }

}