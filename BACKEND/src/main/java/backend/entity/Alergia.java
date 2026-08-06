package backend.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "alergias")
public class Alergia  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nombre", nullable = false, length = 100, unique = true)
    private String nombre;
    @Column(name="descripcion", length = 1000)
    private String descripcion;

// ---CONSTRUCTORES--- //

    public Alergia(){
    }
    public Alergia(String nombre, String descripcion){
        this.nombre=nombre;
        this.descripcion=descripcion;
    }

// ---GETTERS--- //

    public Long getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }

// ---SETTERS--- //

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
}
