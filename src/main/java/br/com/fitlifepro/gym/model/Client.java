package br.com.fitlifepro.gym.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;


@Entity
@Table(name = "clients")
public class Client {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idClient;

  @NotBlank(message = "O nome precisa ser preenchido")
  private String name;

  @Past(message = "A data de nascimento deve estar no passado")
  @DateTimeFormat(pattern = "dd-MM-yyyy")
  @NotNull(message = "A data de nascimento precisa ser preenchida")
  private LocalDate dateOfBirth;

  private String gender;

  @NotBlank(message = "A rua precisa ser preenchida")
  private String street;

 @NotBlank(message = "O bairro precisa ser preenchido")
  private String district;

  @Pattern(regexp = "^\\+(?:[0-9] ?){6,14}[0-9]$", message = "Número de telefone inválido")
  @NotBlank(message = "O número precisa ser preenchido")
  private String number;
  
  @Email(message = "Informe um email válido")
  private String email;
  
  @NotNull
  @DecimalMin(value = "0.0", message = "A altura precisa ser maior ou igual a 0")
  @Positive(message = "Informe uma altura válida")
  private Float height;

  @NotNull
  @DecimalMin(value = "0.0", message = "O peso precisa ser maior ou igual a 0")
  @Positive(message = "Informe um peso válido")
  private Float weight;

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
