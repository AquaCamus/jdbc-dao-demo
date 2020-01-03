package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	/*O método createSellerDao() retorna uma instanciação de SellerDaoJDBC.
	 * Dessa forma, a implementação desse SellerDaoJDBC não é exposta.
	 */
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
	
}
