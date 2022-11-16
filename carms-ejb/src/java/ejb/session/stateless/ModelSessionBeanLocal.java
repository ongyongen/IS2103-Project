/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.session.stateless;

import entity.Category;
import entity.Model;
import exception.CategoryDoesNotExistException;
import exception.DuplicateModelException;
import exception.ModelDoesNotExistException;
import java.util.List;
import javax.ejb.Local;
import javax.persistence.Query;

/**
 *
 * @author ongyongen
 */
@Local
public interface ModelSessionBeanLocal {
        


    public Long createNewModel(Model model, String categoryName) throws CategoryDoesNotExistException, DuplicateModelException;

    
    public Model retrieveModelByName(String modelName) throws ModelDoesNotExistException;
    
    public List<Model> retrieveAllModels();
    
    public void updateModel(String oldModelName, Model newModel, String categoryName) throws CategoryDoesNotExistException, DuplicateModelException, ModelDoesNotExistException;    

    public String deleteModel(String modelName) throws ModelDoesNotExistException;

}
