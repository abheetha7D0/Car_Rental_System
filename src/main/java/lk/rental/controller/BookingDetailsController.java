package lk.rental.controller;

import lk.rental.dto.BookingDetailsDTO;
import lk.rental.service.BookingDetailsService;
import lk.rental.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookingdetail")
@CrossOrigin
public class BookingDetailsController {
    @Autowired
    BookingDetailsService bookingDetailsService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllCustomer(){
        return new ResponseUtil(200,"OK",bookingDetailsService.getAllBookingDetails());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveCustomer(@ModelAttribute BookingDetailsDTO bookingDetailsDTO){
        bookingDetailsService.saveBookingDetails(bookingDetailsDTO);
        return new ResponseUtil(200,"save",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateCustomer(@RequestBody BookingDetailsDTO bookingDetailsDTO){
        bookingDetailsService.updateBookingDetails(bookingDetailsDTO);
        return new ResponseUtil(200,"updated",null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteCustomer(@RequestParam String id){
        bookingDetailsService.deleteBookingDetails(id);
        return new ResponseUtil(200,"Deleted",null);
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchCustomer(@PathVariable String id){
        return new ResponseUtil(200,"ok",bookingDetailsService.searchBookingDetails(id));
    }
}
