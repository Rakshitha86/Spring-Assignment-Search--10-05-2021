package com.xworkz.postmapper.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.postmapper.dto.PressOrderDTO;

@Component
public class PressOrderDAOImpl implements PressOrderDAO {

	@Autowired
	private SessionFactory factory;

	public PressOrderDAOImpl() {
		super();
		System.out.println(this.getClass().getSimpleName() + "object created");
	}

	@Override
	public boolean savePressOrder(PressOrderDTO dto) {
		System.out.println("invoked savePressOrder()");
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			session.persist(dto);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}
		}
		return true;
	}

	@Override
	public PressOrderDTO fetchByOrderForm(String name) {
		System.out.println("invoked fetchByOrderForm()");
		try (Session session = factory.openSession()) {
			Query<PressOrderDTO> query = session.createNamedQuery("fetchByOrderForm");
			query.setParameter("orderform", name);
			PressOrderDTO dto = query.uniqueResult();
			return dto;
		}
	}

	@Override
	public List<PressOrderDTO> displayAll() {
		System.out.println("invoked savePressOrder()");
		Session session = null;
		try {
			session = factory.openSession();
			List<PressOrderDTO> list = new ArrayList<PressOrderDTO>();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}
		}
		return null;
	}

}
