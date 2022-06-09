package ar.org.centro8.curso.java.proyecto3.proyecto3.repositorios.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.org.centro8.curso.java.proyecto3.proyecto3.entities.Responsable;

public interface I_ResponsableRepository {
    void save(Responsable responsable);

    void remove(Responsable responsable);

    void update(Responsable responsable);

    default Responsable getByIdResponsable(int idResponsable) {
        return getAll()
                .stream()
                .filter(a -> a.getIdResponsable() == idResponsable)
                .findFirst()
                .orElse(new Responsable());
    }

    List<Responsable> getAll();

    default List<Responsable> getLikeNombre(String apellidoResponsable) {
        if (apellidoResponsable == null)
            return new ArrayList();
        return getAll()
                .stream()
                .filter(a -> a.getApellidoResponsable() != null)
                .filter(a -> a.getApellidoResponsable().toLowerCase().contains(apellidoResponsable.toLowerCase()))
                .collect(Collectors.toList());
    }

    default List<Responsable> getByResponsable(Responsable responsable) {
        if (responsable == null)
            return new ArrayList();
        return getAll()
                .stream()
                .filter(a -> a.getIdResponsable() == responsable.getIdResponsable())
                .collect(Collectors.toList());
    }
}
