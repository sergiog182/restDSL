package com.router;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import com.beans.UserBean;
import com.jackson.classes.User;

public class Builder extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		restConfiguration()
		.component("spark-rest")
		.port(8080)
		.bindingMode(RestBindingMode.json)
		.dataFormatProperty("prettyPrint", "true");
		
		rest("/user")
			.get("{id}")
				.route()
				.bean(UserBean.class, "getUser")
				.endRest()
			.post()
				.type(User.class)
				.route()
				.bean(UserBean.class, "saveUser")
				.endRest()
			.put()
				.type(User.class)
				.route()
				.bean(UserBean.class, "updateUser")
				.endRest()
			.delete("{id}")
				.route()
				.bean(UserBean.class, "deleteUser")
				.endRest();
		
	}

}
