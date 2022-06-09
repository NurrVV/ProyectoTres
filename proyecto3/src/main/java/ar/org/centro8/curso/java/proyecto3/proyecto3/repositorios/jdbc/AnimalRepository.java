package ar.org.centro8.curso.java.proyecto3.proyecto3.repositorios.jdbc;

import java.sql.Connection;
import java.util.List;

import ar.org.centro8.curso.java.proyecto3.proyecto3.entities.Animal;
import ar.org.centro8.curso.java.proyecto3.proyecto3.repositorios.interfaces.I_AnimalRepository;

public class AnimalRepository implements I_AnimalRepository{

    private Connection conn;

    public AnimalRepository(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void save(Animal animal) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void remove(Animal animal) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(Animal animal) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Animal> getAll() {
        // TODO Auto-generated method stub
        return null;
    }


    
}
