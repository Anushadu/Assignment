package com.orderDao;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.order.OrderItem;

public class OrderItemDAO {
	private SessionFactory factory;

	public OrderItemDAO() {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
	}

	public void saveOrUpdate(OrderItem orderItem) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.saveOrUpdate(orderItem);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
//Call rollback if transaction is null
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public OrderItem getById(int id) {
		Session session = factory.openSession();
		OrderItem orderItem = null;
		try {
			orderItem = session.get(OrderItem.class, id);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return orderItem;
	}

	public void delete(int id) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			OrderItem orderItem = session.get(OrderItem.class, id);
			if (orderItem != null) {
				session.delete(orderItem);
			}
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public List<OrderItem> getByOrderId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}