package backend.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UsuarioRegistroDTO {
    @NotBlank(message = "El nombre es obligatorio.")
    private String nombre;
    @NotBlank(message = "El email es obligatorio.")
    @Email(message = "Tiene que ser un email.")
    private String email;
    @NotBlank(message = "La contraseña es obligatoria")
    @Size(min = 8, message = "Tiene que tener al menos 8 caracteres")
    private String password;

    // ---CONSTRUCTORES--- //

    public UsuarioRegistroDTO() {
    }

    public UsuarioRegistroDTO(String nombre, String email, String password) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    // ---GETTERS--- //

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    // ---SETTERS--- //

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
