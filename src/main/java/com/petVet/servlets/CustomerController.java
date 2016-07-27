package com.petVet.servlets;

import com.petVet.entities.Owner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class CustomerController extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String uri = request.getRequestURI();
        System.out.println("Requested URI: "+uri);

        String jspName = uri.substring(uri.lastIndexOf('/')+1);
        System.out.println("JSP Name: "+jspName);

        if(jspName.equalsIgnoreCase("viewAllPets")) {
            // TODO: do something here
        } else if(jspName.equalsIgnoreCase("viewPet")) {
            // TODO: do something here
        } else if(jspName.equalsIgnoreCase("addNewPet")) {
            // TODO: do something here
        } else if(jspName.equalsIgnoreCase("editPet")) {
            // TODO: do something here
        } else if(jspName.equalsIgnoreCase("viewAllOwners")) {
            // TODO: do something here
        } else if(jspName.equalsIgnoreCase("viewOwner")) {
            // TODO: do something here
        } else if(jspName.equalsIgnoreCase("addNewOwner")) {
            // TODO: do something here
        } else if(jspName.equalsIgnoreCase("editOwner")) {
            // TODO: do something here
        }

        RequestDispatcher view = request.getRequestDispatcher("/customers/"+jspName+".jsp");
        view.forward(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doPost(request,response);
    }
}
