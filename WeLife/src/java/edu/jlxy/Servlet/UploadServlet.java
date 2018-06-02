/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.Servlet;

import edu.jlxy.Module.entity.FileEntity;
import edu.jlxy.Module.table.impl.FileImpl;
import edu.jlxy.util.SeprateSrc;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author 16221
 */
public class UploadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            DiskFileItemFactory factory = new DiskFileItemFactory(10 * 1024, new File("e:/temp"));

            ServletFileUpload upload = new ServletFileUpload(factory);

            upload.setHeaderEncoding("utf-8");

            List<FileItem> list = upload.parseRequest(request);

            FileImpl impl = new FileImpl();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

            List<FileEntity> fileList = new ArrayList<FileEntity>();

            if (list != null) {
                FileEntity fileEntity = null;

                for (FileItem item : list) {
                    if (item.isFormField()) {

                        fileEntity.setInfo(item.getString("utf-8"));
                        fileList.add(fileEntity);

                        impl.saveFile(fileEntity, null, null);   //======================================================================================
                    } else {
                        fileEntity = new FileEntity();

                        String uuid = UUID.randomUUID().toString();
                        String fileName = item.getName();

                        fileName = uuid + fileName.substring(fileName.lastIndexOf("."));

                        // String baseDir = "e:/photo";
                        // String baseDir = this.getServletContext().getRealPath("/upload");
                        String baseDir = "E:/Netbeanscode/WeLife/web/uploadimages";

                        String subDir = makeDirectory(fileName);

                        String finalDir = baseDir + "/" + subDir;
// e:/tomcat6/webapps/day22/upload/10/8

                        long size = item.getSize();
                        String contentType = item.getContentType();
                        FileUtils.copyInputStreamToFile(item.getInputStream(), new File(finalDir + fileName));

                        item.delete();

                        fileEntity.setName(fileName);

                        String sizeStr = "";
                        if (size >= 1024 && size < 1024 * 1024) {
                            sizeStr = (size / 1024.0) + "KB";
                        } else if (size > 1024 * 1024 && size <= 1024 * 1024 * 1024) {
                            sizeStr = (size / (1024 * 1024.0)) + "MB";
                        } else if (size >= 1024 * 1024 * 1024) {
                            sizeStr = (size / (1024 * 1024.0 * 1024)) + "GB";
                        } else {
                            sizeStr = size + "B";
                        }
                        fileEntity.setSize(sizeStr);
                        fileEntity.setType(contentType);
                        fileEntity.setAddTime(sdf.format(new Date()));

                        //在这之前需要对路径进行 整形
                        SeprateSrc seprateSrc = new SeprateSrc();
                        String realpath = baseDir + "/" + subDir + fileName;
                        String[] list1 = seprateSrc.seprate(realpath);
                        String relativepath = seprateSrc.polymerize(list1);

                        fileEntity.setFile_path(relativepath);

                        PrintWriter pw = response.getWriter();

//                        pw.write(baseDir);
//                        
//                        pw.write("the name is  " + fileEntity.getName() + "<br/>");
//                        pw.write("the size is " + fileEntity.getSize()+ "<br/>");
//                        pw.write("the type is  " + fileEntity.getType()+ "<br/>");
//                        pw.write("the addTime is " + fileEntity.getAddTime()+ "<br/>");
//                        pw.write("the file path is " + fileEntity.getFile_path()+ "<br/>");
//                        pw.write("the finalDir is " + finalDir+ "<br/>");
//                        pw.write("the file name is " + fileName+ "<br/>");
                        System.out.println("the name is  " + fileEntity.getName());
                        System.out.println("the size is " + fileEntity.getSize());
                        System.out.println("the type is  " + fileEntity.getType());
                        System.out.println("the addTime is " + fileEntity.getAddTime());
                        System.out.println("the file path is " + fileEntity.getFile_path());
                        System.out.println("the finalDir is " + finalDir);
                        System.out.println("the file name is " + fileName);
                    }
                }

                request.setAttribute("fileList", fileList);
              //  request.getRequestDispatcher("/PersonalPage.jsp").forward(request, response);
              response.sendRedirect("http://localhost:8888/WeLife/PersonalPage.jsp");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private String makeDirectory(String fileName) {

        int code = fileName.hashCode();

        int first = code & 0xF;

        int second = code & (0xF >> 1);
        return first + "/" + second + "/";
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
