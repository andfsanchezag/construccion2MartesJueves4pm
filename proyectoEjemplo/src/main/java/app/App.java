package app;

import app.config.MYSQLConnection;
import app.controller.ControllerInterface;
import app.controller.LoginController;

public class App {
//comentario para commit
	public static void main(String[] args) throws Exception {
		ControllerInterface controller = new LoginController();
		try {
			controller.session();
			//MYSQLConnection.getConnection();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
