package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

@Controller
public class HomeController {

    private static final String UPLOAD ="S:\\images";

    @RequestMapping("/")
    public String  getFirstPage(){
        return "main-page";
    }

    @RequestMapping(value="imageInsert",method= RequestMethod.POST)
    public String dbInserted(@RequestParam("image") CommonsMultipartFile file, @RequestParam("username")String theUsername, HttpSession session) throws Exception{

        //System.out.println(part.toString());
        System.out.println(theUsername);
        ServletContext context = session.getServletContext();
        //String path = context.getRealPath(UPLOAD);
        String filename = file.getOriginalFilename();

        System.out.println(UPLOAD+" "+filename);

        byte[] bytes = file.getBytes();
        BufferedOutputStream stream =new BufferedOutputStream(new FileOutputStream(
                new File(UPLOAD + File.separator + filename)));
        stream.write(bytes);
        stream.flush();
        stream.close();

        return "show-image";
    }
}
