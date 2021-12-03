package com.hcs.narucivanjehrane.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcs.narucivanjehrane.entity.Osoba;

public interface OsobaRepository extends JpaRepository<Osoba, Long> { //osoba(entity) i tip koji je ID

}
