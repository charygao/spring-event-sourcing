package com.elasticjee.shipment;

import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * @author chaokunyang
 */
public interface ShipmentRepository extends GraphRepository<Shipment> {
}
