/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.data.repositories;

import com.mycompany.data.models.Stock;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author pulkit
 */
public interface IStockRepository {

    void addStock(Stock s);

    void deleteStock(int id);

    Optional<List<Stock>> getAllStocks();

    void modifyStock(int id, Stock newStock);
    
}
