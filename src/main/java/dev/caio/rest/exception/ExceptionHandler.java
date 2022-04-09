package dev.caio.rest.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.hibernate.service.spi.ServiceException;

@Provider
public class ExceptionHandler implements ExceptionMapper<ServiceException> {


	@Override
	public Response toResponse(ServiceException exception) {
		return Response.status(Status.BAD_REQUEST).entity(exception.getMessage()).build();  
	}
}
