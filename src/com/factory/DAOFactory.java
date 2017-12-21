package com.factory;

import com.dao.IUserDAO;
import com.dao.Proxy.AlreadyBuyProxy;
import com.dao.Proxy.Commodity_InfoProxy;
import com.dao.Proxy.GoodsDAOProxy;
import com.dao.Proxy.UserDAOProxy;
import com.dao.IGoodsDAO;
import com.dao.IAlreadyBuyDAO;
import com.dao.ICommodity_InfoDAO;

public class DAOFactory 
{
	public static IUserDAO getIUserDAOInstance ()
	{
		return new UserDAOProxy () ;
	}
	public static IGoodsDAO getIGoodsDAOInstance ()  
	{
		return new GoodsDAOProxy () ;
	}
	public static IAlreadyBuyDAO getIAlreadyBuyDAOInstance() 
	{
		return new AlreadyBuyProxy () ;
	}
	public static ICommodity_InfoDAO getICommodity_InfoProxyInstance ()
	{
		return new Commodity_InfoProxy () ;
	}
	
}
