package com.example.demo.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entities.Patient;

import feign.Headers;

@Headers("Content-Type: application/json")
@FeignClient(name = "PatientService", url = "http://localhost:9198")
public interface DoctorFeignClient {
//	@GetMapping("/api/product/products") // it means call /patient mapping from service whose name is PatientService
//	String patientResponse();
	
	@GetMapping("/api/patients/doctors/{doctorId}")
	List<Patient> getPatientByDoctorId(@PathVariable("doctorId") int doctorId);
}
