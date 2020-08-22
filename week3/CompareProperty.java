package fit5042.tutex.calculator;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.Remote;

import fit5042.tutex.repository.entities.Property;


@Remote
public interface CompareProperty {

    void addProperty(Property property);

    int bestPerRoom();

    void removeProperty(Property property);

    CompareProperty create() throws CreateException, RemoteException;
    
}