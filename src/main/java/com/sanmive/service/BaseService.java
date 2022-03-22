package com.sanmive.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.sanmive.entity.BaseEntity;

/**
 * 
 * @author José Alexander Lozano Velasco
 *
 * @param <E>
 */
public interface BaseService <E extends BaseEntity, ID extends Serializable> {
	
	/**
	 * Obtiene una lista de registros
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<E> findAll() throws Exception;
	
	/**
	 * Obtiene una lista de registros ordenados según paramtero
	 * 
	 * @param sort {@link Sort}
	 * @return
	 * @throws Exception
	 */
	public List<E> findAll(Sort sort) throws Exception;	
	
	/**
	 * Obtiene una lista de registros paginados
	 * 
	 * @param pageable {@link Pageable}
	 * @return
	 * @throws Exception
	 */
	public Page<E> findAll(Pageable pageable) throws Exception;	
	
	/**
	 * Obtiene un registro según el id
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public E findById(ID id) throws Exception; 	
	
	/**
	 * Almacena un registro según la entidad
	 * 
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	public E save(E entity) throws Exception;	
	
	/**
	 * Actualiza un registro según el id y la entidad
	 * 
	 * @param id
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	public E update(ID id, E entity) throws Exception;	
	
	/**
	 * Elimina un registro según el id
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Boolean delete(ID id) throws Exception;

}
