package business;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.spi.resource.Singleton;

@Singleton
@Path("/orders")
@Produces(MediaType.APPLICATION_JSON)
public class BricksOrderingController {

	BricksOrderingDAO orderDAO = new BricksOrderingDAO();


	@Path("/{id}")
	@GET
	public BricksOrderingPOJO getOrder(@PathParam("id") int id) {
		return orderDAO.getOrder(id);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public BricksOrderingPOJO insertOrder(BricksOrderingPOJO order) {
		
		return orderDAO.insertOrder(order);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public BricksOrderingPOJO updateOrder(BricksOrderingPOJO order) {
		return orderDAO.updateOrder(order);
	}
	
	@Path("updateDispachStatus")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public BricksOrderingPOJO updateOrderStatus(BricksOrderingPOJO order) {
		return orderDAO.updateOrderDispatch(order);
	}
}
