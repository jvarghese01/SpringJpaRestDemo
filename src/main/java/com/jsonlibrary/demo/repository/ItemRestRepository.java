package com.jsonlibrary.demo.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.jsonlibrary.demo.entities.Item;

@RepositoryRestResource
public interface ItemRestRepository extends PagingAndSortingRepository<Item, Long> {

	List<Item> findByTitle(@Param("title") String title);

}