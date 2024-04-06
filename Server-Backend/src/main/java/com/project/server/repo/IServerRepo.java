package com.project.server.repo;

import com.project.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
}
