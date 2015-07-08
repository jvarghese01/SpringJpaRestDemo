package com.jsonlibrary.demo.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.jsonlibrary.demo.entities.Filestore;
import com.jsonlibrary.demo.entities.Item;

@RepositoryRestResource
public interface FilestoreRestRepository extends PagingAndSortingRepository<Filestore, Long> {

	List<Item> findByFileId(@Param("fileId") String title);

}