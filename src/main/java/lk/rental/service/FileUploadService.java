package lk.rental.service;


import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Part;

public interface FileUploadService {
    void uploadFile(@RequestPart("myFile") Part myPart);
    void uploadFileWithSpringWay(@RequestPart("myFile") MultipartFile myFile);
    void getAllImagesFromDatabase();
}
