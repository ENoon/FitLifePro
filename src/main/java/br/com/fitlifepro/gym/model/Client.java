package br.com.fitlifepro.gym.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "clients")
public class Client {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idClient;

  private String name;
  private LocalDate dateOfBirth;
  private String gender;
  private String street;
  private String district;
  private String number;
  private String email;
  private float height;
  private float weight;
  private String fitnessGoals;
  private String medicalHistory;
  private String registrationDate;

  @OneToMany(mappedBy = "client") // Relacionamento com avaliações físicas 
  private List<PhysicalAssessment> physicalAssessments;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }
  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }

  public String getDistrict() {
    return district;
  }
  public void setDistrict(String district) {
    this.district = district;
  }

  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  public float getHeight() {
    return height;
  }
  public void setHeight(float height) {
    this.height = height;
  }

  public float getWeight() {
    return weight;
  }
  public void setWeight(float weight) {
    this.weight = weight;
  }

  public String getFitnessGoals() {
    return fitnessGoals;
  }
  public void setFitnessGoals(String fitnessGoals) {
    this.fitnessGoals = fitnessGoals;
  }

  public String getMedicalHistory() {
    return medicalHistory;
  }
  public void setMedicalHistory(String medicalHistory) {
    this.medicalHistory = medicalHistory;
  }

  public String getRegistrationDate() {
    return registrationDate;
  }
  public void setRegistrationDate(String registrationDate) {
    this.registrationDate = registrationDate;
  }

}
