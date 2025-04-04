package com.cozy.services;

import com.cozy.dto.response.*;
import com.cozy.entities.Agent;
import com.cozy.entities.Broker;
import com.cozy.entities.Homeowner;
import com.cozy.entities.Student;

public interface UserService {
    CustomPageResponse<Student> getAllStudents(int page, int size);
    CustomPageResponse<Agent> getAllAgent(int page, int size);
    CustomPageResponse<Broker> getAllBroker(int page, int size);
    CustomPageResponse<Homeowner> getAllHomeowner(int page, int size);
    void activateAccount(Long userId);
    void deactivateAccount(Long userId);

    AgentDetailsDTO getAgentById(Long agentId);
    BrokerDetailsDTO getBrokerById(Long brokerId);
    HomeownerDetailsDTO getHomeownerById(Long homeownerId);
    StudentDetailsDTO getStudentById(Long studentId);
}
