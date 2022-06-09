package ar.org.centro8.curso.java.proyecto3.proyecto3.repositorios.jdbc;

import java.sql.Connection;
import java.util.List;

import ar.org.centro8.curso.java.proyecto3.proyecto3.entities.Responsable;
import ar.org.centro8.curso.java.proyecto3.proyecto3.repositorios.interfaces.I_ResponsableRepository;

public class ResponsableRepository implements I_ResponsableRepository{

    private Connection conn;

    public ResponsableRepository(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void save(Responsable responsable) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void remove(Responsable responsable) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(Responsable responsable) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Responsable> getAll() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
