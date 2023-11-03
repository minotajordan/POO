/*
 * Añadir en el POM
   <dependencies>
        <dependency>
            <groupId>com.sparkjava</groupId>
            <artifactId>spark-core</artifactId>
            <version>2.9.4</version>
        </dependency>
    </dependencies>
 */


package com.mycompany.poo_maven;

import javax.swing.JOptionPane;
import static spark.Spark.*;

/**
 *
 * @author JMINOTA
 */
public class POO_MAVEN {

    public static void main(String[] args) {

        get("/test/:mensaje", (req, res) -> {
            msgbox(req.params(":mensaje"));
            return saludar();
        });
        
        
        get("/sumar/:a/:b", (req, res) -> {
            int parametroA = Integer.parseInt(req.params(":a"));
            int parametroB = Integer.parseInt(req.params(":b"));
           
            res.type("application/json");
            String paramA = "\"paramA\": "+parametroA+",";
            String paramB = "\"paramB\": "+parametroB;
            
            return "{\"result\":"+sum(parametroA, parametroB)  +"," +
                    paramA + paramB +"}";

            // return sum(parametroA, parametroB);
        });

    }
    
    private static int sum(int a, int b){
        return a+b;
    }
    
    /*
        Añadir RESTAR Y DIVIDIR
    */

    private static void msgbox(String s) {
        JOptionPane.showMessageDialog(null, s);
    }

    public static String saludar() {
        System.out.println("Solo te saludo cada que ejecutes la APP");
        return "Solo te saludo cada que ejecutes la APP";
    }
}
