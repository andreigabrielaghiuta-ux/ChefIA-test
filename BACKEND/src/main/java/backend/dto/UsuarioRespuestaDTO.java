package backend.dto;

import java.time.LocalDateTime;

public class UsuarioRespuestaDTO {
    private Long id;
    private String nombre;
    private String email;
    private LocalDateTime fechaRegistro;

    // ---CONSTRUCTORES--- //

    public UsuarioRespuestaDTO() {
    }

    public UsuarioRespuestaDTO(Long id, String nombre, String email, LocalDateTime fechaRegistro) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.fechaRegistro = fechaRegistro;
    }

    // ---GETTERS--- //

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    // ---SETTERS--- ///

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
