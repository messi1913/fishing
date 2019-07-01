package com.ddastudio.fishing.ships;

import com.ddastudio.fishing.jooq.tables.BoatMaster;
import com.ddastudio.fishing.jooq.tables.records.BoatMasterRecord;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoatService {

    private final BoatMasterRepository repository;
    private final BoatMasterDAO dao;
    private final ModelMapper modelMapper;

    public BoatMasterDTO getBoatMasterById(Integer id) {
        BoatMasterRecord boatMasterRecord = dao.getBoatById(id);
        return modelMapper.map(boatMasterRecord, BoatMasterDTO.class);

    }



}
