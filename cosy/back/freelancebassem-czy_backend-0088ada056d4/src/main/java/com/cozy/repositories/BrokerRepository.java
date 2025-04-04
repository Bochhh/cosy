package com.cozy.repositories;
import com.cozy.entities.Broker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrokerRepository  extends JpaRepository<Broker, Long> {
}
