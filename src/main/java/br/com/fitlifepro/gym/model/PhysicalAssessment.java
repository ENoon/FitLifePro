package br.com.fitlifepro.gym.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "physical_assessment")
public class PhysicalAssessment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private LocalDate dateOfAssessment;

  @ManyToOne
  private Client client;
  
  private Float weight;
  private Float height;
  private Float waistCircumference;
  private Float hipCircumference;
  private String responsibleInstructor;
  
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public LocalDate getDateOfAssessment() {
    return dateOfAssessment;
  }
  public void setDateOfAssessment(LocalDate dateOfAssessment) {
    this.dateOfAssessment = dateOfAssessment;
  }

  public Float getWeight() {
    return weight;
  }
  public void setWeight(Float weight) {
    this.weight = weight;
  }
  public Float getHeight() {
    return height;
  }
  public void setHeight(Float height) {
    this.height = height;
  }
  public Float getWaistCircumference() {
    return waistCircumference;
  }
  public void setWaistCircumference(Float waistCircumference) {
    this.waistCircumference = waistCircumference;
  }
  public Float getHipCircumference() {
    return hipCircumference;
  }
  public void setHipCircumference(Float hipCircumference) {
    this.hipCircumference = hipCircumference;
  }
  public String getResponsibleInstructor() {
    return responsibleInstructor;
  }
  public void setResponsibleInstructor(String responsibleInstructor) {
    this.responsibleInstructor = responsibleInstructor;
  }
  
}
