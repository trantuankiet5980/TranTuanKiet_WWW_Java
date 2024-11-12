package vn.edu.iuh.fit.backend.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.backend.services.AddressService;

import javax.ws.rs.GET;
import java.util.List;

@RestController
@RequestMapping("/api/addresses")
public class AddressResource {
    @Autowired
    private AddressService addressService;

    @GET
    @RequestMapping("/cities")
    public ResponseEntity<List<String>> getDistinctCity() throws Exception {
        try {
            return ResponseEntity.ok(addressService.findDistinctCity());
        }catch (Exception e) {
            throw new Exception  ("Error: " + e.getMessage(), e);
        }
    }
}
