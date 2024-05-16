package com.example.demo20240509;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BandRepository extends JpaRepository<BandApi , Integer> {

	BandApi findByName(String name);
}
