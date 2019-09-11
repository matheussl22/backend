package br.com.core.support;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface BaseRepository<E, K extends Serializable> extends JpaRepository<E, K> {
}
