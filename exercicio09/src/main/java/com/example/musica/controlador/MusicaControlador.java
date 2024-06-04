package com.example.musica.controlador;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.musica.classe.Musica;
import com.example.musica.dtos.MusicaRequestDTO;
import com.example.musica.dtos.MusicaResponseDTO;
import com.example.musica.repositorio.MusicaRepositorio;

@RestController
@RequestMapping("/musicas")
public class MusicaControlador {
    private final MusicaRepositorio musicaRepositorio;

    public MusicaControlador(MusicaRepositorio musicaRepositorio) {
        this.musicaRepositorio = musicaRepositorio;
    }

    @GetMapping
    public List<MusicaResponseDTO> getAll() {
        List<Musica> musicas = musicaRepositorio.findAll();
        return musicas.stream()
                .map(this::convertToResponseDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public MusicaResponseDTO getOne(@PathVariable Long id) {
        Musica musica = musicaRepositorio.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return convertToResponseDTO(musica);
    }

    @PostMapping
    public MusicaResponseDTO create(@RequestBody MusicaRequestDTO musicaRequestDTO) {
        Musica musica = convertToEntity(musicaRequestDTO);
        Musica savedMusica = musicaRepositorio.save(musica);
        return convertToResponseDTO(savedMusica);
    }

    @PutMapping("/{id}")
    public MusicaResponseDTO update(@PathVariable Long id, @RequestBody MusicaRequestDTO musicaRequestDTO) {
        Musica musica = musicaRepositorio.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        musica.setNome(musicaRequestDTO.getNome());
        musica.setArtista(musicaRequestDTO.getArtista());
        musica.setAlbum(musicaRequestDTO.getAlbum());
        musica.setAnoLancamento(musicaRequestDTO.getAnoLancamento());
        Musica updatedMusica = musicaRepositorio.save(musica);
        return convertToResponseDTO(updatedMusica);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        Musica musica = musicaRepositorio.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        musicaRepositorio.delete(musica);
    }

    private MusicaResponseDTO convertToResponseDTO(Musica musica) {
        MusicaResponseDTO responseDTO = new MusicaResponseDTO();
        responseDTO.setId(musica.getId());
        responseDTO.setNome(musica.getNome());
        responseDTO.setArtista(musica.getArtista());
        responseDTO.setAlbum(musica.getAlbum());
        responseDTO.setAnoLancamento(musica.getAnoLancamento());
        return responseDTO;
    }

    private Musica convertToEntity(MusicaRequestDTO requestDTO) {
        Musica musica = new Musica();
        musica.setNome(requestDTO.getNome());
        musica.setArtista(requestDTO.getArtista());
        musica.setAlbum(requestDTO.getAlbum());
        musica.setAnoLancamento(requestDTO.getAnoLancamento());
        return musica;
    }
}
