package com.healthmate.service;

import java.util.List;
import java.util.Optional;

import com.healthmate.entities.Doctor;
import com.healthmate.entities.User;

public interface DoctorService {
	Doctor getDoctorDetails(Long doctorId);
	
	List<Doctor> getAllDoctors();
	
	Doctor createDoctor(Doctor doctor, Long userId);
	
	Doctor updateDoctor(Long doctorId, Doctor updatedDoctor);
	
	void deleteDoctor(Long doctorId);
	
	List<Doctor> getDoctorsBySpecialization(String specialization);
	
	List<Doctor> getDoctorsByQualification(String qualification);
	
	List<Doctor> getDoctorsByExperienceYears(int experienceYears);
	
	List<Doctor> getDoctorsByClinicAddress(String clinicAddress);
	
	List<Doctor> getDoctorsByAvailableDays(String availableDays);

	long getDoctorCounts();

}
