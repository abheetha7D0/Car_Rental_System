package lk.rental.controller;

import lk.rental.service.BookingService;
import lk.rental.service.FileUploadService;
import lk.rental.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Part;

@RestController
@RequestMapping("/upload")
@CrossOrigin
public class FileUploadController {
    @Autowired
    FileUploadService fileUploadService;
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil uploadFileWithSpringWay(@RequestPart("myFile") MultipartFile myFile){
        return new ResponseUtil(200,"OK","");
    }
}
