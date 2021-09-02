package app;

import io.jooby.annotations.*;
import io.jooby.exception.*;

public class Soma{

        @Path("/soma/{a}/{b}")
        @GET
        public String s(@PathParam String a, @PathParam Stringb){
            try{
                double s = Double.parseDouble(a) + Double.parseDouble (b);

                if(a < 0){
                    trow new BadRequestException(String.format("Parâmetro inválido:\%s", a));
                    if(b < 0){
                        trow new BadRequestException(String.format("Parâmetro inválido:\%s", b));
                    }
                }

                if(b < 0){
                    trow new BadRequestException(String.format("Parâmetro inválido:\%s", b));
                    if(a < 0){
                        trow new BadRequestException(String.format("Parâmetro inválido:\%s", a));
                    }
                }

                return String.format("%.2f",s);
            } catch(NumberException nfe){
                trow new BadRequestException(String.format("Parâmetro inválido:\%s\%s",a, b));

            }
            
        }

}