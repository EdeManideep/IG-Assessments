package com.ig.Stream_API_Tasks_author;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class AuthorServiceImpl implements AuthorService {

    // Get unique surnames in uppercase
    @Override
    public Set<String> getUniqueSurnames(List<Author> authorList) {
        return authorList.stream()
                         .map(author -> author.getSurname().toUpperCase()) // Convert surname to uppercase
                         .collect(Collectors.toSet()); // Collect unique surnames
    }

    // Get all authors by city
    @Override
    public List<Author> getAuthorsByCity(List<Author> authorList, String city) {
        return authorList.stream()
                         .filter(author -> author.getCity().equalsIgnoreCase(city)) // Match city
                         .collect(Collectors.toList()); // Collect into a List
    }

    // Get the average age of female authors
    @Override
    public double femaleAverageAge(List<Author> authorList) {
        return authorList.stream()
                         .filter(author -> "female".equalsIgnoreCase(author.getGender())) // Filter female authors
                         .mapToDouble(author -> Period.between(author.getBirthdate(), LocalDate.now()).getYears()) // Calculate age
                         .average()
                         .orElse(0.0); // Return 0.0 if no female authors
    }

    // Get mobile number by Aadhaar card
    @Override
    public Long getMobileByAdhar(List<Author> authorList, Long adharCard) {
        return authorList.stream()
                         .filter(author -> author.getAdharCard().equals(adharCard)) // Match Aadhaar number
                         .map(Author::getMobile) // Extract mobile number
                         .findFirst()
                         .orElse(null); // Return null if not found
    }
    
    public static void main(String[] args) {
        List<Author> authors = Arrays.asList(
            new Author(123456789012L, "Sharma", "Rahul", "Kumar", LocalDate.of(1985, 5, 12), "Male", "Delhi", 9876543210L),
            new Author(987654321012L, "Verma", "Sneha", "Devi", LocalDate.of(1990, 8, 22), "Female", "Mumbai", 8765432109L),
            new Author(567890123456L, "Sharma", "Ananya", "Rao", LocalDate.of(1995, 3, 5), "Female", "Delhi", 7654321098L),
            new Author(456123789012L, "Patel", "Amit", "Singh", LocalDate.of(1987, 11, 30), "Male", "Bangalore", 6543210987L)
        );

        AuthorService authorService = new AuthorServiceImpl();

        // 🔹 Test: Get Unique Surnames
        Set<String> uniqueSurnames = authorService.getUniqueSurnames(authors);
        System.out.println("Unique Surnames (Uppercase): " + uniqueSurnames);

        // 🔹 Test: Get Authors By City
        List<Author> delhiAuthors = authorService.getAuthorsByCity(authors, "Delhi");
        System.out.println("Authors in Delhi: " + delhiAuthors.size());

        // 🔹 Test: Female Average Age
        double avgFemaleAge = authorService.femaleAverageAge(authors);
        System.out.println("Average Female Age: " + avgFemaleAge);

        // 🔹 Test: Get Mobile by Aadhaar
        Long mobileNumber = authorService.getMobileByAdhar(authors, 567890123456L);
        System.out.println("Mobile Number for Aadhaar 567890123456: " + mobileNumber);
    }
}
