package com.sanmive.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.sanmive.entity.BaseEntity;

/**
 * 
 * @author José Alexander Lozano Velasco
 *
 * @param <E>
 * @param <ID>
 */
@NoRepositoryBean
public interface BaseRepository <E extends BaseEntity, ID extends Serializable> extends JpaRepository<E, ID>{

}
