package servlet;

import java.io.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.util.List;
import java.util.LinkedList;
import java.net.URL;

import etu1769.framework.annotation.MyAnnotation;
import etu1769.framework.util.AnnotationScanner;
import etu1769.framework.util.Mapping;

public class FrontServlet extends HttpServlet {
    HashMap<String,Mapping> MappingUrls = new HashMap<>();

    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.getWriter().println("ok");
    }
}