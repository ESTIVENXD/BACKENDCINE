package com.example.demo.examen.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.examen.entity.Examen;

public interface ExamenRepository  extends JpaRepository<Examen, Integer> {

	public List<Examen> findByCarnet(Integer carnet);

}
