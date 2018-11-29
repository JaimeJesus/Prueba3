/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secretaria.services;

import capa.dao.Paciente;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jaime
 */
public class registro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
          int rut = Integer.parseInt(request.getParameter("rut"));
            String nombre = request.getParameter("name");
            int edad = Integer.parseInt(request.getParameter("edad"));
            int fecha = Integer.parseInt(request.getParameter("fecha"));
            int telefono = Integer.parseInt(request.getParameter("telefono"));
            int id_tipotratamiento = Integer.parseInt(request.getParameter("ID_TIPOENFERMEDAD"));
            int id_doctor = Integer.parseInt(request.getParameter("ID_DOCTOR"));
           
            
            
       
            Paciente par = new Paciente();
            par.setRut(rut);
            par.setNombre(nombre);
            par.setEdad(edad);
            par.setFecha(fecha);
            par.setTelefono(telefono);
            par.setId_tipoenfermedad(id_tipotratamiento);
            par.setId_doctor(id_doctor);
           
             try{par.create(par);} catch(Exception ex)
             { Logger.getLogger(registro.class.getName()).log(Level.SEVERE, null, ex);}
             request.getRequestDispatcher("pages/agregar.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
