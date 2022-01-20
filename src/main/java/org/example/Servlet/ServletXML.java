package org.example.Servlet;

import org.example.Difference;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;

@WebServlet("/result.xml")
public class ServletXML extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) {
        resp.setContentType("text/xml;charset=UTF-8");
        try {
            Difference request = (Difference) req.getSession().getAttribute("Difference");
            if (request != null) {
                Marshaller marshaller = JAXBContext.newInstance(Difference.class).createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
                marshaller.marshal(request,  new File("C:\\Users\\Marina\\IdeaProjects\\labb3\\output\\result.xml"));
                resp.sendRedirect("index.html");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
