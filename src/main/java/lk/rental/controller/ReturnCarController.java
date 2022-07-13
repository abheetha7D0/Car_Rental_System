package lk.rental.controller;

import lk.rental.dto.ReturnCarDTO;
import lk.rental.service.ReturnCarService;
import lk.rental.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
@CrossOrigin
public class ReturnCarController {
    @Autowired
    ReturnCarService returnCarService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllReturnCar(){
        return new ResponseUtil(200,"OK",returnCarService.getAllReturnCars());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveReturnCar(@ModelAttribute ReturnCarDTO returnCarDTO){
        returnCarService.saveReturnCar(returnCarDTO);
        return new ResponseUtil(200,"save",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateReturnCar(@RequestBody ReturnCarDTO returnCarDTO){
        returnCarService.updateReturnCar(returnCarDTO);
        return new ResponseUtil(200,"updated",null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteReturnCar(@RequestParam String id){
        returnCarService.deleteReturnCar(id);
        return new ResponseUtil(200,"Deleted",null);
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchReturnCar(@PathVariable String id){
        return new ResponseUtil(200,"ok",returnCarService.searchReturnCar(id));
    }
}
