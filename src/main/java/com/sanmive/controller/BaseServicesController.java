package com.sanmive.controller;

import java.io.Serializable;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.sanmive.entity.BaseEntity;

/**
 * 
 * @author José Alexander Lozano Velasco
 *
 * @param <E>
 * @param <ID>
 */
public interface BaseServicesController <E extends BaseEntity, ID extends Serializable> {

	/**
	 * Realiza la busqueda de registros
	 * 
	 * @return
	 */
	public ResponseEntity<?> findAll();
	
	/**
	 * Realiza una busqueda de registros y los ordena según parametros
	 *  
	 * @param sort {@link Sort}
	 * @return
	 */
	public ResponseEntity<?> findAll(Sort sort);
	
	/**
	 * Realiza una busqueda de registros paginados según parametros
	 * 
	 * @param pageable {@link Pageable}
	 * @return
	 */
	public ResponseEntity<?> findAll(Pageable pageable);
	
	/**
	 *  Realiza la busqueda de un registro según id
	 * 
	 * @param id
	 * @return
	 */
	public ResponseEntity<?> findById(@PathVariable ID id);
	
	/**
	 * Realiza el almacenamiento de un registro
	 * 
	 * @param entity
	 * @return
	 */
	public ResponseEntity<?> save(@RequestBody E entity);
	
	/**
	 * Realiza la actualización de un registro
	 * 
	 * @param id
	 * @param entity
	 * @return
	 */
	public ResponseEntity<?> update(@PathVariable ID id, @RequestBody E entity);
	
	/**
	 * Realiza la eliminaciòn un registro
	 * 
	 * @param id
	 * @return
	 */
	public ResponseEntity<?> delete(@PathVariable ID id);
}
