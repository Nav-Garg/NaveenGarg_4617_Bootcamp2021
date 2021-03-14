package com.hibernateinheritance.inheritancemapping;

import com.hibernateinheritance.inheritancemapping.entities.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {
}
