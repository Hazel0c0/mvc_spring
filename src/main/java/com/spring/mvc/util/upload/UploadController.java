package com.spring.mvc.util.upload;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@Slf4j
public class UploadController {

  // 첨부파일 저장 루트경로
  @Value("${file.upload.root-path}") //org.~~
  private String rootPath;
  @GetMapping("/upload-form")
  public String uploadForm(){
    return "upload/upload-form";
  }

  @PostMapping("/upload-file")
  public String uploadForm(
      @RequestParam("thumbnail") MultipartFile file){
    // file<- 이름 맞춰주거나 @RequestParam 로 설정해주기
//    MultipartFile file : 클라이언트가 보낸 첨부파일 받을 수 있음
    log.info("file name : {}", file.getOriginalFilename());
    log.info("file-size: {}KB",(double)file.getSize() /1024);
    log.info("file-type: {}",file.getContentType());

    File root = new File(rootPath);
    if(!root.exists()) root.mkdirs();//mkdir's' 경로에 모든 폴더 만들어줌

    // 2. 파일을 해당 경로에 저장
//    File uploadFile
//        = new File(rootPath, file.getOriginalFilename());
//
//    try {
//      file.transferTo(uploadFile);
//    } catch (IOException e) {
//      throw new RuntimeException(e);2111
//    }

    FileUtil.uploadFile(file, rootPath);

    return "redirect:/upload-form";
  }
}
