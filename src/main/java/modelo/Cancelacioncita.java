package modelo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Cancelacioncita {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Cancelacioncita cancelacion;

}
