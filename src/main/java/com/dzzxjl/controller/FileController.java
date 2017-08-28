package com.dzzxjl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;

@Controller
public class FileController {
    @RequestMapping("/uploadfile")
    public void savefile(
            @RequestParam("file") MultipartFile file){
        try {
            System.out.println("mark");
            System.out.println(file.getName());
            System.out.println(file.getSize());
//            System.out.println(file.);
            file.transferTo(new File("classpath:" + file.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
