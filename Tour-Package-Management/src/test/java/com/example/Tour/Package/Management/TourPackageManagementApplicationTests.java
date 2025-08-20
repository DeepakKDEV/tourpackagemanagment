package com.example.Tour.Package.Management;

import com.example.Tour.Package.Management.controller.TourController;
import com.example.Tour.Package.Management.entity.TourPackage;
import com.example.Tour.Package.Management.service.TourService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.fasterxml.jackson.databind.ObjectMapper;

class TourControllerTest {

	private MockMvc mockMvc;

	@Mock
	private TourService service;

	@InjectMocks
	private TourController controller;

	private ObjectMapper objectMapper = new ObjectMapper();

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}

	@Test
	void testGetAllTours() throws Exception {
		TourPackage tour1 = new TourPackage();
		tour1.setId(1L);
		tour1.setTitle("Himalayan Trek");

		TourPackage tour2 = new TourPackage();
		tour2.setId(2L);
		tour2.setTitle("Leh Ladakh Tour");

		List<TourPackage> tours = Arrays.asList(tour1, tour2);
		when(service.getAllTours()).thenReturn(tours);

		mockMvc.perform(get("/api/tours")
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());

		verify(service, times(1)).getAllTours();
	}

	@Test
	void testGetTourById() throws Exception {
		TourPackage tour = new TourPackage();
		tour.setId(1L);
		tour.setTitle("Himalayan Trek");

		when(service.getTourById(1L)).thenReturn(tour);

		mockMvc.perform(get("/api/tours/1")
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());

		verify(service, times(1)).getTourById(1L);
	}

	@Test
	void testCreateTour() throws Exception {
		TourPackage tour = new TourPackage();
		tour.setId(1L);
		tour.setTitle("Himalayan Trek");

		when(service.saveTour(any(TourPackage.class))).thenReturn(tour);

		mockMvc.perform(post("/api/tours")
						.contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(tour)))
				.andExpect(status().isOk());

		verify(service, times(1)).saveTour(any(TourPackage.class));
	}
}

