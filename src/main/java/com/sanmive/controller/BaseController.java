package com.sanmive.controller;

import java.io.Serializable;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;

import com.sanmive.entity.BaseEntity;

/**
 * 
 * @author José Alexander Lozano Velasco
 *
 * @param <E>
 * @param <ID>
 */
public class BaseController<E extends BaseEntity, ID extends Serializable> implements BaseServicesController<E, ID> {

	@Override
	public ResponseEntity<?> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> findById(ID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> save(E entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> update(ID id, E entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> delete(ID id) {
		// TODO Auto-generated method stub
		return null;
	}

}
