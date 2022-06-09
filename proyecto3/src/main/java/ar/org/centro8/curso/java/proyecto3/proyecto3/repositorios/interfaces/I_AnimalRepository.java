package ar.org.centro8.curso.java.proyecto3.proyecto3.repositorios.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.org.centro8.curso.java.proyecto3.proyecto3.entities.Animal;
import ar.org.centro8.curso.java.proyecto3.proyecto3.entities.Responsable;

public interface I_AnimalRepository {
    void save(Animal animal);

    void remove(Animal animal);

    void update(Animal animal);

    default Animal getById(int idAnimal) {
        return getAll()
                .stream()
                .filter(a -> a.getIdAnimal() == idAnimal)
                .findFirst()
                .orElse(new Animal());
    }

    List<Animal> getAll();

    default List<Animal> getLikeNombre(String nombre) {
        if (nombre == null)
            return new ArrayList();
        return getAll()
                .stream()
                .filter(a -> a.getNombre() != null)
                .filter(a -> a.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
    }

    default List<Animal> getByResponsable(Responsable responsable) {
        if (responsable == null)
            return new ArrayList();
        return getAll()
                .stream()
                .filter(a -> a.getIdResponsable() == responsable.getIdResponsable())
                .collect(Collectors.toList());
    }
}
