package org.example.streams.filter;

import java.util.*;
import java.util.stream.Collectors;

public class FilterWebData {
    public static void main(String[] args) {

//        Filter user input (e.g., validate and sanitize email addresses).
//                Filter a table in a web page using search criteria.
//                Filter API responses based on query parameters.
//        Filter content in a paginated list based on user preferences.
//        Filter logs in a web application by severity level (INFO, ERROR, etc.).
//                Filter posts or comments in a social media app by a keyword.

                // Example API response (mock data)
        List<Map<String, Object>> users = Arrays.asList(
            Map.of("id", 1, "name", "Alice", "age", 25),
            Map.of("id", 2, "name", "Bob", "age", 30),
            Map.of("id", 3, "name", "Charlie", "age", 35)
        );

        List<Map<String, Object>> tableData = Arrays.asList(
                Map.of("id", 1, "name", "Alice", "age", 25),
                Map.of("id", 2, "name", "Bob", "age", 30),
                Map.of("id", 3, "name", "Charlie", "age", 35)
        );


        tableData.stream().filter(name->name.get("name").toString().contains("Al")).forEach(p-> System.out.println(p));

        tableData.stream().filter(age->(int)age.get("age")>=30).forEach(p-> System.out.println(p));

        List<String> paginatedContent = Arrays.asList("Item 1", "Item 2", "Item 3", "Item 4", "Item 5");

// User preference: Show items containing "3" or "4"
        List<String> filteredContent = paginatedContent.stream()
                .filter(content -> content.contains("3") || content.contains("4"))
                .collect(Collectors.toList());

        System.out.println("Filtered Content: " + filteredContent);
        List<String> logs = Arrays.asList(
                "INFO: User logged in",
                "ERROR: Database connection failed",
                "INFO: User updated profile",
                "ERROR: Invalid user input"
        );

// Filter logs by severity level "ERROR"
        logs.stream().filter(log->log.startsWith("ERROR")).forEach(p-> System.out.println(p));

        List<String> posts = Arrays.asList(
                "This is a great day!",
                "Java streams are powerful",
                "Stream filter is amazing",
                "I love coding with Java"
        );

// Keyword to search for
        String keyword = "Java";

        posts.stream().filter(key->key.contains(keyword)).forEachOrdered(p-> System.out.println(p));
    }
}
