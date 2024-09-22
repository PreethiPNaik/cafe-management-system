
package com.cafe.management.service;

import com.cafe.management.model.CafeItem;
import com.cafe.management.repository.CafeItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CafeItemService {

    @Autowired
    private CafeItemRepository cafeItemRepository;

    public List<CafeItem> getAllItems() {
        return cafeItemRepository.findAll();
    }

    public CafeItem getItemById(Long id) {
        return cafeItemRepository.findById(id).orElseThrow(() -> new RuntimeException("Item not found"));
    }

    public CafeItem addItem(CafeItem item) {
        return cafeItemRepository.save(item);
    }

    public void deleteItem(Long id) {
        cafeItemRepository.deleteById(id);
    }
}
