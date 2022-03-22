package com.sanmive.Impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.sanmive.entity.BaseEntity;
import com.sanmive.repository.BaseRepository;
import com.sanmive.service.BaseService;

/**
 * 
 * @author José Alexander Lozano Velasco
 *
 * @param <E>
 * @param <ID>
 */
public abstract class BaseImpl <E extends BaseEntity, ID extends Serializable> implements BaseService<E, ID> {

	@Autowired
	protected BaseRepository<E, ID> baseRepository;
	
	@Override
	@Transactional
	public List<E> findAll() throws Exception {
		try {
			List<E> entities =  baseRepository.findAll();
			return entities;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public List<E> findAll(Sort sort) throws Exception {
		try {
			List<E> entities = baseRepository.findAll(sort);
			return entities;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public Page<E> findAll(Pageable pageable) throws Exception {
		try {
			Page<E> entitiesPage = baseRepository.findAll(pageable);
			return entitiesPage;			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public E findById(ID id) throws Exception {
		try {
			Optional<E> entityOptional = baseRepository.findById(id);
			return entityOptional.get();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public E save(E entity) throws Exception {
		try {
			return baseRepository.save(entity);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public E update(ID id, E entity) throws Exception {
		try {
			if (baseRepository.existsById(id)) {
				Optional<E> entiOptional = baseRepository.findById(id);
				E entityUpdate = entiOptional.get();
				entityUpdate = baseRepository.save(entity);
				return entityUpdate;				
			}
			return null;
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}		
	}

	@Override
	@Transactional
	public Boolean delete(ID id) throws Exception {
		try {
			if (baseRepository.existsById(id)) {
				baseRepository.deleteById(id);
				return true;
			}
			return false;
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
