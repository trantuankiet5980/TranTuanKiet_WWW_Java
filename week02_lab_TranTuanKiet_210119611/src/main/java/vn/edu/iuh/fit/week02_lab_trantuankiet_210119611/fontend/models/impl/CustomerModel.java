package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.fontend.models.impl;

import jakarta.ejb.Stateless;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.dtos.CustomerDto;
import vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.fontend.constants.SystemConstant;

@Stateless
public class CustomerModel implements vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.fontend.models.CustomerModel {
    @Override
    public CustomerDto findByPhone(String phone) {
        try(Client client = ClientBuilder.newClient()) {
            String PATH = "/api/customers/getByPhone";
            Response response = client.target(SystemConstant.API_URL)
                    .path(PATH)
                    .queryParam("phone", phone)
                    .request(MediaType.APPLICATION_JSON)
                    .get();
            if(response.getStatus() == Response.Status.OK.getStatusCode()) {
                return response.readEntity(new GenericType<>() {
                });
            } else {
                return null;
            }
        }
    }
}
