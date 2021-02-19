package edu.eci.escuelaing.arept1;

import edu.eci.escuelaing.arept1.components.Calculator;
import static spark.Spark.*;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        port(getPort());
        get("/trigonometriCalculation",(req,res)->{
        	String number = req.queryParams("number");            
            String option = req.queryParams("operation");
            JSONObject jsonObject = new JSONObject();
            double value = Calculator.trigonometriCalculation(option,number);
            jsonObject.put("value",value);
            jsonObject.put("operation",option);            
            return jsonObject;

        });

    }


    /**
     * This function see the environment variable PORT if this exist that is returned if not the function return 1234
     * @return int that is the port that use Spark
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 1234;
    }
}
