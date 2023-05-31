package com.example.backorder.service;


import com.example.backorder.entity.BackorderEntity;

import java.util.List;

public interface BackorderService {
    BackorderEntity createBackorder(BackorderEntity backorder);
    BackorderEntity getBackorderById (Long BackorderEntity);
    List<BackorderEntity> getAllBackorderEntity();
    BackorderEntity updateBackorder(BackorderEntity backorder);
    void deleteBackorder(Long backorderId);

}
