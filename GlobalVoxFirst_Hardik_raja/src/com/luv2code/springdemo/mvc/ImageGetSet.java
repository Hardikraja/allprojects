package com.luv2code.springdemo.mvc;

import org.springframework.web.multipart.commons.CommonsMultipartFile;
import sun.swing.FilePane;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class ImageGetSet {


    public static String  setImageToRepo(CommonsMultipartFile file, HttpSession session) throws Exception{
        String UPLOAD ="C:"+File.separator+"Users"+File.separator+"HARDIK"+File.separator+"IdeaProjects"+File.separator+"GlobalVoxFirst"+File.separator+"out"+File.separator+"artifacts"+File.separator+"web_war_exploded"+File.separator+"images";
        ServletContext context = session.getServletContext();
        String path1 =context.getRealPath("");
        System.out.println("**************"+path1);

        System.out.println(UPLOAD);
        String filename = file.getOriginalFilename();
        String fileUploadedName = UPLOAD + File.separator + filename;
        System.out.println(UPLOAD+" "+filename);
        System.out.println(fileUploadedName);
        byte[] bytes = file.getBytes();
        BufferedOutputStream stream =new BufferedOutputStream(new FileOutputStream(
        new File(fileUploadedName)));
        stream.write(bytes);
        stream.flush();
        stream.close();

        /*File dest = new File(UPLOAD);
        file.transferTo(dest);
*/
       /* fileUploadedName = "C:\\\\Users\\\\HARDIK\\\\IdeaProjects\\\\GlobalVoxFirst\\\\out\\\\artifacts\\\\web_war_exploded\\\\images\\\\"+filename;
        System.out.println("C:\\\\Users\\\\HARDIK\\\\IdeaProjects\\\\GlobalVoxFirst\\\\out\\\\artifacts\\\\web_war_exploded\\\\images\\\\"+filename);*/
        //return fileUploadedName;
        return filename;
    }
}
