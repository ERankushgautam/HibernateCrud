package com.main.hibernate.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.hibernate.entities.Address;

public interface AddressRepo  extends JpaRepository<Address, Long>{

}
