package backend.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuarios")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre_usuario", nullable = false)
    private String nombre;
    @Column(name = "email_usuario", nullable = false, unique = true)
    private String email;
    @Column(name = "password_usuario", nullable = false, length = 255)
    private String passwordHash;
    @Column(name = "fecha_registro", nullable = false)
    private LocalDateTime fechaRegistro;

    // ---CONSTRUCTORES--- //

    public Usuario() {
    }

    public Usuario(String nombre, String email, String passwordHash, LocalDateTime fechaRegistro) {
        this.nombre = nombre;
        this.email = email;
        this.passwordHash = passwordHash;
        this.fechaRegistro = LocalDateTime.now();
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

    public String getPasswordHash() {
        return passwordHash;
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

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
}
