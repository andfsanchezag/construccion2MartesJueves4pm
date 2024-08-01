package app;

import app.controller.AdminController;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminController adminController = new AdminController();
		try {
			adminController.session();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
