package com.example.musica.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.musica.classe.Musica;

public interface MusicaRepositorio extends JpaRepository<Musica, Long> {
    List<Musica> findByNomeContainingIgnoreCase(String nome);
}
