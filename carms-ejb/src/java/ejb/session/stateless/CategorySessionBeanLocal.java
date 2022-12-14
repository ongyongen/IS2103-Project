/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.session.stateless;

import entity.Car;
import entity.Category;
import exception.CategoryDoesNotExistException;
import exception.DuplicateCategoryException;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ongyongen
 */
@Local
public interface CategorySessionBeanLocal {
    
    public Long createNewCategory(Category category) throws DuplicateCategoryException;
    
    public Category retrieveCategoryByName(String name) throws CategoryDoesNotExistException;
        
}
