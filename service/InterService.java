/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
/**
 *
 * @author Acer
 */
public interface InterService <T> {
    
     void insert(T t);
    void delete(T t);
    void update(T t);
    List<T> readAll();
    T readById(int id);
    
}
