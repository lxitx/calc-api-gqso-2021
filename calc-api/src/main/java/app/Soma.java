package app;

import io.jooby.annotations.*;
import io.jooby.exception.*;

public class Soma{


    @Path("/soma/{a}/{b}")
    @GET
    public String s(@PathParam String a, @PathParam String b){
        double x = Math.sqrt(Double.parseDouble(a));
        double y = Math.sqrt(Double.parseDouble(b));

        try{
            double s = x + y;

            return String.format("%.2f",s);

        } catch(NumberFormatException nfe){
            throw new BadRequestException(String.format("Parâmetro inválido"));
        }    
    }
}