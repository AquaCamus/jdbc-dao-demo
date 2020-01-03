package application;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Department dp = new Department(1, "Books");
		Seller sel = new Seller(1, "Gabriel", "gabriel@gmail.com", new Date(), 5000.0, dp);
		
		//O programa não conhece a implementação
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(sel);

	}

}
