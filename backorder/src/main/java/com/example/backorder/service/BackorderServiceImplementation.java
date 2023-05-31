package com.example.backorder.service;


import com.example.backorder.entity.BackorderEntity;
import com.example.backorder.repository.BackorderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BackorderServiceImplementation implements BackorderService{
    private BackorderRepository backorderRepository;
    @Override
    public BackorderEntity createBackorder(BackorderEntity backorder) {
        return backorderRepository.save(backorder);
    }

    @Override
    public BackorderEntity getBackorderById(Long backorderId) {
        Optional<BackorderEntity> optionalBackorder=backorderRepository.findById(backorderId);
        return optionalBackorder.get();
    }

    @Override
    public List<BackorderEntity> getAllBackorderEntity() {
        return backorderRepository.findAll();
    }

    @Override
    public BackorderEntity updateBackorder(BackorderEntity backorder) {
       BackorderEntity existingBackorder =backorderRepository.findById(backorder.getId()).get();
       existingBackorder.setFirstName(backorder.getFirstName());
       existingBackorder.setLastName(backorder.getLastName());
       BackorderEntity updateBackorder=backorderRepository.save(existingBackorder);
       return updateBackorder;
    }

    @Override
    public void deleteBackorder(Long backorderId) {
        backorderRepository.deleteById(backorderId);
    }
}
