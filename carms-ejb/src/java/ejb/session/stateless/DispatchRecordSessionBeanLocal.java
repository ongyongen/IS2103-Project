/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.session.stateless;

import entity.DispatchRecord;
import java.util.List;
import javax.ejb.Local;
import javax.persistence.Query;

/**
 *
 * @author ongyongen
 */
@Local
public interface DispatchRecordSessionBeanLocal {
    
    public Long createNewDispatchRecord(DispatchRecord dispatchRecord);
    
    public List<DispatchRecord> retrieveAllDispatchRecords();
    
    
}
