package application;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		
		//O programa não conhece a implementação
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Teste #1: Seller fundById =====");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);

	}

}
