package com.spring.airdnd.service;

import com.spring.airdnd.dto.HostInfoDTO;
import com.spring.airdnd.entity.Host;
import com.spring.airdnd.repository.HostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HostService {
    private final HostRepository hostRepository;

    public List<HostInfoDTO>
    getAllHosts(){

        List<Host> hosts = this.hostRepository.findAll();
        return hosts.stream().map(HostInfoDTO::from).collect(Collectors.toList());
    }
}
