package org.example.streams.filter;

import java.util.*;
import java.util.stream.Collectors;

public class RealWorldFilteringExamples {

    public static void main(String[] args) {
        filterAvailableRooms();
        filterProducts();
        filterJobApplicants();
        filterMessages();
        filterFlights();
    }

    // 1. Filter available rooms in a hotel booking system
    public static void filterAvailableRooms() {
        class Room {
            int id;
            String type; // e.g., "Single", "Double", "Suite"
            double price;
            boolean isAvailable;

            Room(int id, String type, double price, boolean isAvailable) {
                this.id = id;
                this.type = type;
                this.price = price;
                this.isAvailable = isAvailable;
            }

            @Override
            public String toString() {
                return "Room{" + "id=" + id + ", type='" + type + '\'' + ", price=" + price + ", isAvailable=" + isAvailable + '}';
            }
        }

        List<Room> rooms = Arrays.asList(
            new Room(1, "Single", 100.0, true),
            new Room(2, "Double", 150.0, false),
            new Room(3, "Suite", 300.0, true),
            new Room(4, "Single", 120.0, true)
        );

        List<Room> availableRooms = rooms.stream()
                                         .filter(room -> room.isAvailable)
                                         .filter(room -> room.type.equals("Single"))
                                         .filter(room -> room.price <= 150.0)
                                         .collect(Collectors.toList());

        System.out.println("Available Rooms: " + availableRooms);
    }

    // 2. Filter products in an e-commerce platform
    public static void filterProducts() {
        class Product {
            int id;
            String category;
            double price;
            double rating;

            Product(int id, String category, double price, double rating) {
                this.id = id;
                this.category = category;
                this.price = price;
                this.rating = rating;
            }

            @Override
            public String toString() {
                return "Product{" + "id=" + id + ", category='" + category + '\'' + ", price=" + price + ", rating=" + rating + '}';
            }
        }

        List<Product> products = Arrays.asList(
            new Product(1, "Electronics", 500.0, 4.5),
            new Product(2, "Clothing", 50.0, 3.8),
            new Product(3, "Electronics", 1000.0, 4.7),
            new Product(4, "Clothing", 30.0, 4.0)
        );

        List<Product> filteredProducts = products.stream()
                                                 .filter(product -> product.category.equals("Electronics"))
                                                 .filter(product -> product.price <= 600)
                                                 .filter(product -> product.rating >= 4.0)
                                                 .collect(Collectors.toList());

        System.out.println("Filtered Products: " + filteredProducts);
    }

    // 3. Filter job applicants
    public static void filterJobApplicants() {
        class Applicant {
            int id;
            String name;
            List<String> skills;
            int yearsOfExperience;

            Applicant(int id, String name, List<String> skills, int yearsOfExperience) {
                this.id = id;
                this.name = name;
                this.skills = skills;
                this.yearsOfExperience = yearsOfExperience;
            }

            @Override
            public String toString() {
                return "Applicant{" + "id=" + id + ", name='" + name + '\'' + ", skills=" + skills + ", yearsOfExperience=" + yearsOfExperience + '}';
            }
        }

        List<Applicant> applicants = Arrays.asList(
            new Applicant(1, "Alice", Arrays.asList("Java", "Spring"), 5),
            new Applicant(2, "Bob", Arrays.asList("Python", "Django"), 3),
            new Applicant(3, "Charlie", Arrays.asList("Java", "Spring", "Microservices"), 7)
        );

        List<Applicant> filteredApplicants = applicants.stream()
                                                       .filter(applicant -> applicant.skills.contains("Java"))
                                                       .filter(applicant -> applicant.yearsOfExperience >= 5)
                                                       .collect(Collectors.toList());

        System.out.println("Filtered Applicants: " + filteredApplicants);
    }

    // 4. Filter messages in a chat app
    public static void filterMessages() {
        List<String> messages = Arrays.asList(
            "Alice: Hi, how are you?",
            "Bob: Can we meet tomorrow?",
            "Charlie: Java streams are powerful",
            "Alice: Let's discuss the project"
        );

        List<String> filteredMessages = messages.stream()
                                                .filter(message -> message.contains("project"))
                                                .collect(Collectors.toList());

        System.out.println("Filtered Messages: " + filteredMessages);
    }

    // 5. Filter available flights
    public static void filterFlights() {
        class Flight {
            int id;
            String airline;
            String departureTime; // e.g., "10:00 AM"
            double price;

            Flight(int id, String airline, String departureTime, double price) {
                this.id = id;
                this.airline = airline;
                this.departureTime = departureTime;
                this.price = price;
            }

            @Override
            public String toString() {
                return "Flight{" + "id=" + id + ", airline='" + airline + '\'' + ", departureTime='" + departureTime + '\'' + ", price=" + price + '}';
            }
        }

        List<Flight> flights = Arrays.asList(
            new Flight(1, "Airline A", "10:00 AM", 300.0),
            new Flight(2, "Airline B", "12:00 PM", 250.0),
            new Flight(3, "Airline A", "02:00 PM", 350.0),
            new Flight(4, "Airline C", "08:00 AM", 200.0)
        );

        List<Flight> filteredFlights = flights.stream()
                                              .filter(flight -> flight.airline.equals("Airline A"))
                                              .filter(flight -> flight.departureTime.compareTo("09:00 AM") > 0)
                                              .filter(flight -> flight.price <= 300.0)
                                              .collect(Collectors.toList());

        System.out.println("Filtered Flights: " + filteredFlights);
    }
}
