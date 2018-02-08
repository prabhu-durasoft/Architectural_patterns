package com.sat.persistlayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PalindromeWordRepository extends JpaRepository<PalindromeWord, Integer>{

}
