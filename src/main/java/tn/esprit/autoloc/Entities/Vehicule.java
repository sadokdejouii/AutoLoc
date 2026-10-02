package tn.esprit.autoloc.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity  //nkolou eli hathi entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Vehicule {
    @Id   //clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //mafhmthech
    long idVehicule;
    String immatriculation;
    String marque;
    String model;
    @Enumerated(EnumType.STRING) // lel enum
    CategorieVehicule categorie;
    BigDecimal tarifJournalier;
    StatutVehicule statut;


}
