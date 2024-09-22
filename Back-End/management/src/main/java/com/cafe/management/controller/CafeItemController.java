package com.cafe.management.controller;

import com.cafe.management.model.CafeItem;
import com.cafe.management.service.CafeItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class CafeItemController {

    @Autowired
    private CafeItemService cafeItemService;

    @GetMapping
    public List<CafeItem> getAllItems() {
        return cafeItemService.getAllItems();
    }

    @GetMapping("/{id}")
    public CafeItem getItemById(@PathVariable Long id) {
        return cafeItemService.getItemById(id);
    }

    @PostMapping
    public CafeItem addItem(@RequestBody CafeItem item) {
        return cafeItemService.addItem(item);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        cafeItemService.deleteItem(id);
    }
}
